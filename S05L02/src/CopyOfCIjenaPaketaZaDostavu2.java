/* Korisnik unosi dužinu širinu i visinu paketa te njegovu težinu. 
 * Izračunava se volumetrijska težina paketa.
 * Uzima se ona težina čija je vrijednost veća i na osnovu toga se računa cijena paketa(pošiljke).
 * Cijena paketa je 3 km po kilogramu.
 */
import java.util.Scanner;
public class CopyOfCIjenaPaketaZaDostavu2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double duzina, visina, sirina, tezina;

		System.out.println("Unesi dužinu stranice paketa: ");
		duzina = in.nextDouble();
		System.out.println("Unesi širinu stranice paketa: ");
		sirina = in.nextDouble();
		System.out.println("Unesi visinu stranice paketa: ");
		visina = in.nextDouble();
		System.out.println("Unesi težinu paketa u kg: ");
		tezina = in.nextDouble();

		double cijena=dajCijenu(duzina, sirina, visina, tezina);
		
		System.out.printf("Ukupna cijena paketa je: %.2f km.",cijena);
	}

	
	/**
	 * Funkcija prima dimenzije paketa kao double i vraća ukupnu cijenu pošiljke obzirom na to da li je veća volumetrijska težina ili standardna težina paketa.
	 * @param duzina
	 * @param sirina 
	 * @param visina 
	 * @param tezina 
	 * @return double
	 */
	 private static double dajCijenu(double duzina, double sirina, double visina, double tezina) {
		
		double ukupnaCijena;
		double vTezina = dajVolumetrijskuTezinu(duzina, sirina, visina);
		
		if (tezina > vTezina) {
			ukupnaCijena = tezina*3;
		} else {
			ukupnaCijena = vTezina*3;
		}
		return ukupnaCijena;
	}


	/**
	 * Funkcija prima visinu, širinu i dužinu paketa i izračunava njegovu volumetrijsku težinu.
	 * @param duzina
	 * @param sirina
	 * @param visina
	 * @return double volumetrijska težina paketa
	 */
	 private static double dajVolumetrijskuTezinu(double duzina, double sirina, double visina) {
		double vTezina;
		vTezina = (visina * sirina * visina) / 5000;
		return vTezina;
	}
}
