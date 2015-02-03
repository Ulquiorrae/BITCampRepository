public class ArrayReferences {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = a;

		b[1] = 10;

		for (int x : a) {
			System.out.println(x);
		}

	}

}
