
public class TEST {

	public static void main(String[] args) {

		ArrayListInt list = new ArrayListInt();
		LinkedListInt list2 = new LinkedListInt();

		list2.add(3);
		list2.add(125);
		list2.add(12);

		int[] row = list.toArray();

//		for (int i = 0; i < row.length; i++) {
//			System.out.println(row[i]);
//		}
		
		System.out.println(list2.toString());
		
		System.out.println("####################");
		
		list2.remove(-1);
		System.out.println(list2.toString());
		 
	}
}
