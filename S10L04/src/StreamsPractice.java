import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class StreamsPractice {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++) {
			buffer[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		InputStream is = new DataInputStream(System.in);
		byte[] inputBuffer = new byte[20];
		
		OutputStream os = new DataOutputStream(System.out);
		StringBuilder outputBuilder = new StringBuilder();
		
		System.out.println("Enter a sentence: ");
		
		try {
			int numRead = 0;
			while ((numRead = is.read(inputBuffer)) >= 0) {

				outputBuilder.append(new String(inputBuffer));
				cleanBuffer(inputBuffer, numRead);

			}
			System.out.println("Citanje zavrseno");
			String outputString = outputBuilder.toString();
			os.write(outputString.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
