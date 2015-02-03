import java.util.Scanner;
public class JMBG {

	public static void main(String args[]) {


		Scanner in = new Scanner(System.in);

		System.out.println("Unesi svoj JMBG: ");

		int cifre=0;
		String jmbg;
		int novi=0;


		jmbg = in.next( );
		if(jmbg.length()<13){

			System.out.println("JMBG mora da sadrži 13 cifara! Unesi ispravan JMBG!");

			jmbg = in.next( );

		}

		String danRođenja=jmbg.substring(0, 2);
		String mjesecRođenja=jmbg.substring(2, 4);
		String godinaRođenja=jmbg.substring(4,7);
		String regija=jmbg.substring(7,9);
		String spol=jmbg.substring(9, 12);
		
		int broj=Integer.parseInt(spol);
		


		System.out.println("Tvoj datum rođenja je " + danRođenja + "." + mjesecRođenja + "." + "1" + godinaRođenja + ".");
		System.out.println("Regija u kojoj si rođen nalazi se pod šifrom " + regija + ".");
		System.out.println("Spol osobe ima šifru: " + spol);
		
		
			
			
			
		}
		
		

		

	}


