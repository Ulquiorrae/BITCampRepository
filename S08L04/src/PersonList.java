import java.io.ObjectInputStream.GetField;


public class PersonList implements PersonListInterface {

	private PersonNode firstPerson;
	
	
	
	public PersonNode getFirstPerson() {
		return firstPerson;
	}
	
	
	/* (non-Javadoc)
	 * @see PersonListInterface#add(Person)
	 */
	@Override
	public void add(Person person) {

		PersonNode next = new PersonNode(person);
		if (firstPerson == null) {
			firstPerson = next;
		} else {
			PersonNode lastPerson = firstPerson;
			while (lastPerson.getNext() != null) {
				lastPerson = lastPerson.getNext();
			}
			lastPerson.setNext(next);
		}
	}
	
	/* (non-Javadoc)
	 * @see PersonListInterface#printList()
	 */
	@Override
	public void printList() {

		// Prints all elements of a linked list on a screen.
		System.out.println("Names in the list: ");
		PersonNode current = getFirstPerson();
		while (current != null) {
			System.out.println(current.getP().getName());
			current = current.getNext();
		}

	}
	
	
	/* (non-Javadoc)
	 * @see PersonListInterface#countListElements()
	 */
	@Override
	public int countListElements() {
		int counter = 0;
		PersonNode current = getFirstPerson();
		while (current != null) {
			current = current.getNext();
			counter++;
		}
		return counter;
	}
	
	
	/* (non-Javadoc)
	 * @see PersonListInterface#toArray()
	 */
	@Override
	public Person[] toArray() {
		Person[] newArray = new Person[countListElements()];
		int i = 0;
		PersonNode current = firstPerson;
		while (current != null) {
			newArray[i] = current.getP();
			current = current.getNext();
			i++;
		}
		return newArray;
	}
	
}



//OVU METODU KORISTIM SA PERSONENTRYCLASSED !!!!!!!!!!