import java.util.Scanner;
public class Stepenovanje {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		long baza,stepen,stepenovaniBroj;
		
		System.out.println("Unesi jedan cijeli broj(baza): ");
		baza=in.nextInt();
		
		System.out.println("Unesi jedan cijeli broj(stepen): ");
		stepen=in.nextInt();
		
		stepenovaniBroj=pow(baza,stepen);
		
		System.out.printf("Broj %d stepenovan na %d ima vrijednost: %d ",baza,stepen,stepenovaniBroj);
	}
	
	/**
	 * Funkcija prima bazu i exponent i treba da stepenuje bazu na zadani exponent
	 * @param baza - Broj tipa integer
	 * @param stepen - Broj tipa integer
	 * @return Uneseni broj(baza) podignuta na stepen "stepen"
	 */
	private static long pow(long baza, long stepen) {

		long broj=baza;
		
		for(int i=1;i<stepen;i++){
			
			broj=broj*baza;
			
		}
		return broj;
	}
}
