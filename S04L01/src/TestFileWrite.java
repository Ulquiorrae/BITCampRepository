import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class TestFileWrite {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		FileWriter fw;
		
			try {
				fw=new FileWriter(new File("test.txt"));
				fw.append("Evo jedan red!");
				fw.append('\n');
				fw.flush();
				fw.append("Drugi red!\nTreci red.");
				fw.append('\n');
				fw.close();
			} catch (IOException e) {

				
				e.printStackTrace();
			}
		
	}

}
