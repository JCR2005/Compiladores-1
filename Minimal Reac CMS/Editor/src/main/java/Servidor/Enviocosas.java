package Servidor;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.CloseReason;
import jakarta.websocket.DeploymentException;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import org.glassfish.tyrus.client.ClientManager;

@ClientEndpoint
public class Enviocosas {

    private String responseMessage;
    private CountDownLatch latch;
    private Session userSession;

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("🟢 Conectado al servidor, session ID: " + session.getId());
        userSession = session;
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("📩 Respuesta recibida del servidor: " + message);
        this.responseMessage = message;
        if (latch != null) {
            System.out.println("✅ latch.countDown() ejecutado"); // <-- Ver si llega aquí
            latch.countDown();
        } else {
            System.err.println("⚠️ latch es null en onMessage");
        }
        cerrarConexion();
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        System.out.println("🔴 Conexión cerrada: " + reason);
    }

    /**
     * Envía el mensaje al servidor, espera la respuesta, cierra la conexión y
     * retorna el mensaje recibido.
     */
  public String enviarPeticion(String peticionSHTTP) {
    latch = new CountDownLatch(1);
    System.out.println("🚀 Enviando petición: " + peticionSHTTP);
    ClientManager client = ClientManager.createClient();

    try {
        URI uri = new URI("ws://localhost:8025/folder/app");
        userSession = client.connectToServer(this, uri);

        if (userSession != null && userSession.isOpen()) {
            System.out.println("📤 Enviando mensaje: " + peticionSHTTP);
            userSession.getBasicRemote().sendText(peticionSHTTP);
        } else {
            System.out.println("❌ No se pudo enviar el mensaje, sesión cerrada.");
            return null;
        }

        System.out.println("⏳ Esperando respuesta...");
        latch.await();
        System.out.println("⏩ Continuando ejecución después de latch.await()");
        
    } catch (DeploymentException | URISyntaxException | IOException | InterruptedException e) {
        Logger.getLogger(Enviocosas.class.getName()).log(Level.SEVERE, null, e);
    }
    
    System.out.println("🎯 responseMessage final: " + responseMessage);
    return responseMessage;
}


    private void cerrarConexion() {
        if (userSession != null && userSession.isOpen()) {
            try {
                userSession.close();
                System.out.println("✅ Sesión WebSocket cerrada correctamente.");
            } catch (IOException e) {
                Logger.getLogger(Enviocosas.class.getName()).log(Level.SEVERE, "❌ Error al cerrar la sesión WebSocket", e);
            }
        }
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
