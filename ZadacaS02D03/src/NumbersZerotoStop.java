//Write a program which will take in 2 numbers and 
//return their sum, product, quotients, and modulus,
//repeat until the entered numbers are both 0. (catching the a/0 case)

import java.util.Scanner;
public class NumbersZerotoStop {
	public static void main(String args []){
		
		Scanner in=new Scanner(System.in);
		int n1,n2, sum, product,modulus;
		double quotient;
		boolean infinite=true;
		
		while(infinite=true){
		System.out.println("Enter 2 numbers separated by space: ");
		n1=TextIO.getInt();
		n2=TextIO.getInt();
		if(n1==0 && n2==0) {
			
			System.out.println("OBA BROJA SU NULA!! STOP!");
			break;
		}
		sum=n1+n2;
		product=n1*n2;
		quotient=(double)n1/n2;
		modulus=n1%n2;
		System.out.println("Sum of 2 numbers is: " +sum);
		System.out.println("Product of 2 numbers is: " +product);
		System.out.printf("Quotient of 2 numbers is %1.2f " ,quotient);
		System.out.println();
		System.out.println("Modulus of 2 numbers is: " +modulus);
		}
	}

}
