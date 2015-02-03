import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String args []){
		
		int a,b,c;
		double determinanta;
		double solution1,solution2;
		
		System.out.println("Unesi koeficijent a: ");
		a=TextIO.getInt();
		
		System.out.println("Unesi koeficijent b: ");
		b=TextIO.getInt();
		
		System.out.println("Unesi koeficijent c: ");
		c=TextIO.getInt();
		
		determinanta=Math.pow(b, 2) - 4*a*c;
		double korijendeterminante=Math.sqrt(determinanta);
		System.out.println(determinanta);
		System.out.println(korijendeterminante);
		
		
		if(determinanta>0){
			
			solution1=(-b+korijendeterminante)/(2*a);
			solution2=(-b-korijendeterminante)/(2*a);
			
			System.out.println("X1= " +solution1);
			System.out.println("X2= " +solution2);
			
		
			
		}
		else{
			
			System.out.println("Determinanta iznosi " +determinanta+" te je negativna i samim time rješenje jednačine ne postoji u skupu realnih brojeva!");
		}
		
	}
}
