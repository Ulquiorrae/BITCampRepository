package Client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import GUI.ChatGui;
import GUI.LoginGui;

public class Client {
	public static final int port = 1713;
	public static final String host = "localhost";
	
	
	public static void main(String[] args) {
		
		LoginGui login = new LoginGui(host, port);
		
		
	}
}