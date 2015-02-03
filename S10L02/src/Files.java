/**
 * Program koji ce traziti putanju foldera, uneseš putanju 
 * foldera kao : daiwdwa/dawhuidaw/dgwzadwa/, i da mi kaže koje fileove taj fodler sarži.
 */
import java.util.Scanner;
import java.io.File;

public class Files {

	public static void main(String[] args) {

		String folderName;
		File folder;
		String[] files;
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enter the directory name you want to check: ");
		folderName = scanner.nextLine().trim();
		
		folder = new File(folderName);
		
		if(folder.isDirectory() == false) {
			System.out.println("Unexisting directory!");
			return;
		}
		if(folder.exists() == false) {
			System.out.println("Not a directory!");
			return;
		}
		
		files = folder.list();
		System.out.println("Files in folder named " + folder + " are: ");
		
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
		
		
	}

}
