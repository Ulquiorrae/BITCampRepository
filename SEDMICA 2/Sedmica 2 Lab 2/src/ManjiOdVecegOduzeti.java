import java.util.Scanner;
public class ManjiOdVecegOduzeti {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		
		int broj1,broj2;
		int razlika;
		
		
		System.out.println("Unesi prvi broj: ");
		broj1=in.nextInt();
		
		System.out.println("Unesi drugi broj: ");
		broj2=in.nextInt();
		
		if(broj1>broj2){
			
			razlika=broj1-broj2;
			System.out.println("Razlika dva broja je: " +razlika);
			return;
			
			}
		
			razlika=broj2-broj1;
			System.out.println("Razlika dva broja je: " +razlika);
			
			
		
		
		
	}
	

}
