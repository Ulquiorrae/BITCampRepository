package Vježbe_GenericStuff;

import java.util.Iterator;

public class GenericLinkedList<T> implements Iterable<T> {

	/**
	 * Attributes of {@link GenericLinkedList} class.
	 */
	private Node head;
	
	/**
	 * Constructor for class {@link GenericLinkedList}
	 */
	public GenericLinkedList() {
		this.head = null;
	}
	
	/**
	 * This method adds a new elements with forwarded generic type value, into a list.
	 * @param value - value of an element we want to add to a list. Its type is generic.
	 */
	public void add(T value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	/**
	 * This method removes an element from the list on forwarded index.
	 * @param index - integer
	 */
	public void removeAt(int index) {
		if(index < 0 || index >= getSize()) {
			throw new IllegalArgumentException("Index is not in range!");
		}
		if(index == 0) {
			head = head.next;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while( counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
	}
	
	/**
	 * This method returns the value of an element on a given index. Its generic type.
	 * @param index
	 * @return value of T type - generic type.
	 */
	public T getAt(int index) {
		Node current = head;
		int counter = 1;
		
		while (counter < index) {
			current = current.next;
			counter++;
		}
		return (T)current.value;
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
	 * This method returns list size.
	 * @return integer
	 */
	private int getSize() {
		int size = 0;
		Node current = head;
		while (current.next != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	/**
	 * This method checks if the forwarded value is contained in the list or not.
	 * @param lookForThis
	 * @return true if the list contains the value or false if the list doesn't contain the value
	 */
	public boolean contains(T lookForThis) {
		Node current = head;
		while(current.next != null) {
			if(current.value == lookForThis) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	


	private class Node <T> {
		/**
		 * Attributes of {@link Node} class.
		 */
		public T value;
		public Node next;
		
		/**
		 * Constructor for class {@link Node}
		 * @param value
		 */
		public Node(T value) {
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Constructor for class {@link Node}
		 * @param value - T type
		 * @param next - Node type
		 */
		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		/**
		 * Gets the value of attribute value from class {@link Node}
		 * @return
		 */
		public T getValue() {
			return value;
		}

		/**
		 * Sets the attribute value from class {@link Node} on a forwarded value.
		 * @param value - generic type T
		 */
		public void setValue(T value) {
			this.value = value;
		}

		/**
		 * Getter for attribute next from class {@link Node}
		 * @return
		 */
		public Node getNext() {
			return next;
		}
		
	}


	@Override
	public Iterator<T> iterator() {
		return new Biterator<T>(head);
	}
	
	private class Biterator<T> implements Iterator<T> {
		private Node<T> current;
		
		public Biterator(Node start) {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		/**
		 * Metoda vrati vrijednost noda i pomjeri se na slijedeći.
		 */
		@Override
		public T next() {
			T value = current.value;
			current = current.next;
			return value;
		}
	}
	
}
