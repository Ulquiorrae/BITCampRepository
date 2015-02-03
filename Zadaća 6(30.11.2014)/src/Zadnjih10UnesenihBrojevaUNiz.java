import java.util.Scanner;
public class Zadnjih10UnesenihBrojevaUNiz {

	public static void main(String[] args) {
		
		int[]niz=new int[50];
		kreirajNiz(niz);

		int[]obrnutiNiz=zadnjihDeset(niz);
		
		System.out.println("Zadnjih 10 unesenih brojeva: ");
		ispisiNiz(obrnutiNiz);
	}

	/**
	 * Funkcija prima niz integera i ispisuje ih na ekran
	 * @param obrnutiNiz
	 */
	private static void ispisiNiz(int[] obrnutiNiz) {

		for(int i=0;i<obrnutiNiz.length;i++){
			
			System.out.print(obrnutiNiz[i]+" ");
			
		}
		
	}

	/**
	 * Funkcija prima niz integera i vraća zadnjih 10 brojeva koji su uneseni sa tastature.
	 * @param niz
	 * @return niz integera
	 */
	private static int[] zadnjihDeset(int[]niz) {

		int[]obrnutiNiz=new int[10];
		int k=9;
		for(int j=niz.length-1;j>=0;j--){
			
			if(niz[j]!=0) {
			
				obrnutiNiz[k]=niz[j];
				k--;
			}
			if(k==-1) break;
			
		}
		return obrnutiNiz;
	}

	/**
	 * Funkcija popunjava niz integera sa brojevima koji se unose sa tastature. Unos broja "-1" završi rad funkcije.
	 * @param niz
	 * @return niz tipa integer
	 */
	private static int[] kreirajNiz(int[]niz) {
		Scanner in=new Scanner(System.in);
		
		int i=0;
		
		while(true){
			
			System.out.println("Unesi broj: ");
			int broj=in.nextInt();
			
			if(broj==-1) break;
				
			niz[i]=broj;
			i++;
		}
		return niz;
	}
	
}
