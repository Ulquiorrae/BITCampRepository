import java.util.Scanner;
public class PersonEntry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name;
		PersonNode firstPerson = null;
		PersonNode lastPerson = null;
		
	

		System.out.println("Enter names you want to insert into a Linked-list: ");
		
		// This do-while enables us to enter names until you enter "end"
		do {

			name = in.nextLine();
			if (name.equals("end")) {
				break;
			}
			Person person = new Person(name);
			PersonNode pnode = new PersonNode(person);

			// In first iteration we have only 1 element so first and last are both on it.
			if (firstPerson == null) {
				firstPerson = pnode;
				lastPerson = pnode;
			} else {
//				lastPerson.setNext(pnode);  // Kada kreiramo još jedan element,
//											// postavimo pokazivac od prethnodnog elementa na taj,
//				lastPerson = pnode; 		// Postavimo da je najnovija kreirana osoba ustvari zadnja osoba.
				add(person, firstPerson);
			}
		} while (true);
		in.close();
		
		//Counting elements function call
		int numOfElements = countListElements(firstPerson);
		System.out.println("Number of entries: " + numOfElements);
		
		System.out.println();
		System.out.println("#########################################");
		System.out.println();
		
		printList(firstPerson);
		
		Person[] array = toArray(firstPerson);
			
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].getName());
		}

	}
	
	/**
	 * This method converts linked list into an array of Persons
	 * @param firstPerson
	 * @return array of Persons
	 */
	public static Person[] toArray(PersonNode firstPerson) {
		Person[] newArray = new Person[countListElements(firstPerson)];
		int i = 0;
		PersonNode current = firstPerson;
		while (current != null) {
			newArray[i] = current.getP();
			current = current.getNext();
			i++;
		}
		return newArray;
	}
	
	/**
	 * This method counts the number of elements in a linked list.
	 * @param first - headNode
	 * @return integer - number of elements in a list.
	 */
	public static int countListElements(PersonNode first) {
		int counter = 0;
		PersonNode current = first;
		while (current != null) {
			current = current.getNext();
			counter++;
		}
		return counter;
	}
	
	/**
	 * This method adds a new element on a linked list.
	 * @param person 
	 * @param firstPerson
	 */
	public static void add(Person person, PersonNode firstPerson) {
		PersonNode lastPerson = firstPerson;
		while (lastPerson.getNext() != null) {
			lastPerson = lastPerson.getNext();
		}
		lastPerson.setNext(new PersonNode(person));
		
	}
	
	/**
	 * Void method that prints all elements of a linked list on screen.
	 * @param firstPerson
	 */
	public static void printList(PersonNode firstPerson) {

		// Prints all elements of a linked list on a screen.
		System.out.println("Names in the list: ");
		PersonNode current = firstPerson;
		while (current != null) {
			System.out.println(current.getP().getName());
			current = current.getNext();
		}

	}
	
}
