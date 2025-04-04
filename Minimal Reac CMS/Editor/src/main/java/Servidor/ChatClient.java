package Servidor;

import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.glassfish.tyrus.server.Server;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatClient {

    public String meString;  
    private volatile boolean running = true;
    private static ChatClient instance; 

    public ChatClient() {
        instance = this; 
    }

    public void stopServer() {
        running = false;
    }

    public void servidor() {
        Set<Class<?>> endpoints = new HashSet<>();
        endpoints.add(ChatClientEndpoint.class);  
        Map<String, Object> properties = new HashMap<>();
        Server server = new Server("localhost", 8080, "/folder", properties, endpoints);

        try {
            server.start();
            System.out.println("--- server is running");

            while (running) {
                if (meString != null && !meString.isEmpty()) {
                    System.out.println("Current message: " + meString);
                }
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }

    @ServerEndpoint(value = "/app")
    public static class ChatClientEndpoint {

        private Session session;

        @OnOpen
        public void onOpen(Session session) {
            this.session = session;
            System.out.println("Connected, sessionID = " + session.getId());
        }

        @OnMessage
        public void onMessage(String message, Session session) {
            System.out.println("Received message: " + message);

            if (instance != null) {
                instance.meString = message;  // Guardar el mensaje en la instancia global
            }

            if (message.equals("quit")) {
                try {
                    session.close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Bye!"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    session.getBasicRemote().sendText("Server received: " + message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @OnClose
        public void onClose(Session session, CloseReason closeReason) {
            System.out.println("Session " + session.getId() + " closed because " + closeReason);
        }
    }
}
