//A program which calculates the number of tiles of a given size
//necessary to cover a pool of a given size. 
//Case I: assuming the number of tiles will always be an integer.
//Case II: “real life”
import java.util.Scanner;

public class TilesIDEAL {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int stranicaPloce;
		int povrsinaPloce;
		int duzinaBazena;
		int sirinaBazena;
		int povrsinaBazena;
		double brojPloca;

		System.out.println("Unesi stranicu pločice u metrima: ");
		stranicaPloce = in.nextInt();

		povrsinaPloce = stranicaPloce * stranicaPloce;

		System.out.println("Unesi dužinu bazena u metrima: ");
		duzinaBazena = in.nextInt();

		System.out.println("Unesi širinu bazena u metrima: ");
		sirinaBazena = in.nextInt();

		povrsinaBazena = duzinaBazena * sirinaBazena;

		brojPloca = (double)povrsinaBazena / povrsinaPloce;

		System.out.println("Da bi se popločao bazen površine " + povrsinaBazena
				+ " metara kvadratnih potrebno, je imati " + brojPloca
				+ " keramičkih ploča, površine " + povrsinaPloce + " metara kvadratnih.");
	}
}
