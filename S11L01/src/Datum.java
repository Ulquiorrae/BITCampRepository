import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Datum {

	public static void main(String[] args) {

		
		Date startDate = new Date();
		
		int numberofPrimes = countPrimes(1, 2000000);
		
		Date endDate = new Date();
		
		System.out.println(numberofPrimes);
		
		double difference = (endDate.getTime()  - startDate.getTime())/1000;
		
		System.out.println(difference + "s");

	}

	private static int countPrimes(int start, int end) {

		int counter = 0;
		for (int i = start; i < end; i++) {

			if (isPrime(i)) {
				counter++;
			}
		}
		return counter;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
