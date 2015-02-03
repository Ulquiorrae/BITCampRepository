import java.util.Scanner;
public class PosljednjaRijecURecenici {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jednu rečenicu: ");
		String recenica=in.nextLine();
		
		String recenicaTrimmed=recenica.trim();
		
		String zadnjaRijec=recenicaTrimmed.substring(recenicaTrimmed.lastIndexOf(" ")+1);
		
		System.out.println("Zadnja riječ u unesenoj rečenici je: "+zadnjaRijec);
		
	}
}
