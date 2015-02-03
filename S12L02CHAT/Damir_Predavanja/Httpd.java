package Damir_Predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Httpd {

	public static void main(String[] args) {
		System.out.println("BITCamp HTTP server");
		try {
			ServerSocket listener = new ServerSocket(1213);
			while (true) {
				System.out.println("Waiting for connection...");
				Socket connection = listener.accept();
				System.out.println("Connected!");
				ConnectionHandler handler = new ConnectionHandler(connection);
				handler.start();
			}
		} catch (IOException e) {
			System.out.println("Can't open port 1213!");
			e.printStackTrace();
		}
		System.out.println("End of program MAIN!");
	}

	
	
	public static class ConnectionHandler extends Thread {
		private Socket connection;

		public ConnectionHandler(Socket connection) {
			super();
			this.connection = connection;
		}

		@Override
		public void run() {
			try {
				InputStream is = connection.getInputStream();
				Reader r = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(r);
				Scanner s = new Scanner(br); // zbog inputa

				while (s.hasNextLine()) {
					String line = s.nextLine();
//					try {
//						sleep(10000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					System.out.println(line);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
