import java.util.Scanner;
public class SumaRazlikaProizvodPodjeljeno {

	public static void main(String[] args) {

	Scanner in=new Scanner(System.in);	
		
	int num1,num2;
	double num3,num4;
	
	System.out.println("Unesi prvi broj(integer): ");
	num1=in.nextInt();
	
	System.out.println("Unesi drugi broj(integer): ");
	num2=in.nextInt();
	
	System.out.println("Unesi treći broj(double): ");
	num3=in.nextDouble();
	
	System.out.println("Unesi četvrti broj(double): ");
	num4=in.nextDouble();
	
	zbir(num1,num2);
	
	razlika(num1,num2);
	
	proizvod(num1,num2);
	
	kolicnik(num2,num3);
	
	System.out.println("Zbir dva broja je: "+zbir(num1,num2));
	System.out.println("Razlika dva broja je: "+razlika(num1,num2));
	System.out.println("Proizvod dva broja je: "+proizvod(num1,num2));
	System.out.println("Količnik dva broja je: "+kolicnik(num2,num3));
	
	}
	
	public static double zbir(double num3, double num4){
		
		return num3+num4;
		
	}
	
	public static int zbir(int num1, int num2){
		
		return num1+num2;
		
	}
	
	public static int razlika(int num1, int num2){
		
		return num1-num2;
		
	}
	
	public static double razlika(double num3, double num4){
		
		return num3-num4;
		
	}
	/**
	 * Funkcija množi dva broja tipa integer
	 * @param num1 je broj tipa integer, može biti bilo koji broj
	 * @param num2 je broj tipa integer, može biti bilo koji broj
	 * @return proizvod dva broja(num1 i num2)
	 */
	public static int proizvod(int num1, int num2){
		
		int proizvod=num1*num2;
	
	return proizvod;
	
}
	
	public static double proizvod(double num3, double num4){
		
			double proizvod=num3*num4;
		
		return proizvod;
		
	}
	/**
	 * Dijeli dva broja tipa double
	 * @param num2 double bilo koji broj
	 * @param num3 double bilo koji broj
	 * @return količnik dva broja
	 */
	public static double kolicnik(double num2,double num3){
			
			double kolicnik=num2/num3;
		
		return kolicnik;
		
	}

}
