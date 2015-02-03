import java.util.Scanner;
public class HelloYou {

public static void main(String args[]) {
		
	Scanner in = new Scanner(System.in);
	
	String ime;
	
	System.out.print("Unesi svoje ime: ");
	ime = in.next();
	
	
	String capsIme=ime.toUpperCase();
	
	System.out.print("Hello " + capsIme +" :)");
	
			
	
}

}
