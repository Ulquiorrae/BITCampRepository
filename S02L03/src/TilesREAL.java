import java.util.Scanner;

public class TilesREAL {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		double stranicaPloce;
		double povrsinaPloce;
		double duzinaBazena;
		double sirinaBazena;
		double povrsinaBazena;
		double brojPloca;

		System.out.println("Unesi stranicu pločice u metrima: ");
		stranicaPloce = in.nextDouble();

		povrsinaPloce = stranicaPloce * stranicaPloce;

		System.out.println("Unesi dužinu bazena u metrima: ");
		duzinaBazena = in.nextDouble();

		System.out.println("Unesi širinu bazena u metrima: ");
		sirinaBazena = in.nextDouble();

		povrsinaBazena = duzinaBazena * sirinaBazena;

		brojPloca = povrsinaBazena / povrsinaPloce;

		System.out.printf("Da bi se popločao bazen površine %1.3f metara kvadratnih, potrebno je imati %1.2f keramičkih ploča, površine %1.3f metara kvadratnih.", povrsinaBazena,brojPloca,povrsinaPloce);
	}
}