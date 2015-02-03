import java.util.Scanner;

public class Sabiranje2Broja {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		double num1,num2;
		
		System.out.println("Unesi prvi broj: ");
		num1=in.nextDouble();
		
		System.out.println("Unesi drugi broj: ");
		num2=in.nextDouble();
		
		System.out.printf("Zbir ova dva broja je:%.2f",sabiranje(num1,num2));
	}
	
	public static int sabiranje(int a, int b){
		
		int zbir=0;
		zbir=a+b;
		return zbir;
	}


	public static double sabiranje(double a, double b){
		
		double zbir=0;
		zbir=a+b;
		return zbir;
	} 




}
