//Writing a program which will calculate the distance a body will cover in free fall for the provided time.
import java.util.Scanner;

public class FreeFall {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		double time;
		double distance;
		double g = 9.81;
		double timeSec;
		System.out
				.println("How long will the body fall? Enter time(coverted to minutes) : ");
		time = in.nextDouble();

		timeSec = (int)time * 60;

		distance = (g * timeSec * timeSec) / 2;

		System.out
				.println("While in free fall, the body covered distance equal to: "
						+ distance + " meters");

	}

}
