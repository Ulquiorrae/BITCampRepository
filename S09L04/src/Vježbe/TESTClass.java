package Vježbe;

public class TESTClass {

	public static void main(String[] args) {
		
		User test = new User("Haris", "Krkalic", 18, true);
		System.out.println(test.toCSVString(","));
		
		User test2 = new User("Vedad", "Zornic", 22, false);
		System.out.println(test2.toCSVString(","));
		
		CSVRewrite.savetoFile("user", test.toCSVString(","));
		CSVRewrite.savetoFile("user", test2.toCSVString(","));
	}
	
}
