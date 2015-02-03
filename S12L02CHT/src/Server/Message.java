package Server;

import java.util.LinkedList;
import java.util.Queue;

public class Message {

	private String content;
	private String sender;
	volatile static Queue<Message> msgQueue = new LinkedList<Message>();
	
	public String getSender() {
		return sender;
	}
	
	public String getContent() {
		return content;
	}

	

	public Message(String content, String sender) {
		this.content = content + "\n";
		this.sender = sender;
		msgQueue.add(this);  //svaki put kad se napravi message, doda ga u que.
	}

	public static boolean hasNext() {
		return !msgQueue.isEmpty();
	} 
	
	//metoda koja vraca i uklanja iz queue
	public static Message next() {
		return msgQueue.poll();
	}

	
	
	
	
}
