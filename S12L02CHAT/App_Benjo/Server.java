package App_Benjo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;

public class Server {

	public static final int port = 1717;

	public static void serverStart() throws IOException {
		ServerSocket server = new ServerSocket(port);
		
		ConnectionWriter cw = new ConnectionWriter();
		cw.start();
		
		while (true) {
			String str = "waiting for connection";
			System.out.println(str);
			Socket client;
			try {
				client = server.accept();
				String clientName = handShake(client.getInputStream());
				System.out.println(clientName);
				if (clientName != null) {
					while (ConnectionWriter.connections.containsKey(clientName)) {
						clientName = clientName + new Random().nextInt(1000);
					}
					ConnectionWriter.connections.put(clientName,
							client.getOutputStream());
					ConnectionListener cl = new ConnectionListener(
							client.getInputStream(), clientName);
					cl.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String handShake(InputStream is) throws IOException {
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		str = br.readLine();
		if (str != null)
			return str;
		else
			return null;
	}
	

	public static void main(String[] args) {
		try {
			serverStart();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
