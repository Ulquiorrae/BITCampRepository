import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		
		int a=10,b=0;
		try{
			
			System.out.println("Rezultat: " + dijeli(a,b));
		}
		catch(IllegalArgumentException e){
			System.out.println("Doslo je do greske: "+ e.getMessage());
		} 
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static double dijeli(int a, int b){
		
		if(b==2){
			throw new IllegalArgumentException("Nemoj sa 2");
		}
		double rezultat= a/b;
		return rezultat;
		
	}
	
}
