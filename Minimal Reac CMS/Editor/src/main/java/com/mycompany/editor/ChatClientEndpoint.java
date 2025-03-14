/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.editor;

import jakarta.websocket.CloseReason;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 *
 * @author carlos
 */

@ServerEndpoint(value = "/app")
public class ChatClientEndpoint {
    @OnOpen
	public void onOpen(Session session) {
		System.out.println("Connected, sessionID = " + session.getId());
	}
	
	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println("Received from client: " + message); // Mostrar en consola

		if (message.equals("quit")) {
			try {
				session.close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Bye!"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				// Enviar el mensaje de vuelta al cliente
				session.getBasicRemote().sendText("Server received: " + message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@OnClose
	public void onClose(Session session, CloseReason closeReason) {
		System.out.println("Session " + session.getId() +
			" closed because " + closeReason);
	}
}
