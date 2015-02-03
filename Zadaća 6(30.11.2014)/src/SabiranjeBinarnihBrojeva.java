import java.util.Scanner;
public class SabiranjeBinarnihBrojeva {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		int broj1=unesiPozitivanBroj();
		int broj2=unesiPozitivanBroj();
		
		int binar1[]=new int[8];
		int binar2[]=new int[8];
		int zbir[]=new int[8];
		
		binar1=pretvoriUBinarniBroj(broj1);
		binar2=pretvoriUBinarniBroj(broj2);
		
		zbir=saberiBinarneBrojeve(binar1,binar2);
		
		ispisiRezultat(broj1, broj2, zbir);
		
		}
	
	
	/**
	* Funkcija estetski lijepo ispisuje sve članove niza integera(članovi niza sadrže cifre binarnog oblika broja).
	 * @param broj
	 * @param broj2
	 * @param zbir - niz cijelih brojeva
	 */
	private static void ispisiRezultat(int broj1, int broj2, int[] zbir) {

			System.out.printf("Suma brojeva %d i %d u binarnom obliku: ",broj1,broj2);
			for(int i=0;i<zbir.length;i++){

				System.out.print(zbir[i]+" ");
			}
	}

	/**
	 * Funkcija prima 2 binarna broja kao niz integera(svaki elemenat niza je jedna cifra binarnog broja) i sabina ta dva broja.
	 * @param binar1
	 * @param binar2
	 * @return niz integera
	 */
	private static int[] saberiBinarneBrojeve(int[] binar1, int[] binar2) {
		int zbir[]=new int[]{0,0,0,0,0,0,0,0};
		int zbirCifara;
		int ostatak=0;
		for(int i=zbir.length-1; i>=0; i--){
			
			zbirCifara= binar1[i] + binar2[i] + ostatak;
			ostatak=0;
			
			if(zbirCifara==2){
				zbirCifara=0;
				ostatak=1;
			}
			if(zbirCifara==3){
				zbirCifara=1;
				ostatak=1;
			}
			zbir[i]=zbirCifara;
		}
		return zbir;
	}



	/**
	 * Funkcija kao parametar prima broj unesen sa tastature i vraća niz integera u 
	 * kojem svaki element predstavlja jednu cifru binarnog oblika tog broja.
	 * @param broj
	 * @return niz integera
	 */
	private static int[] pretvoriUBinarniBroj(int broj1) {

	int[]cifre=new int[8];
	int cifra;
	int i=cifre.length-1;
	
	while(broj1!=0){
		cifra=broj1%2;
		cifre[i]=cifra;
		i--;
		broj1=broj1/2;
	}
	return cifre;
	}


/**
 	* Funkcija vraća uneseni broj ali samo ako je nesen pozitivan broj.
 * @return integer
 */
	private static int unesiPozitivanBroj() {
	
	Scanner in=new Scanner(System.in);
	
	System.out.println("Unesi jedan pozitivan cijeli broj: ");
	int broj=in.nextInt();
	while(!pozitivanBroj(broj)){
		System.out.println("Uneseni broj nije pozitivan broj! Unesi jedan pozitivan broj: ");
		broj=in.nextInt();
	}
	return broj;
}

	
/**
 	* Funkcija prima kao parametar jedan broj i provjerava da li je on pozitivan.
 * @param broj tipa integer
 * @return true ukoliko je broj pozitivan, u suprotnom return false
 */
	private static boolean pozitivanBroj(int broj) {
	if(broj>0) return true;

	return false;
}
}
