
public class RecursiveSum {

public static void main(String[] args) {
		
		int sum = suma(3);
		System.out.println("Suma je: "+ sum);
	}

	public static int suma(int number) {
		int sum;
		if (number == 1) return (1);
			sum = number + suma(number - 1);
		return sum;
	}
}
