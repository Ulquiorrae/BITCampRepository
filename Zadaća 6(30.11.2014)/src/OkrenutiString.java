import java.util.Scanner;
public class OkrenutiString {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jedan string: ");
		String recenica=in.nextLine();
		
		String okrenutistring=okreniString(recenica);
		
		System.out.println("Okrnuti uneseni string je: "+okrenutistring);
	}

	/**
	 * Funkcija prima string i vraća string koji predstavlja inicijalni string ispisan unazad
	 * @param recenica
	 * @return String
	 */
	private static String okreniString(String recenica) {

		String temp;
		String okrenutistring="";
		
		for(int i=recenica.length()-1;i>=0;i--){
			
			okrenutistring=okrenutistring+recenica.charAt(i);;
			
		}
		
		return okrenutistring;
	}

}
