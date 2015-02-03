package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import GUI.ChatGUI;

public class Client {

	public static final int port = 1717;
	public static final String host = "localhost";
	
	public static void main(String[] args) {
		
		try {
			Socket client = new Socket(host, port);
			ChatGUI gui = new ChatGUI(client);
			new Thread(gui).start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
