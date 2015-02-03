import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestFileReader {

	public static void main(String[] args) {
		Scanner in;
		
		try {
			in=new Scanner(new File("src/TestFileWrite.java"));
			while(in.hasNext()){
				
				System.out.println(in.nextLine());
				
			}
		} catch (FileNotFoundException e) {

			
			
			e.printStackTrace();
		}
		
	}
	
}
