
public class BinarySearchTree {

	private Node root;
	
	public BinarySearchTree() {
		
		this.root = null;
		
	}
	
	public void add(int value) {
		
		if(root == null) {
			root = new Node(value);
		}
		else {
			add(root, value); //privatni add pozovemo
		}
		
	}
	
	private void add(Node current, int value) {
		if(current == null) {
			current = new Node(value);
			return;
		} //ovaj if nije ok, ne radi, NE RADI
		
		if(value <= current.value) {
			if(current.left == null) {
				current.left = new Node(value);
				return;
			}
			add(current.left, value); //opet pozovemo privatni add pošto je lijevo pun i šaljemo mu ..
		}
		else {
			if(current.right == null) {
				current.right = new Node(value);
				return;
			}
			add(current.right, value);
		}
		
	}
	
	public void printTree() {
		printTree(root);
	}

	private void printTree(Node root) {

		if (root == null) {
			return;
		}
		printTree(root.left);
		System.out.println(root.value);
		printTree(root.right);
	}
	

	

	
	private class Node {
		
		private int value;
		private Node left;
		private Node right;
		
		
		public Node(int value) {
			
			this.value = value;
			this.left = null;
			this.right = null;
			
			
		}
		
	}
	
}
