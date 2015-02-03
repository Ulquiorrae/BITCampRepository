
public class TESTCLass {

	public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		
		
		queue.push(5,0);
		queue.push(10,2);
		queue.push(15,1);
		queue.push(20,0);
		queue.push(125,1);
		queue.push(120,2);
		
		System.out.println(queue.toString());
		
		System.out.println("####################");
		
		
		System.out.println(queue.toString());
		
		
	}
	
}
