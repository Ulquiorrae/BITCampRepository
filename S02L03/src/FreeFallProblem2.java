//Writing a program which will calculate if a body free falling 
//from a provided height will hit the ground in a given time,
//if not it should output how much longer the body will fall.
import java.util.Scanner;

public class FreeFallProblem2 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		double height; // input in meters
		double time; // input in minutes(will convert to second later on)
		double g = 9.81; // meters per second
		double timeSec;
		double distance;
		double difference;

		System.out
				.println("Enter the height from which the body starts falling: ");
		height = in.nextDouble();

		System.out
				.println("Enter time duration of the fall expressed in minutes: ");
		time = in.nextDouble();

		timeSec = time * 60;
		distance = (g * timeSec * timeSec) / 2;

		difference = height - distance;

		if ((distance == height) || (distance > height)) {

			System.out
					.println("The body will hit the ground in given time, it will cover the distance of "
							+ distance + "  meters in " + time + " minutes");

		}

		else {

			System.out
					.println("The body will not cover the given distance! It takes "
							+ difference
							+ " meters more for body to hit the ground!");

		}

	}
}
