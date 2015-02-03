import java.util.Scanner;
public class PaketTEST {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Paket paket1 = new Paket();
		
		System.out.println("Enter package width: ");
		double width = in.nextInt();
		System.out.println("Enter package height: ");
		double height = in.nextInt();
		System.out.println("Enter package length: ");
		double length = in.nextInt();
		System.out.println("Enter package weight: ");
		double weight = in.nextInt();
		
		paket1.setWidth(width);
		paket1.setHeight(height);
		paket1.setLength(length);
		paket1.setWeight(weight);
		
		
		
		System.out.printf("Težina paketa je: %.4f",paket1.getWeight());
		
	}
}
