import java.util.Scanner;
public class ASCIIVrijednostIntegera {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jedan cijeli broj: ");
		int broj=in.nextInt();
		
		System.out.println("ASCII vrijednost broja "+broj+ " je: "+ascii(broj));
	}

	/**
	 * Funkcija prima kao parametar broj tipa integer a vraća njegovu ASCII vrijednost.
	 * @param broj
	 * @return char
	 */
	private static char ascii(int broj) {
		return (char) broj;
	}

}
