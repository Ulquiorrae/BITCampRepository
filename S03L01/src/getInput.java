import java.util.Scanner;
public class getInput {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		int num1=getInputInt("Unesi integer: ");
		double myDouble=getInputDouble("Unesi double: ");	
		String myString=getInputString("Unesi string: ");
			
				
		System.out.println("Uneseni int: "+num1);		
		System.out.println("Uneseni double: "+myDouble);	
		System.out.println("Uneseni string: "+myString);	
		
		}
	
		/**
		 * Ova funkcija prima poruku kao string i vraća broj tipa integer nazad!
		 * @param poruka
		 * @return Broj tipa integer
		 */
		public static int getInputInt(String poruka){
			
			
			System.out.println(poruka);
			int broj=TextIO.getInt();
			return broj;
		}
		/**
		 * Ova funkcija prima poruku kao string i vraća broj tipa double nazad!
		 * @param poruka
		 * @return Broj tipa double
		 */
		public static double getInputDouble(String poruka){
			
			
			System.out.println(poruka);
			double broj=TextIO.getDouble();
			
			
			
			return broj;
		}
		/**
		 * Ova funkcija prima poruku kao string i vraća neki string!
		 * @param poruka
		 * @return String
		 */
		public static String getInputString(String poruka){
			
			Scanner in=new Scanner(System.in);
			
			System.out.println(poruka);
			String recenica=in.next();
			return recenica;
		}
	}

