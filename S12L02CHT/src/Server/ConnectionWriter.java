package Server;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ConnectionWriter extends Thread {

	public static HashMap<String, OutputStream> connections = new HashMap<String, OutputStream>();

	private Set<String> set = connections.keySet();

	@Override
	public void run() {
		while (true) {
			if (Message.hasNext()) {
				System.out.println("WRITER: " + Message.hasNext()); //test
				Message msg = Message.next();

				byte[] msgByte = ((msg.getSender() + ": " + msg.getContent()).getBytes());

				Iterator<String> iterator = set.iterator();
				while (iterator.hasNext()) {
					String current = iterator.next();
					if (!current.equals(msg.getSender())) {
						OutputStream os = connections.get(current);
						try {
							os.write(msgByte);
							os.flush();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}

			}
		}
	}

}
