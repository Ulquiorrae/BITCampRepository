import java.util.Scanner;
public class Palindrom {

	public static void main(String args[]) {
		
		
		Scanner in = new Scanner(System.in);
		
		String rijec1;
		String rijec2;
		
		System.out.println("Unesi prvu riječ: ");
		rijec1 = in.next( );
		
		
		System.out.println("Unesi drugu riječ: ");
		rijec2 = in.next( );
		

		
			
			
		String noviString=rijec1+rijec2;
		
		boolean sadrzi=noviString.contains(rijec2);
		
		if(sadrzi) System.out.print("Druga riječ je sadržana u prvoj !!");
		else System.out.println("Druga riječ nije sadržana u prvoj !!");
				
			
			
			
			
		
			
		}
		
		

		

	}