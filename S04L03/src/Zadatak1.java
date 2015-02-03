import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	
		int velicinaNiza;
		int broj;
		
		System.out.println("Unesi veličinu niza: ");
		velicinaNiza=in.nextInt();
		
		int niz[]=new int[velicinaNiza];
		
		niz=unesiNiz(niz.length);
		
//		ispisiNiz(niz);
		
		System.out.println("Unesi broj koji želiš pronaći u nizu brojeva: ");
		broj=in.nextInt();
		
		int indexBroja=trazi(broj,niz);
		System.out.printf("Broj %d se nalazi na mjestu u nizu pod indexom: %d",broj,indexBroja);
	}

	/**
	 * Funkcija prima niz elemenata i jedan broj. Vraća index elementa na kojem se uneseni broj prvi put pojavljuje u nizu.
	 * @param broj
	 * @param niz
	 * @return integer
	 */

	 private static int trazi(int broj, int[] niz) {

		
		for(int i=0; i<niz.length; i++){
			if(niz[i] == broj){
				return i;
			}
		}
		
		return 0;
	}






	/**
     * Funkcija prima niz integera i ispisuje ih na ekran. Elementi su razdvojeni zarezom.	
	 * @param niz
	 */
	 private static void ispisiNiz(int[] niz) {

		System.out.print("Članovi unesenog niza redom: ");
		for(int i=0; i<niz.length; i++){
			
			if(i==niz.length-1){
				System.out.println(niz[i]);
				break;
			}
			System.out.printf(niz[i]+",");
			
		}
		
	}

	/**
	 * Funkcija prima dužinu niza i kontroliše unos elemenata niza.
	 * @param length
	 * @return niz integera
	 */
	 private static int[] unesiNiz(int length) {
		Scanner in=new Scanner(System.in);
		
		int niz[]=new int[length];
		int clan;
	
		for(int i=0; i<length; i++){
			
			System.out.printf("Unesi %d član niza: ", i+1);
			System.out.println();
			clan=in.nextInt();
			niz[i]=clan;
		}
		return niz;
	}
	 
	 
}
