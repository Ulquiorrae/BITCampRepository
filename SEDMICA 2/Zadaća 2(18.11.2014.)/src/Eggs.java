import java.util.Scanner;
public class Eggs {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int eggs;
		int dozen;
		int leftover;

		System.out.println("Enter how many eggs do you have: ");
		eggs=in.nextInt();


		dozen=eggs/12;
		leftover=eggs%12;

		System.out.println("You have "+dozen+" dozens and " + leftover +" leftover eggs.");

	}
}
