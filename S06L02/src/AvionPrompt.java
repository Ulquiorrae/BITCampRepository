import java.util.Scanner;


public class AvionPrompt {

	public static void main(String[] args) {

		Avion a = new Avion();
		Paket[] packages = a.getPackages();
		
		for(int i=0; i<packages.length; i++){
			packages[i] = getPackage();
		}
		
		System.out.printf("Ukupna tezina aviona: %f", a.getTotalWeight());
	}

	
	public static Paket getPackage(){
		Scanner in = new Scanner(System.in);
		
		Paket p = new Paket();
		
		System.out.println("Enter package width: ");
		double width = in.nextInt();
		System.out.println("Enter package height: ");
		double height = in.nextInt();
		System.out.println("Enter package length: ");
		double length = in.nextInt();
		System.out.println("Enter package weight: ");
		double weight = in.nextInt();
		

		p.setWidth(width);
		p.setHeight(height);
		p.setLength(length);
		p.setWeight(weight);
		
		
		return p;
	}
	
	
}
