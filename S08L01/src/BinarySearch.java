import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbers[] = new int[] { 11,12,13,14,15 };

		System.out.println("Enter the number you want to find int an array: ");
		int index = in.nextInt();

		int solution = binarySearch(numbers, index, 0, numbers.length - 1);

		System.out.println("Index of searched number is: " + solution);

	}

//	public static int binarySearchLoop(int[] array, int number) {
//		int start = 0;
//		int end = array.length - 1;
//
//		while (start <= end) {
//			int mid = (end + start) / 2;
//			if (number == array[mid]) {
//				return mid;
//			} else if (number < array[mid]) {
//				end = mid - 1;
//			} else {
//				start = mid + 1;
//			}
//		}
//		return -1;
//	}

//	public static int binarySearch(int[] array, int number) {
//		return binarySearch(array, number, 0, array.length - 1);
//	}

	public static int binarySearch(int[] array, int number, int start, int end) {
		if (start > end)
			return -1;
		int mid = (end + start) / 2;
		if (array[mid] == number)
			return mid;
		else if (array[mid] < number) {
			return binarySearch(array, number, mid + 1, end);
		} else {
			return binarySearch(array, number, start, mid - 1);
		}

	}
}