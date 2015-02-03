import java.util.Arrays;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {

		int[] brojevi = new int[] { 1, 2, 3, 4, 4, 6, 7 };

		int[] noviBrojevi = new int[10];

		noviBrojevi = Arrays.copyOf(brojevi, 7);

		// noviBrojevi=Arrays.copyOfRange(brojevi, 2, 5);

		for (int broj : noviBrojevi) {

			System.out.println(broj + " ");

		}

	}
}
