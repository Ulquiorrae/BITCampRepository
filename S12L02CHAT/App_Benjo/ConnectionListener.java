package App_Benjo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConnectionListener extends Thread {

	private InputStream is;
	private String sender;
	
	public ConnectionListener(InputStream is, String sender) {
		this.is = is;
		this.sender = sender;
	}

	@Override
	public void run() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(is));
		try {
			String str ="";
			while ((str = bf.readLine()) != null) {
				if(!str.equals("")) {
					Message incoming = new Message(str, sender); //dodavanje se nalazi u konstruktoru za Message
					System.out.println(incoming.getSender() + ": " + incoming.getContent());
					System.out.println("LISTENER: " + Message.hasNext()); //test
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
