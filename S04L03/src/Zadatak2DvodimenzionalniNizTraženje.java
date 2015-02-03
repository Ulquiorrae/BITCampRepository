import java.util.Scanner;
public class Zadatak2DvodimenzionalniNizTraženje {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int brojRedova;
		int brojKolona;
		int broj;
		int indexi[]=new int[2];
		
		System.out.println("Unesi broj redova: ");
		brojRedova=in.nextInt();
		
		System.out.println("Unesi broj kolona: ");
		brojKolona=in.nextInt();
		
		int niz[][]=new int[brojRedova][brojKolona];
		
		niz=unesi2DNiz(brojRedova,brojKolona);
		
//		ispisiNiz(niz);
		
		System.out.println("Unesi broj koji želiš tražiti u 2D nizu: ");
		broj=in.nextInt();
		
		indexi=trazi(niz, broj);
		
		System.out.printf("Uneseni broj %d se u nizu nalazi na poziciji: [%d][%d].",broj,indexi[0],indexi[1] );
	}

	/**
	 * Funkcija prima dvodimenzionalni niz i broj
	 * @param niz
	 * @param broj
	 * @return niz brojeva
	 */
	private static int[] trazi(int[][] niz, int broj) {

		int indexi[]=new int[2];
		
		for(int i=0; i<niz.length;i++){
			for(int j=0; j<niz[i].length; j++){
				if(niz[i][j]==broj){
					indexi[0]=i;
					indexi[1]=j;
					break;
				}
			}
			System.out.println();
		}
		return indexi;
	}

	/**
	 * Funkcija ispisuje dvodimenzionalni niz na ekran.
	 * @param niz
	 */
	private static void ispisiNiz(int[][] niz) {
		for(int i=0; i<niz.length;i++){
			for(int j=0; j<niz[i].length; j++){
				System.out.print(niz[i][j]);
			}
			System.out.println();
		}
		
	}

	/**
	 * Funkciaj prima broj redova i kolona i korisnik sa tastature unosi brojeve te popunjava elemente dvodimenzionalnog niza.
	 * @param brojRedova
	 * @param brojKolona
	 * @return dvodimenzionalni niz integera
	 */
	private static int[][] unesi2DNiz(int brojRedova, int brojKolona) {
		Scanner in=new Scanner(System.in);
		
		int niz[][]=new int[brojRedova][brojKolona];
		
		for(int i=0; i<brojRedova; i++){
			for(int j=0; j<brojKolona; j++){
				niz[i][j]=in.nextInt();
			}
		}
		return niz;
	}
}
