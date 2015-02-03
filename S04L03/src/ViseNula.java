import java.util.Scanner;
public class ViseNula {

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
		
		int noviNiz[][]=new int[brojRedova][brojKolona];
		noviNiz=nulirajRedoveIKolone(niz,brojRedova,brojKolona);
		
		ispisiNiz(noviNiz);
		
	}
	
	/**
	 * Funkcija prima dvodimenzionalni niz, njegov broj redova i kolona a vraća taj isti niz u kojem su redovi i kolone koje imaju bar jednu nulu u sebi nulirane.
	 * @param niz
	 * @param brRedova
	 * @param brKolona
	 * @return dvodimenzionalni niz
	 */
	private static int[][] nulirajRedoveIKolone(int[][] niz, int brRedova, int brKolona) {
		
		int idxX=0,idxY=0;
		int brojac=0;
		int nule[]=new int[100];
		int x[]=new int[100];
		int y[]=new int[100];
		
		for(int i=0; i<niz.length; i++){
			for(int j=0; j<niz[i].length; j++){
				if(niz[i][j]==0){
					
					x[brojac]=i;
					y[brojac]=j;
					brojac++;
				}
			}
		}
		if(brojac>0){
		for(int i=0;i<=brojac;i++){
			
			idxX=x[i];
			idxY=y[i];
			
			for(int k=0; k<brRedova; k++){
				niz[k][idxY]=0;
			}
			for(int k=0; k<brKolona; k++){
				niz[idxX][k]=0;
			}
			
		}
		}
		return niz;
	}
	

	/**
	 * Funkciaj prima broj redova i kolona i korisnik sa tastature unosi brojeve te popunjava elemente dvodimenzionalnog niza.
	 * @param brojRedova
	 * @param brojKolona
	 * @return dvodimenzionalni niz integera
	 */
	static int[][] unesi2DNiz(int brojRedova, int brojKolona) {
		Scanner in=new Scanner(System.in);
		
		int niz[][]=new int[brojRedova][brojKolona];
		
		for(int i=0; i<brojRedova; i++){
			for(int j=0; j<brojKolona; j++){
				niz[i][j]=in.nextInt();
			}
		}
		return niz;
	}

	
	/**
	 * Funkcija ispisuje dvodimenzionalni niz na ekran.
	 * @param niz
	 */
	static void ispisiNiz(int[][] niz) {
		for(int i=0; i<niz.length;i++){
			for(int j=0; j<niz[i].length; j++){
				System.out.print(niz[i][j]);
			}
			System.out.println();
		}
		
	}
}



