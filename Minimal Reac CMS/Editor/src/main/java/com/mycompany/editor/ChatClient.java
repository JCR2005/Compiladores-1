
package com.mycompany.editor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.glassfish.tyrus.server.Server;

/**
 *
 * @author carlos
 */
public class ChatClient {
      public static void main(String[] args) {
        // Crear un conjunto de configuraciones de endpoint
        Set<Class<?>> endpoints = new HashSet<>();
        endpoints.add(ChatClientEndpoint.class);  // Agregar tu clase de endpoint

        // Crear un mapa de propiedades, si es necesario (puedes dejarlo vacío si no lo necesitas)
        Map<String, Object> properties = new HashMap<>();

        // Crear el servidor con el constructor adecuado para la versión moderna de Tyrus
        Server server = new Server("localhost", 8080, "/folder", properties, endpoints);

        try {
            server.start();  // Iniciar el servidor
            System.out.println("--- server is running");
            while (true) { }  // Mantener el servidor en ejecución
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();  // Detener el servidor cuando termine
        }
    }
}
