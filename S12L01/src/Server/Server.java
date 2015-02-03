package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import GUI.ChatGUI;

public class Server {

	public static final int port = 1717;
	
	public static void serverStart() throws IOException {
		ServerSocket server = new ServerSocket(port);
		
		while(true) {
			String str = "Waiting for connection...";
			System.out.println(str);
			Socket client = server.accept();
			ChatGUI gui = new ChatGUI(client);
			new Thread(gui).start();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		serverStart();
		
	}
}
