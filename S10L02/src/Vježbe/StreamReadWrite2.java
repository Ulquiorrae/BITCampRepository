package Vježbe;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class StreamReadWrite2 {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = 0;
		}
	}

	public static void main(String[] args) {

		FileInputStream fs = null;
		Reader is;
		
		byte[] inputBuffer = new byte[10];
		
		OutputStream os = new DataOutputStream(System.out);
		StringBuilder outputBuilder = new StringBuilder();
		FileOutputStream ofs;

		try {
			fs = new FileInputStream("./Folder/Input.txt");
			is = new InputStreamReader(fs);
			BufferedReader bs = new BufferedReader(is);
			
			ofs = new FileOutputStream("./Folder/input.txt", true);
			os = new DataOutputStream(ofs);
			
			int numRead = 0;
//			while ((numRead = is.read(inputBuffer)) >= 0) {
//				outputBuilder.append(new String(inputBuffer));
//				os.write(inputBuffer);
//				cleanBuffer(inputBuffer, numRead);
//			}
			String lineString ="";
			
			
			while((lineString = bs.readLine()) != null) {
				outputBuilder.append(lineString).append("\n");
			}
			os.write(outputBuilder.toString().getBytes());
			System.out.println("Reading over.");
//			String outputString = outputBuilder.toString();
//			os.write(outputString.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
