package Vježbe;

public class LinkedListIntTEST {

	public static void main(String[] args) {
		
		LinkedListInt newList = new LinkedListInt();
		
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		
		newList.printList();
		System.out.println("################");
		
//		int testArray[] = newList.toArray();
//		
//		for(int i=0; i<testArray.length-1; i++) {
//			System.out.println(testArray[i]);
//		}
		
		LinkedListInt newList2 = new LinkedListInt();
		newList2.add(10);
		newList2.add(11);
		newList2.add(12);
		newList2.add(13);
		
		newList.add(newList2);
		
		newList.printList();
		
	}
	
}
