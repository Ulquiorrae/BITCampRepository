
public class SortingAlgorithms {

	public static void main(String[] args) {
		
		int array[] = new int [] {2,3,6,1,8,4,5};
		
//		selectionSort(array);
		
		insertionSort(array);
		
		for( int n : array) {
			System.out.println(n);
		}
	}
	
	
	public static void selectionSort(int[] array) {
		int temp, minIndex;
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[minIndex])
					minIndex = j;

			if (minIndex != i) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void insertionSort(int[] array) {
		int i, j, newValue;
		for (i = 1; i < array.length; i++) {
			newValue = array[i];
			j = i;
			while (j > 0 && array[j - 1] > newValue) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = newValue;
		}
	}

}
