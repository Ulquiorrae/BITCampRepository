import java.util.Scanner;
public class ChangeCalculation$$$ {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int quarter;
		int dime;
		int nickel;
		int penny;
		float dollar;
		float cents;

		System.out.println("Enter how many quarters you have: ");
		quarter=in.nextInt();

		System.out.println("Enter how many dimes you have: ");
		dime=in.nextInt();

		System.out.println("Enter how many nickels you have: ");
		nickel=in.nextInt();

		System.out.println("Enter how many pennies you have: ");
		penny=in.nextInt();

		float quartertocent=(float) (quarter*(25));
		float dimetocent=(float) (quarter*(10));
		float nickeltocent=(float) (quarter*(5));

		cents=quartertocent + dimetocent + nickeltocent;

		dollar=cents  /100;

		System.out.println("You have " +dollar + " dollars in your pocket!!!");

	}
}