
public class ArrayListInt {

	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;
	
	/**
	 * Constructor for class ArrayListInt
	 */
	public ArrayListInt() {
		size = 0;
		array = new int[DEFAULT_SIZE];
	}
	
	/**
	 * Getter for attribute size from class ArrayListInt
	 * @return integer - size of a list
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * This method adds a new element to a list.
	 * @param value
	 */
	public void add(int value) {
		if(size == array.length) resize();
		array[size] = value;
		size++;
		
	}

	/**
	 * This method resizes an array(doubles its length).
	 */
	private void resize() {
		int[] tmp = array;
		array = new int[tmp.length * 2];
		for (int i = 0; i < size; i++) {
			array[i] = tmp[i];

		}
	}
	
	/**
	 * This method removes an element from an array of integers which is located on an index the method recieves as a parameter.
	 * @param index
	 */
	private void removeAt(int index) {

		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
		}
	}
	
	
	/**
	 * This methods converts arrayList to a normal array, that is, it copies all of list's elements to a newly created array of integers.
	 * @return
	 */
	int[] toArray() {
		int[] newArray = new int[size];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	
	public String toString() {
		String out = "[ ";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				out = out + array[i] + " ]";
				break;
			}
			out = out + array[i] + ", ";
		}
		return out;
	}
	
	
	
}
