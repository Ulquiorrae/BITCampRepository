import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiplikativnaOtpornost {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int start,end,trazenaMO;
		int[]niz=new int[1000];
		int j=0;
		
		System.out.println("Unesi početak intervala: ");
		start=in.nextInt();
		
		System.out.println("Unesi kraj intervala: ");
		end=in.nextInt();

		System.out.println("Unesi traženu multiplikativnu otpornost: ");
		trazenaMO=in.nextInt();
		
		for(int i=start;i<=end;i++){
			
			if(multOtpornost(i)==trazenaMO){
				
				niz[j]=i;
			}
			else{
				j--;
			}
			j++;
		}
		System.out.printf("Brojevi u intervalu (%d,%d) koji imaju multiplikativnu otpornost %d su: ",start,end,trazenaMO);
		for(int i=0;i<niz.length;i++){
			
			if(niz[i]!=0){
				if(niz[i+1]==0) {
					System.out.print(niz[i]);
					break;
				}
			System.out.print(niz[i]+", ");
			}
		}
		}
		
	/**
	 * Funkcija treba da za primljenu vrijednost vrati Multiplikativnu Otpornost unesenog broja
	 * @param broj - Broj tipa integer koji se unosi sa tastature
	 * @return Vrijednost tipa integer koja predstavlja Multiplikativnu Otpornost unesenog broja
	 */
	private static int multOtpornost(int broj) {

		int temp=broj;
		int cifra;
		int brojac=1;
		int proizvod=1;
		
		while(true){
			
			while(temp!=0){
				cifra=temp%10;
				proizvod=proizvod*cifra;
				temp=temp/10;
			}
			
			if(proizvod<9) {
				break;
			}
			temp=proizvod;
			proizvod=1;
			brojac++;
		}
		return brojac;
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
