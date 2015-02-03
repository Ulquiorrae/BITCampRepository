
public class LinkedListInt {

	private Node head;
	private int size;
	
	/**
	 * Constructor for class LinkedListInt
	 */
	public LinkedListInt() {
		
		this.head = null;
		this.size = 0;
		
		
	}
	
	/**
	 * This method adds a new elements with forwarded value, into a list.
	 * @param value - value of an element we want to add to a list.
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}
	
	/**
	 * This method sets how the list will be printed on screen.
	 */
	public String toString() {
		String out = "[ ";
		Node current = head;
		while (current != null) {
			if (current.next == null) {
				out = out + current.value + " ]";
				break;
			}
			out = out + current.value + ", ";
			current = current.next;
		}
		return out;
	}
	
	/**
	 * This method removes an element on a given index.
	 * @param index - index of an element in a list.
	 */
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index is not in range !");
		}
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}

		Node current = head.next; // drugi
		Node previous = head; // prvi
		int counter = 1;
		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;

	}


	private class Node {
		
		public int value;
		public Node next;

		
		/**
		 * Constructor for class Node
		 * @param value
		 * @param next
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		
		
	}
}
