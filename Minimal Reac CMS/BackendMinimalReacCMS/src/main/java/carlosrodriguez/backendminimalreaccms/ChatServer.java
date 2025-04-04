package carlosrodriguez.backendminimalreaccms;

import org.glassfish.tyrus.server.Server;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {

    public static void main(String[] args) {

        Set<Class<?>> endpoints = new HashSet<>();
        endpoints.add(ChatServerEndpoint.class);

        Map<String, Object> properties = new HashMap<>();

        Server server = new Server("localhost", 8025, "/folder", properties, endpoints);

        try {
            server.start();
            System.out.println("--- server is running");
            while (true) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }
}
