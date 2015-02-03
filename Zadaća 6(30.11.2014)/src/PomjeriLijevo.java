import java.util.InputMismatchException;
import java.util.Scanner;
public class PomjeriLijevo {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int duzinaNiza=unesiInteger();
		
		int[]niz=new int[duzinaNiza];
		
		niz=unesiNiz(duzinaNiza);
		
		int[]noviNiz=new int[duzinaNiza]; //Ovo će biti niz sa pomjerenim ciframa u lijevo.
		
		noviNiz=pomjeriLijevo(niz);
		
		for(int i=0;i<noviNiz.length;i++)
				{
					System.out.print(niz[i]+" ");
					
				}		
	}
	
	
	 /**
	  * Funkcija prima niz integera i vraća niz integera u kojem je svaki elemenat pomjeren u lijevo za jedan te je zadnji lement u nizu 0
	  * @param niz
	  * @return niz u kojem je svaka cifra pomjerena u lijevo
	  */
	 private static int[] pomjeriLijevo(int[] niz) {

		 for(int i=0;i<niz.length-1;i++){
			 
			 niz[i]=niz[i+1];
		 }	
		 niz[niz.length-1]=0;
		 return niz;
	}
	 
	 
	/**
	  * Funkcija prima dužinu niza tipa integer i vraća niz integera koji su uneseni sa tastature
	  * @param duzinaNiza
	  * @return niz integera
	  */
	 private static int[] unesiNiz(int duzinaNiza) {

		Scanner in=new Scanner(System.in);
		
		int[]niz=new int[duzinaNiza];
		
		for(int i=0;i<duzinaNiza;i++){
			niz[i]=in.nextInt();
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

}
