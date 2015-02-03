import java.util.InputMismatchException;
import java.util.Scanner;
public class DjeljivostSaSumomCifara {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int broj=unesiInteger();
		
		int[]niz=new int[broj];
		
		niz=djeljiviSaSumomCifara(broj);
		
		ispisiNiz(niz);
	}

	
	/**
	 * Funkcija samo ispisuje članove niza
	 * @param niz
	 */
	private static void ispisiNiz(int[]niz) {
		 
		for(int i=0;i<niz.length;i++){
			
			if(niz[i]!=0){
				
				if(niz[i+1]==0){
					System.out.print(niz[i]);
					break;
				}
				System.out.print(niz[i]+","); 
			}
		}
	}

	
	/**
	 * Funkcija ima zadatak da primi broj kao granicu polusegmenta i da vrati niz koji sadrži brojeve djeljive sa sumom svojih cifara
	 * @param broj
	 * @return niz integera koji predstavljaju brojeve u polusegmentu [1,broj) a koji su djeljivi sa sumom svojih cifara
	 */
	private static int[] djeljiviSaSumomCifara(int broj) {
		
		int j=0;
		
		int[]niz=new int[broj];
		
		for(int i=1;i<broj;i++){
			
			if(i%sumaCifara(i)==0){
				
				niz[j]=i;
			}
			else j--;
			j++;
		}
		
		return niz;
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

}