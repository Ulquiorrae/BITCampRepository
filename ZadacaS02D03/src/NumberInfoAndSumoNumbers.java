import java.util.Scanner;
public class NumberInfoAndSumoNumbers {
//and information on whether the numbers were all positive, integers, bigger than 0 and prime.
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		double number;
		boolean infinite=true;
		int first=0;
		double sum=0;
		
	
		while(infinite=true){
			
			if(first==0){
			System.out.println("Input first number: ");
			number=in.nextDouble();
			first=1;
			int prost=0;
			sum=sum+number;
			
			if(number>0){
				System.out.println("The number is a positive number!");
				
			}
			else{
				System.out.println("The number is NOT a positive number!");
			}
			
			if(number==(int)number){
				
				System.out.println("The number is an integer!");
				
			}
			else{
				System.out.println("The number is NOT an integer!");
				
			}
			if(number>1){
			for(int i=2;i<=number/2;i++){
				
				if(number%i==0){
					
					prost=1;
					
				}	
			}
			
			if(prost==0){
				
				System.out.println("The number is a prime number!");
				
			}
			if(prost==1){
				
				System.out.println("The number is NOT a prime number!!");
				
			}
			
			}
			else{
				System.out.println("The number is not a prime number!!");
				
			}
			}
			
			System.out.println("Input next number: ");
			number=in.nextDouble();
			if(number==0){
	
				System.out.println("KRAJ!");
				break;
				
			}
			
			int prost=0;
			
			if(number>0){
				System.out.println("The number is a positive number!");
				
			}
			else{
				System.out.println("The number is NOT a positive number!");
			}
			
			if(number==(int)number){
				
				System.out.println("The number is an integer!");
				
			}
			else{
				System.out.println("The number is NOT an integer!");
				
			}
			if(number>1){
			for(int i=2;i<=number/2;i++){
				
				if(number%i==0){
					
					prost=1;
					
				}	
			}
			
			if(prost==0){
				
				System.out.println("The number is a prime number!");
				
			}
			if(prost==1){
				
				System.out.println("The number is NOT a prime number!!");
				
			}
			
			}
			else{
				System.out.println("The number is not a prime number!!");
				
			}
			
	
			sum=sum+number;
		
		}
		System.out.println("Sum of all numbers you entered is: " +sum);
				
	}
}
