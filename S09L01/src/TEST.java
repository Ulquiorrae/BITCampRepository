
public class TEST {

	//Testna klasa
	
	public static void main(String[] args) {
		QueueInt queue = new QueueInt();
		for (int i=1; i<=5; i++)
		{
			queue.push(i);
		}
//		System.out.println(queue.peek());
//		queue.push(11);
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());

		
		queue.push(125);
		
		queue.pop();
		queue.pop();
		queue.pop();
		
		
		
		System.out.println(queue.toString());
		
		

	}

}