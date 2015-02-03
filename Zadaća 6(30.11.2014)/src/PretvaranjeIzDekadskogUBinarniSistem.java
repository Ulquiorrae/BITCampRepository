import java.util.InputMismatchException;
import java.util.Scanner;
public class PretvaranjeIzDekadskogUBinarniSistem {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);

		int broj=unesiInteger();
		
		String binarniBroj=getBinar(broj);
		System.out.printf("Broj %d u binarnom obliku : %s",broj,binarniBroj);
	}
	
	/**
	 * Funkcija prima jedan cijeli broj u dekadskom obliku a vraća String koji predstavlja taj broj u binarnom obliku.
	 * @param broj
	 * @return String
	 */
	private static String getBinar(int broj) {

		String binarniBroj="";
		String reverse="";
		int temp;
		int brojac=0;
		
		while(broj!=0){
			temp=broj%2;
			binarniBroj=binarniBroj+temp;
			brojac++;
			broj=broj/2;
		}
		while(brojac!=8) {
			
			binarniBroj=binarniBroj+0;
			brojac++;
		}
		for(int i=binarniBroj.length()-1;i>=0;i--) reverse=reverse+binarniBroj.charAt(i);
		
		return reverse;
	}
	

	/**
	 * Funkcija provjerava validnost unosa. Izbacuje grešku ukoliko korisnik umjesto traženog broja unese neki drugi tip varijable.
	 * @return none
	 */
	private static int unesiInteger() {
		
		Scanner in=new Scanner(System.in);
		
		while(true){
			System.out.println("Unesi jedan cijeli broj: ");
			try{
				System.out.println();
				int broj=in.nextInt();
				return broj;
			}
			catch(InputMismatchException exception){
				
				System.out.println("Molimo vas da unesete cijeli broj!");
				in.nextLine();
				
			}
		}
	}
}
