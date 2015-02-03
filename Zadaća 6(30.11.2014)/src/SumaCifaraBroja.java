import java.util.InputMismatchException;
import java.util.Scanner;
public class SumaCifaraBroja {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int broj=unesiInteger();
		
		int sumaCifara=sumaCifara(broj);
		
		System.out.printf("Suma cifara broja %d je: %d",broj,sumaCifara);
		
	}
	
	/**
	 * Funkcija ima zadatak da sabere sve cifre uensenog broja koji je proslijeđen funkciji.
	 * @param broj - Broj tipa integer koji se unosi sa tastature.
	 * @return suma cifara tipa integer
	 */
	private static int sumaCifara(int broj) {

		int suma=0;
		int cifra=0;
		
		while(broj!=0){
			
			cifra=broj%10;
			suma=suma+cifra;
			broj=broj/10;
		}
		
		return suma;
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
