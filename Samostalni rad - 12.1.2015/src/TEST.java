import java.io.ObjectInputStream.GetField;
import java.util.Stack;


public class TEST {

	public static void main(String[] args) {
		

		Stackk test = new Stackk();
		
		test.push(5);
		test.push(10);
		test.push(15);
		test.push(20);
		test.push(25);
		test.push(30);
		
		test.pop();
		
		int broj = test.getMin();
		
		System.out.println(test.toString());
		System.out.println("Minimalni element je: " + test.getMin());
		
	}
	
}
