import java.util.InputMismatchException;
import java.util.Scanner;
public class SumaBrojevaTerminal {
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int suma=0;
		int i=0;
		
		for (i = 0; i < args.length; i++) {
			try {
				suma = suma + Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				System.out.println("GREŠKA: " + args[i]);
			}
		}
		System.out.println("Suma unesenih brojeva je: " + suma);
	}
}
