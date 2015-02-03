import java.time.chrono.MinguoChronology;


public class Stackk {

	private Node head;
	private int min = 0;
	
	/**
	 * Constructor for class {@link Stack}
	 */
	public Stackk() {
		this.head = null;
	}

	/**
	 * This method adds a new element on top of the stack.
	 * Method checks if the current value of
	 * attribute min(represents minumum number in the stack)
	 * is higher than the newly added value.
	 * Sets minimum accordingly.
	 * @param value - integer number
	 */
	public void push(int value) {

		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		if (min == 0) {
			min = newNode.value;
		} else if (min > newNode.value) {
			min = newNode.value;
		}

	}
	
	/**
	 * This method removes the first element in the stack(the last element that was added).
	 * @return
	 */
	public int pop() {
		
		if(head == null) {
			throw new NullPointerException("The stack is empty!");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
		
	}
	
	/**
	 * This method returns the value of the minimum element in the stack.
	 * @return
	 */
	public int getMin() {
	       return this.min;
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
	
	
	private class Node {
		
		private int value;
		private Node next;
		
		/**
		 * Constructor for class {@link Node}
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Constructor for class {@link Node}
		 */
		public Node() {
			this.value = 0;
			this.next = null;
		}
		
		/**
		 * Constructor for class {@link Node}
		 * @param value
		 * @param next
		 */
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
