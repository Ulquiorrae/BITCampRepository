import java.util.Scanner;
public class Firme {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int sati;
		double firma1,firma2;
		
		System.out.println("Unesi koliko ti je potrebno sati interneta na korištenje: ");
		sati=in.nextInt();
		
		
		firma1=10+sati*(0.5);
		firma2=sati*(0.8);
		
		if(firma1<firma2){
			
			System.out.printf("Prva firma je bolja za vaše potrebe. Vaš trošak za %d sati je %.2f KM.",sati,firma1);
			
		}
		if(firma2<firma1){
			
			System.out.printf("Druga firma je bolja za vaše potrebe. Vaš trošak za %d sati je %.2f KM.",sati,firma2);
			
		}
		
	}
}
