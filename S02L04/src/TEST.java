import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int broj;
		int trice=0,petice=0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("Unesi broj: ");
			broj=in.nextInt();
			
			if(broj%3==0) trice++;
			if(broj%5==0) petice++;
		}
		
		
		System.out.printf("Djeljivih sa 3 ima: %d", trice);
		System.out.println();
		System.out.printf("Djeljivih sa 5 ima: %d", petice);

		}
		
	}


