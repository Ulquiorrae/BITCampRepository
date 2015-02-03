package Vježbe;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

import javax.swing.JFileChooser;

public class StreamReadWrite3 {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = 0;
		}
	}

	public static void main(String[] args) {

		JFileChooser filePicker = new JFileChooser();
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home") + "/Documents/workspace"));
		int open = filePicker.showOpenDialog(filePicker);
		while (open != filePicker.APPROVE_OPTION) {
			open = filePicker.showOpenDialog(filePicker);
		}
		
		String pickedFile = filePicker.getSelectedFile().getAbsolutePath();	//čuva path do fodlera i to proslijedimo dole u fs = new FileInputStream(OVDJE);

		
		int save = filePicker.showSaveDialog(filePicker);
		String saveFile = filePicker.getSelectedFile().getAbsolutePath();
		
		
		
		FileInputStream fs = null;
		Reader is;

		byte[] inputBuffer = new byte[10];

		OutputStream os = new DataOutputStream(System.out);
		StringBuilder outputBuilder = new StringBuilder();
		FileOutputStream ofs;

		try {
			fs = new FileInputStream(pickedFile);
			is = new InputStreamReader(fs);
			BufferedReader bs = new BufferedReader(is);

			ofs = new FileOutputStream(saveFile, true);
			os = new DataOutputStream(ofs);

			int numRead = 0;

			String lineString = "";

			while ((lineString = bs.readLine()) != null) {
				outputBuilder.append(lineString).append("\n");
			}
			os.write(outputBuilder.toString().getBytes());
			System.out.println("Reading over.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
