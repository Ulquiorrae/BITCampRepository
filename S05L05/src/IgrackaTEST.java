import java.util.Scanner;
public class IgrackaTEST {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Unesi ime igračke: ");
//		String ime = in.nextLine();
//		
//		System.out.println("Unesi tip igračke: ");
//		String tip = in.nextLine();
//		
//		System.out.println("Unesi cijenu igračke: ");
//		int cijena = in.nextInt();
		
		Igracka igracka1 = new Igracka("semra","barbika",25,89);
		
		System.out.println(igracka1);
		
	}
}
