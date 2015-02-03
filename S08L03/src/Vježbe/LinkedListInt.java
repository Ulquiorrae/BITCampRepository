package Vježbe;

public class LinkedListInt {

	private Node head;
	private int size;
	
	/**
	 * Constructor for LinkedListInt, doesnt recieve any parameters.
	 */
	public LinkedListInt(){
		head = null;
		size = 0;
	}
	
	/**
	 * Method for adding a new element
	 * @param value - value of an element we want to add to the list
	 */
	public void add(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {      // if first node is null, than we redirect a first one to 
			head = newNode;			// redirected first node(head node) to the newly created one
			size++;
			return;
		}
		Node current = head;  			//napravimo novi node
		while(current.next != null) {   //sve dok ovaj node ne dodje do kraja idemo dalje
			current = current.next;     //idemo dalje, posavlja current na ono na šta je current pokazivao
		}
		current.next = newNode;
		size++;
		
	}
	
	/**
	 * Method that adds a new element with value "value" on a position indexed with "index"
	 * @param value - value of a new element
	 * @param index - index that you want that element to be on
	 */
	public void add(int value, int index) {

		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index is out of bound!");
		}

		Node newNode = new Node(value);

		if (index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;

		}
		if (index == size) {
			add(value);
			return;
		}

		Node behind = head.next;
		Node that = head;
		int counter = 1;
		while (counter < index) {

			behind = behind.next;
			that = that.next;
			counter++;
		}

		that.next = newNode;
		newNode.next = behind;

	}
	
	/**
	 * Method which removes a Node from a list
	 * @param index
	 */
	public void removeAt(int index) {
		
		if(index <0 || index >= size) {
			throw new IllegalArgumentException("Index is not in range !");
		}
//		if(head.next == null){      //ukoliko imamo samo jedan element, onda samo index 0 prolazi provjeru exceptiona i dovoljno je samo head psotaviti na null te smanjiti size
//			head = null;
//			size--;
//			return;
//		}
		//ovaj uslov iznad možemo izbrisati jer u biti ovaj IF ispod rješava problem kada imamo samo jedan elemenat u listi.
		if(index ==0){
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;	//drugi, odma iza prvog
		Node previous = head;		//prvi
		int counter = 1;            //1 jer kreće od currenta, od drugog elementa, i ovaj counter broji dokle smo došli
	
		while(counter < index) {   
			current = current.next;
			previous = previous.next;
			counter++;
			//nakon ovoga whilea current pokazuje na element koji izbacujemo a previous na prethodni
		}
		previous.next = current.next;
		current.next = null;         //brišemo onaj sljedeći pokazivać, od elementa koji smo izbacili na sljedeći element.
		
		
	}
	
	/**
	 * Method that copies LinkedList items into a standard array
	 * @return array of integers
	 */
	int[] toArray() {
		int[] newArray = new int[size];
		int i=0;
		Node current = head;  			
		while(current.next != null) {  
			
			newArray[i] = current.value;
			current = current.next;  
			i++;
		}
		return newArray;
	}
	
	/**
	 * Method that fuses 2 linked lists.
	 * @param other - another LinkedList that you want to add to the first one.
	 */
	public void add(LinkedListInt other){
		
		Node current1 = this.head;
		Node current2 = other.head;
		int counter = 1;            
		while(current1.next != null) {   
			current1 = current1.next;     
		}
		current1.next = current2;
	}
	
	
	/**
	 * Method for printing a list on screen. 
	 */
	public void printList() {
		Node tempNode = head;         			 //postavimo pokazivac tempNode na početak liste
		while (tempNode != null) {    			 //sve dok taj pokazivac nije nula, idemo dalje
			System.out.println(tempNode.value);  //ispisujemo svaki Node
			tempNode = tempNode.next;            
		}
	}
	
	private class Node{
		
		public int value;
		public Node next;
		
		/**
		 * Constructor for class Node.
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Constructor for class Node, recieves both value and next
		 * @param value
		 * @param next
		 */
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	
//	private class Node<T>{
//		
//		public T value;
//		public Node next;
//		
//		/**
//		 * Constructor for class Node.
//		 * @param value
//		 */
//		public Node(T value) {
//			this.value = value;
//			this.next = null;
//		}
//		
//		/**
//		 * Constructor for class Node, recieves both value and next
//		 * @param value
//		 * @param next
//		 */
//		public Node(T value, Node next) {
//			this.value = value;
//			this.next = next;
//		}
//		
//	}
	
}
