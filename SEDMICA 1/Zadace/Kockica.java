public class Kockica {

	public static void main(String args[]) {


		double randomBroj1 = Math.random();
		double randomBroj2 = Math.random();
		double newBroj1= randomBroj1*6 + 1;
		double newBroj2= randomBroj2*6 + 1;
		int round1 = (int) Math.round(newBroj1);
		int round2 = (int) Math.round(newBroj2);
		System.out.println(newBroj1);
		System.out.println(newBroj2);
		System.out.println(round1);
		System.out.println(round2);


	}
}
