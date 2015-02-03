import java.util.Scanner;
public class Prosjek {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int brojRedova;
		int brojKolona;
		int broj;
		
		System.out.println("Unesi broj redova: ");
		brojRedova=in.nextInt();
		
		System.out.println("Unesi broj kolona: ");
		brojKolona=in.nextInt();
		
		int niz[][]=new int[brojRedova][brojKolona];
		
		niz=ViseNula.unesi2DNiz(brojRedova,brojKolona);
		
//		ViseNula.ispisiNiz(niz);
		
		prosjeci(niz);
		
	}

	private static void prosjeci(int[][] niz) {

		double prosjekReda;
		
		for(int i=0; i<niz.length; i++){
			
		}
		
		
		
	}

}
