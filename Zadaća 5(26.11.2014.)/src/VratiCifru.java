import java.util.InputMismatchException;
import java.util.Scanner;
public class VratiCifru {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int broj,indexCifre,brojCifri,cifra;
		
		broj=unesiInteger();
		brojCifri=prebrojCifre(broj);
		indexCifre=unesiInteger();
		cifra=vratiCifru(broj,indexCifre);
		System.out.printf("%d. cifra unesenog broja je: %d\n",indexCifre,cifra);
	}
	
	/**
	 * Ova funkcija ima zadatak da prebroji koliko cifara ima uneseni broj
	 * @param Broj tipa integer
	 * @return Broj tipa integer koji predstavlja broj cifri unesenog broja
	 */
	private static int prebrojCifre(int broj) {
		
		int brojCifri=0;
		
		while(broj!=0){
			
			broj=broj%10;
			brojCifri++;
			broj=broj/10;
			
		}
		return brojCifri;
		
	}

 /** 
 * Funkcija ima zadatak da vrati vrijednost cifre koja se nalazi na poziciji koju korisnik unosi sa tastature u "main" funkciji.
 * @param broj - Uneseni broj tipa integer.
 * @param indexCifre - Index cifre koju želiš da saznaš iz broja.
 * @return Vrijednost cifre na poziciji "indexCifre" koja se unosi sa tastature.
 */
	private static int vratiCifru(int broj, int indexCifre) {
		
		int brojac=0;
		int cifra=0;
		while(broj!=0){
			
			cifra=broj%10;
			brojac++;
			if(brojac==indexCifre) break;
			broj=broj/10;
		}
		
		return cifra;
		
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
