import java.util.Scanner;

public class IndexOfNumberInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbers[] = new int[] { 0, 1, 2, 52, 4, 5, 3, 7, 8, 9, 10 };
		int input;

		System.out.println("Enter one number(that you wish to locate in an array): ");
		input = in.nextInt();

//		for (int i = 0; i < numbers.length; i++) {
//
//			if (input == numbers[i]) {
//				System.out.println("Number " + input + " is on position " + i
//						+ " in an array!");
//			}
//
//		}
		
		int burek = binarySearch(numbers, input);
		System.out.println("######" + burek + "######");
	}

	public static int binarySearch(int[] array, int el) {
		int startIndex = 0;
		int endIndex = array.length - 1;

		while (startIndex < endIndex) {
			int m = startIndex + (endIndex - startIndex) / 2;

			if (array[m] == el) {
				return m;
			} else if (el < array[m]) {
				endIndex = m - 1;
			} else {
				startIndex = m + 1;
			}
		}
		return -1;
	}
}
