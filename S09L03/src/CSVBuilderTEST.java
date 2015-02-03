
public class CSVBuilderTEST {

	public static void main(String[] args) {
		
		CSVBuilder csv = new CSVBuilder();
		
		csv.append("BUREK");
		csv.append(125);
		
		System.out.println(csv.toString());
		
	}
	
}
