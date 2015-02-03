import java.util.Scanner;

public class CIfraPoCifra {
   public static void main(String args[])
   {
	   
	   	int number;
	   	int reverse=0;
	   	int cifre;
	   	Scanner in = new Scanner(System.in);
	   	
	   	System.out.println("Unesi jedan cijeli broj: ");
		number = in.nextInt();
	   	
	   	while(number!=0){
	   		
	   		reverse=reverse*10;
	   		reverse=reverse +number%10;
	   		number=number/10;
	   		
	   
	   	}
	   	
	   	
	   	while(reverse!=0){
	   		
	   		cifre=reverse%10;	
	   		reverse=reverse/10;
	   		System.out.println(cifre);
	   		
	   	}
	   
   }
}