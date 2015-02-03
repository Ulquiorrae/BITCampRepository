import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int duzinaNiza;
		int suma;
		double prosjek;
		
		System.out.println("Unesi koliko elemenata želiš da ima tvoj niz: ");
		duzinaNiza=in.nextInt();
		
		int[]niz=new int[duzinaNiza];
		
		unesiElemente(niz,duzinaNiza);
		
		for(int i=0;i<duzinaNiza;i++){
			System.out.println(niz[i]);
		}
		
		suma=sumaNiza(niz);
		
		System.out.println("Suma je:" +suma);
		
		prosjek=dajProsjek(niz);
		
		
		System.out.println("Srednja vrijednost elemenata niza je: "+prosjek);
		
	}

	/**
	 * Ova funkcija prima niz od "dunaNiza" elemenata i vraća srednju vrijednost elemenata niza
	 * @param niz integera
	 * @return Srednja vrijednost elemenata niza kao double
	 */
	private static double dajProsjek(int[] niz) {

		double prosjek;
		int brojac=0;
		double suma=0;
		
		for(int i=0;i<niz.length;i++){
			
			suma=suma+niz[i];
			brojac++;
			
		}
		
		prosjek=suma/brojac;
		
		
		return prosjek;
	}

	/**
	 * Ova funkcija vraća sumu svih lemenata unesenog niza
	 * @param niz integera
	 * @return sumu elemnata niza
	 */
	private static int sumaNiza(int[] niz) {

		int suma=0;
		
		for(int i=0;i<niz.length;i++){
			
			suma=suma+niz[i];
			
		}
		
		return suma;
	}

	/**
	 * Ova funkcija služi za unos elemenata niza
	 * @param niz integera
	 * @param duzinaNiza - veličina niza koji se unosi
	 */
	private static void unesiElemente(int[] niz,int duzinaNiza) {

		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<duzinaNiza;i++){
			
			niz[i]=in.nextInt();
			
		}
		
	}

}
