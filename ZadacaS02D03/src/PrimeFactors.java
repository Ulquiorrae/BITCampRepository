import java.util.Scanner;
public class PrimeFactors {
//A program which will output a given number’s prime factors.
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		int broj,copy;
		String faktori=" ";
		
		System.out.println("Unesi jedan broj: ");
		broj=in.nextInt();
		copy=broj;
		
		
		for(int i=2;i<=broj;i++){
			
			while(broj%i==0){
				
				faktori=faktori + " "+i;
				broj=broj/i;
				
			}
			
		}
		
		System.out.printf("Prime factors of number "+copy+ " are: %s",faktori);
		
	}
}
