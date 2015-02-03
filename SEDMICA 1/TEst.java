import java.util.InputMismatchException;
import java.util.Scanner;

public class TEst {

	// Pitati kako ispitati ispravnost tipa vrijednosti koja se unosi-input
	public static void main(String args[]) {

		int broj;
		int cifra;
		boolean proba=true;

		Scanner in = new Scanner(System.in);

		System.out.println("Unesi jedan cijeli broj od 10 do 99999:");
		
		while (true) {
			try {
				broj = in.nextInt();
				break;
				
			} catch (InputMismatchException e) {
			
				System.out.println("GREŠKA! Unesi broj !");
				
			}
		}

		while ((broj < 10) || (broj > 99999)) {

			System.out
					.println("GREŠKA! Molimo vas da unesete broj izmeðu 10 i 99999:");
			broj = in.nextInt();

		}

		System.out.println("Uneseni broj ispisan unazad je :");
		while (broj != 0) {

			cifra = broj % 10;

			System.out.print(cifra);

			broj = broj / 10;

		}

	}

}