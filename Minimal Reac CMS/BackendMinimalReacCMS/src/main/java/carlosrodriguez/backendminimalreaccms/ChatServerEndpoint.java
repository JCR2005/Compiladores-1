package carlosrodriguez.backendminimalreaccms;

import Compilador.Compilador;
import Flujo.Flujo;
import java.io.IOException;
import jakarta.websocket.CloseReason;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.CloseReason.CloseCodes;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/app")
public class ChatServerEndpoint {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected, sessionID = " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("Received 2222 client: " + message);

        Flujo flujo = new Flujo();
        flujo.flujo(message);

        if (session.isOpen()) {
            try {
                
                session.getBasicRemote().sendText(flujo.empaquetado());
                System.out.println("Mensaje enviado al cliente: Te envío la respuesta: " + flujo.empaquetado());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo enviar el mensaje, la sesión está cerrada.");
        }

    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println("Session " + session.getId()
                + " closed because " + closeReason);
    }
}
