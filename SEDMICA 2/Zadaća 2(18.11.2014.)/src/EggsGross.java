import java.util.Scanner;
public class EggsGross {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int eggs;
		int dozens;
		int leftover;
		int gross;
		int grossover;

		System.out.println("Enter how many eggs do you have: ");
		eggs=in.nextInt();
		
		gross=eggs/144;
		grossover=eggs%144;

		dozens=grossover/12;
		leftover=grossover%12;

		System.out.println("Your current egg status: ");
		System.out.println("Gross: " +gross);
		System.out.println("Dozens: " +dozens);
		System.out.println("Leftovers:" +leftover);
	}
}