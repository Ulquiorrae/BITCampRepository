import java.util.Scanner;
public class NuliranjeRedovaIKolonaKojeSadržeNulu {

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
	
	
	private static int[][] nulirajRedoveIKolone(int[][] niz, int brRedova, int brKolona) {
		
		int idxX=0,idxY=0;
		
		
		
		for(int i=0; i<niz.length; i++){
			for(int j=0; j<niz[i].length; j++){
				if(niz[i][j]==0){
					idxX=i;
					idxY=j;
				}
			}
		}
		
		for(int k=0; k<brRedova; k++){
			niz[k][idxY]=0;
		}
		for(int k=0; k<brKolona; k++){
			niz[idxX][k]=0;
		}
		
		return niz;
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
	
	
}



