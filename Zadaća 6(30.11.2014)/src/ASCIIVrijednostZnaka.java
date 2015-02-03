import java.util.Scanner;
public class ASCIIVrijednostZnaka {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		char znak;
		
		System.out.println("Unesi jedan znak: ");
		znak=in.next().charAt(0);
		
		int broj=(int)znak;
		
		for(int i=broj;i>=0;i--){
			
			System.out.printf(i+" ");
			
		}
		
		/*Ukoliko je trebalo ispisati znakove, evo ispod code koji to radi:
		 * for(int i=broj;i>=0;i--){
			
			char temp=(char)i;
			System.out.printf(temp+" ");
			
		}
		 */
		
	}
}
