import java.util.Stack;


public class MyQueue {

	private Stack first = new Stack();
	private Stack second = new Stack();
	
	/**
	 * This methods adds an element to a stack.
	 * @param value
	 */
	public void push(int value) {
		first.push(value);
	}
	
	/**
	 * This method pops the first element of the stack.
	 * @return
	 */
	public int pop() {

		if (second.isEmpty() == true) {
			while (first.isEmpty() == false) {
				second.push(first.pop());
			}
		}
		return (int) second.pop();

	}
	
	/**
	 * Gives the next value in the stack.
	 * @return
	 */
	public int peek() {
		return (int) second.peek();
	}

	public int get(int index) {
		return (int) second.get(index);
	}
	
	
}
