package carlosrodriguez.backendminimalreaccms;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.CloseReason;
import jakarta.websocket.DeploymentException;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.glassfish.tyrus.client.ClientManager;

/**
 *
 * @author carlos
 */
@ClientEndpoint
public class EnviarCosas {

    private static CountDownLatch latch;
    private static Session userSession; // Para almacenar la sesión y enviar mensajes después de la conexión

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("--- Connected to server at ws://localhost:8080/folder/app, session ID: " + session.getId());
        userSession = session;

        try {
            // Enviar un mensaje de bienvenida al servidor
            session.getBasicRemote().sendText("ME conecto al editor");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("--- Received from server: " + message);
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println("Session " + session.getId() + " closed because: " + closeReason);

    }

    public static void main(String[] args) {

        latch = new CountDownLatch(1);
        ClientManager client = ClientManager.createClient();
        try {
            // Conectar al servidor WebSocket en el puerto 8025 y el endpoint /folder/app
            URI uri = new URI("ws://localhost:8080/folder/app");
            client.connectToServer(EnviarCosas.class, uri);

            // Crear un hilo para leer mensajes desde la consola y enviarlos al servidor
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe un mensaje para enviar al servidor ('exit' para salir):");

            while (true) {
                String userMessage = reader.readLine();
                if ("exit".equalsIgnoreCase(userMessage)) {
                    break; // Salir del bucle si el usuario escribe 'exit'
                }
                if (userSession != null && userSession.isOpen()) {
                    userSession.getBasicRemote().sendText(userMessage);
                } else {
                    System.out.println("Sesión WebSocket cerrada, no se puede enviar mensajes.");
                    break;
                }
            }

            latch.await();
        } catch (DeploymentException | URISyntaxException | InterruptedException | IOException e) {
            Logger.getLogger(EnviarCosas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

   public void enviarPeticion(String peticionSHTTP) {
    ClientManager client = ClientManager.createClient();
    Session session = null;

    try {
        // Conectar al servidor WebSocket (asegúrate de que la URI y el puerto sean correctos)
        URI uri = new URI("ws://localhost:8080/folder/app");
        session = client.connectToServer(EnviarCosas.class, uri);

        // Enviar el mensaje recibido como parámetro
        if (session != null && session.isOpen()) {
            session.getBasicRemote().sendText(peticionSHTTP);
            System.out.println("Mensaje enviado: " + peticionSHTTP);
        } else {
            System.out.println("Sesión WebSocket cerrada, no se pudo enviar el mensaje.");
        }
    } catch (DeploymentException | URISyntaxException | IOException e) {
        Logger.getLogger(EnviarCosas.class.getName()).log(Level.SEVERE, null, e);
    } finally {
        // Cerrar la sesión inmediatamente después de enviar el mensaje
        if (session != null && session.isOpen()) {
            try {
                session.close();
                System.out.println("Sesión WebSocket cerrada correctamente.");
            } catch (IOException e) {
                Logger.getLogger(EnviarCosas.class.getName()).log(Level.SEVERE, "Error al cerrar la sesión WebSocket", e);
            }
        }
    }
}


}
