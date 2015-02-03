public class DynamicArray {

	private int[] array;
	private int count;
	final int INIT_SIZE = 5;

	/**
	 * Constructor for DynamicArray class.
	 * @param size
	 */
	public DynamicArray(int size) {
		this.array = new int[size];
		this.count = 0;
	}

	/**
	 * Constructor for DynamicArray class which does not recieve any parameters.
	 * @param size
	 */
	public DynamicArray() {
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}

	/**
	 * This method returns the size of an array.
	 * @return integer
	 */
	public int getSize() {
		return count;
	}

	// public void add(int newElement){
	// if(this.count == array.length){
	// resize();
	// array[count] = newElement;
	// }
	//
	// }
	//
	// private void resize(){
	// int[] temp = new int[2*array.length];
	// for(int i=0; i< count; i++){
	// temp[i] = array[i];
	// }
	// array = temp;
	// }

	
	/**
	 * This method adds a new element to an array of integers.
	 * @param newElement
	 */
	public void add(int newElement) {
		if (count == array.length)
			resize();
		array[count] = newElement;
		count++;
	}

	/**
	 * This method resizes an array of integers(doubles it).
	 */
	private void resize() {
		int[] tmp = array;
		array = new int[tmp.length * 2];
		for (int i = 0; i < count; i++) {
			array[i] = tmp[i];
		}
	}

	/**
	 * This method returns a value of an element on an index it recieves as a parameter.
	 * @param index
	 * @return integer - value of an element on index "index".
	 */
	private int getAt(int index) {

		if (index > count || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			return array[index];
		}
	}

	/**
	 * This method removes an element from an array of integers which is located on an index the method recieves as a parameter.
	 * @param index
	 */
	private void removeAt(int index) {

		if (index > count || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i < array.length - 1; i++) {
				array[i] = array[i + 1];

			}
			count--;
		}
	}

	/**
	 * This method creates an array of integers from an DynamicArray
	 * @return array of integers
	 */
	private int[] toArray() {
		int[] newArray = new int[count];
		for (int i = 0; i < count; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
