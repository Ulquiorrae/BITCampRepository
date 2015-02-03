import java.util.Scanner;
public class UnosTESTIRANJE {

	public static void main(String args[]) {
		
		
		Scanner in = new Scanner(System.in);
		int broj1,broj2;
		
		System.out.print("Unesi prvi broj: ");
		broj1=in.nextInt();
		
		System.out.print("Unesi drugi broj: ");
		broj2=in.nextInt();
		
		int zbir=broj1+broj2;
		int razlika=broj1-broj2;
		float kolicnik=(float) broj1/broj2;
		int prozidvod=broj1*broj2;
		float korijenZbira=(float)sqrt(zbir);
		
		
		System.out.print(korijenZbira);
		
		
	}

	private static float sqrt(int zbir) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
