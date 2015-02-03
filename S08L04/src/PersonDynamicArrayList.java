public class PersonDynamicArrayList implements PersonListInterface {

	private Person[] array;
	private int nextEIndex = 0;

	public PersonDynamicArrayList() {
		array = new Person[10];
		nextEIndex = 0;
	}

	@Override
	public void add(Person person) {
		if (nextEIndex >= array.length) {
			Person[] tmp = new Person[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[i];
			}
			array = tmp;
		}
		array[nextEIndex] = person;
		nextEIndex++;
	}

	@Override
	public void printList() {
		for (int i = 0; i < nextEIndex; i++) {
			System.out.println(array[i].getName());
		}
	}

	@Override
	public int countListElements() {
		return nextEIndex;
	}

	@Override
	public Person[] toArray() {
		Person[] newArray = new Person[nextEIndex];
		for (int i = 0; i < nextEIndex; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
