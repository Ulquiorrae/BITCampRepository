public interface PersonListInterface {

	/**
	 * This method adds a new element on a linked list.
	 * @param person 
	 * @param firstPerson
	 */
	public abstract void add(Person person);

	/**
	 * Void method that prints all elements of a linked list on screen.
	 * @param firstPerson
	 */
	public abstract void printList();

	/**
	 * This method counts the number of elements in a linked list.
	 * @param first - headNode
	 * @return integer - number of elements in a list.
	 */
	public abstract int countListElements();

	/**
	 * This method converts linked list into an array of Persons
	 * @param firstPerson
	 * @return array of Persons
	 */
	public abstract Person[] toArray();

}