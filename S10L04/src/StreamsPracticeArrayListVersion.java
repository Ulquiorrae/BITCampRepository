import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class StreamsPracticeArrayListVersion {

	/**
	 * This method cleans the buffer, sets all values to 0.
	 * @param buffer
	 */
	private static void cleanBuffer(byte[] buffer) {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = 0;
		}
	}

	
	public static void main(String[] args) throws IOException {

		InputStream is = new DataInputStream(System.in);
		byte[] inputBuffer = new byte[20];

		OutputStream os = new DataOutputStream(System.out);
		ArrayList<Byte> bufferedInput = new ArrayList<Byte>();

		while (is.read(inputBuffer) >= 0) {
			for (int i = 0; i < inputBuffer.length; i++) {
				if (inputBuffer[i] == (byte) ('\n')) {
					Iterator<Byte> myIterator = bufferedInput.iterator();
					while (myIterator.hasNext()) {
						os.write(myIterator.next());
					}
					os.flush();
				} else {
					bufferedInput.add(inputBuffer[i]);
				}
			}
		}
		cleanBuffer(inputBuffer);
	}
}
