import java.util.Scanner;

/**
 * This is a game, a computer picks a random number in [0,100] range, user
 * inputs numbers until he guesses it or he misses 6 times You can't enter
 * number lower than 0 or higher than 100 The program will give you hints, will
 * tell you if last entered number is lower or higher than the number you are
 * looking for
 * 
 * @author Haris Krkalić BIT Camp
 */

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Let's play a guessing game! :D");
		System.out.println("I'll pick a number from 0 to 100 and you try to guess it ! ");
		System.out.println("You have 6 guesses!");
		System.out.println("Good luck and have fun!");
		System.out.println();

		int randomNumber;
		int guess;
		boolean newGame;
		int novi = 1;

		while (novi == 1) {

			playGame();
			System.out.println("Do you want to play another game? Input true if you do and input false if you don't :D");
			newGame = in.nextBoolean();

			if (newGame == true) {
				novi = 1;
			}

			if (newGame == false) {

				System.out.println("Good game! Thanks for playing. Until next time!");
				novi = 0;
				break;

			}

		}

	}

	public static void playGame() {

		Scanner in = new Scanner(System.in);

		int randomBroj;
		int uneseniBroj;
		int count = 0;
		boolean tacno = true;

		randomBroj = (int) (100 * Math.random()) + 1;

		System.out.println("What's your first guess?");

		while (tacno) {

			count++;

			uneseniBroj = in.nextInt();

			while (uneseniBroj < 0 || uneseniBroj > 100) {

				System.out.println("Enter a number between 0 and 100! Try again!");
				uneseniBroj = in.nextInt();
			}

			if (uneseniBroj == randomBroj) {

				System.out.println("You got it right! It's number " + randomBroj + "." + "Congratulations!");
				break;
			}

			if (count == 6) {

				System.out.println("You didn't get it in 6 tries! The number was: " + randomBroj + ".");
				break;

			}

			if (uneseniBroj < randomBroj) {

				System.out.println("The number is too low. Try again: ");
			} else if (uneseniBroj > randomBroj) {

				System.out.println("The number is too high. Try again: ");
			}

		}
	}
}
