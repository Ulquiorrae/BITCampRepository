
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] numbers = new int [] {871, 12, 8, 12, 98, 12, 19, 18, 82, 11, 65};
		insertionSort(numbers);
		
		for( int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void insertionSort(int[] array){
		
		for(int i=1; i<array.length; i++){
			int newPos = i;
			
			while(newPos > 0 && array[newPos - 1] > array[newPos]){
				int t = array[newPos - 1];
				array [newPos -1] = array[newPos];
				array[newPos] = t;
				
				newPos--;
			}
		}
			
		}
		
	}

