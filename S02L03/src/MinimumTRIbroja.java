import java.util.Scanner;

public class MinimumTRIbroja {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int broj1, broj2, broj3;
		int max;
		boolean istina = false;

		System.out.println("Unesi prvi broj: ");
		broj1 = in.nextInt();

		System.out.println("Unesi drugi broj: ");
		broj2 = in.nextInt();

		System.out.println("Unesi treći broj: ");
		broj3 = in.nextInt();

		max = broj1;

		if ((broj2 > broj1) && (broj2 > broj3)) {

			max = broj2;

		}

		if ((broj3 > broj1) && (broj3 > broj2)) {

			max = broj3;

		}

		System.out.println("Najveći broj je: " + max);

	}
}
