import java.util.Scanner;
public class RandomInInterval {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int start,end;
		int randomBroj;
		boolean parnost;
		
		System.out.println("Unesi početak intervala: ");
		start=in.nextInt();
		
		System.out.println("Unesi kraj intervala: ");
		end=in.nextInt();
		
		randomBroj=randomInInterval(start,end);
		
		parnost=isOdd(randomBroj);
		
		if(parnost==false){
			
			System.out.printf("Generisali smo broj %d. To je paran broj.",randomBroj);
			
		}
		else{
			
			System.out.printf("Generisali smo broj %d. To je neparan broj.",randomBroj);
		}
	}

	/**
	 * Funkcija ima zadatak da primi vrijednost tipa integer i provjeri da li je proslijeđeni broj paran ili neparan.
	 * @param randomBroj - Random broj u intervalu (start,end) tipa integer.
	 * @return True ako je broj neparan i false ako je broj paran.
	 */
	private static boolean isOdd(int randomBroj) {
		
		if(randomBroj%2==0) return false;
		
		return true;
	}

	/**
	 * Funkcija ima zadatak da vrati nasumičnu vrijednost tipa integer u intervalu (start,end)
	 * @param start - početak intervala
	 * @param end - kraj intervala
	 * @return Funkcija vraća random vrijednost broja u intervalu (start,end)
	 */
	private static int randomInInterval(int start, int end) {
		
		//randomNum = minimum + (int)(Math.random()*maximum); 
		
		int randomBroj=start+(int)(Math.random()*end);
		
		return randomBroj;
	}

}
