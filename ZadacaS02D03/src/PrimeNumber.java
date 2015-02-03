import java.util.Scanner;
public class PrimeNumber {

	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		double number;
		int prost=0;
		System.out.println("Input one number: ");
		number=in.nextInt();
		
		if(number>1){
		
		for(int i=2;i<=number/2;i++){
			
			if(number%i==0){
				
				prost=1;
				
			}	
		}
		
		if(prost==0){
			
			System.out.println("Broj jeste prost broj!!!");
			
		}
		if(prost==1){
			
			System.out.println("Broj nije prost broj!!!");
			
		}
		}
		
		else{
			
			System.out.println("Broj nije prost broj!!!");
		}
	}
}
