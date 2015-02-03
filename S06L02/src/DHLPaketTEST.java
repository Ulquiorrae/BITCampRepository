import java.util.Scanner;
public class DHLPaketTEST {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		DHLPaket dhlp = new DHLPaket();
		
		System.out.println("Enter package width: ");
		double width = in.nextInt();
		System.out.println("Enter package height: ");
		double height = in.nextInt();
		System.out.println("Enter package length: ");
		double length = in.nextInt();
		System.out.println("Enter package weight: ");
		double weight = in.nextInt();
		
		dhlp.setWidth(width);
		dhlp.setHeight(height);
		dhlp.setLength(length);
		dhlp.setWeight(weight);
		
		System.out.printf("Težina je: %f",dhlp.getWeight());
		System.out.println();
		System.out.printf("Cijena dostave je: %.4f",dhlp.getPrice());
		System.out.println();
		System.out.printf("DImenzionalna težina je: %.4f",dhlp.getDimensionalWeight());
	}
}