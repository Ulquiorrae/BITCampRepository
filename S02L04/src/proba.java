import java.util.Scanner;
public class proba {
	
	/**
	 * @author Vedad
	 * program služi kao testni primjer
	 * 
	 * @param args
	 */
	
	public static void ispis(){
		
		
		System.out.println("Nisi ništa proslijedio!!");
		
	}
	
	public static void ispis(int x){
		
		System.out.printf("Proslijedio si cijeli broj %d. \n", x);
		
	}
	
	public static int ispis(String str, double d){
		
		System.out.printf("Proslijedio si string %s i broj %.2f.\n", str, d);
		return (int)d;
		
	}
	
	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	
	ispis();
	ispis(4);
	System.out.println(ispis("1",2));
	
	
	
}
}
