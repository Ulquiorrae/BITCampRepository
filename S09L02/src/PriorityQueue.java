

public class PriorityQueue {

	private Node head;
	private Node tail;

	/**
	 * Constructor for class PriorityQueue
	 */
	public PriorityQueue() {

		this.head = head;
		this.tail = tail;

	}
	
	//Prva verzija moje push methode, dodatno je provjeriti i napisati tako da imam 2 načina udađena!
/**
	public void push(int value) {

		Node newNode = new Node(value);
		Node current = head.next; // drugi
		Node previous = head; // prvi
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
//			tail.next = newNode;
//			tail = newNode;
//			tail.next = null;
			
			while(previous.next.priority > previous.priority) {
				current = current.next;
				previous = previous.next;
			}
			previous.next = newNode;
			newNode.next = current;
			
		}
		
		
		
	}
	
	/**
	 * This method adds a new element to the lists and respects priority order.
	 * @param value - value of an element you want to add.
	 * @param priority - integer that shows the priority of an element. The higher the number, the higher the priority.
	 */

	public void push(int value, int priority) {

		Node newNode = new Node(value, priority);

		// ako je prazna lista
		if (head == null) {
			head = newNode;
			tail = head;
			return;
		}
		//jedan element
		if (newNode.priority > head.priority) {
			newNode.next = head;
			head = newNode;
			return;
		}
		//jedan element
		if (newNode.priority <= tail.priority) {
			tail.next = newNode;
			tail = newNode;
			return;
		}
		//sortiranje
		Node current = head;
		while (current.next != null) {
			if (newNode.priority > current.next.priority
					&& newNode.priority <= current.priority ) {
				newNode.next = current.next;   //ubacimo ga između 2 odgovarajuća elementa u listi.
				current.next = newNode;       
				return;
			}
			current = current.next;
		}
	}

	/**
	 * This methods deletes the first element in queue.
	 * @return
	 */
	public int pop() {

		if (head == null) {
			throw new NullPointerException("Queue is empty!");
		}
		if (head == tail) {
			tail = null;
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	/**
	 * This method returns the value of the next element in queue.
	 * @return
	 */
	public int peek() {
		if (head == null) {
			throw new NullPointerException("Queue is empty");
		}
		return head.value;
	}

	/**
	 * This method sets how the list(queue) will be printed on screen.
	 */
	public String toString() {
		System.out.print("STACK: ");
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
	
	
	
	private class Node {

		private int value;
		private Node next;
		private int priority;

		/**
		 * Constructor for class Node.
		 * @param value - integer value of an element you want to create
		 */
		public Node(int value) {

			this.value = value;
			this.next = null;

		}

		/**
		 * Constructor for the class Node.
		 * @param value - integer value of an element you want to create
		 * @param priority - integer that shows the priority of an element. The higher the number, the higher the priority.
		 */
		public Node(int value, int priority) {
			this.value = value;
			this.priority = priority;
		}

	}

}
