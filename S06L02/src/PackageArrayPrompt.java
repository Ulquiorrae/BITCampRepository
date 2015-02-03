import java.util.Scanner;


public class PackageArrayPrompt {

	public static void main(String[] args) {

		Paket[] paketi = new Paket[3];
		
		for(int i=0; i<paketi.length; i++){
			paketi[i] = getPackage();
		}
		
		for(Paket paket1 : paketi){
			System.out.println(paket1);
		}
	}
	
	public static Paket getPackage(){
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
		
		
		return paket1;
	}

}
