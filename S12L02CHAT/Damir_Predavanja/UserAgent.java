package Damir_Predavanja;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class UserAgent {

	public static void main(String[] args) {
		System.out.println("Starting HTTP client...");
		try {
			Socket connection = new Socket("localhost", 1213);
			OutputStream os = connection.getOutputStream();
			Writer w = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(w);
				
			pw.println("GET index.html");
			pw.println();
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Client is done!");
		
	}
}
