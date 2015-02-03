public class IsteRijeciArgs {

	public static void main(String[] args) {

		String prvi[] = args[0].split(" ");
		String drugi[] = args[1].split(" ");

		findSameWords(prvi, drugi);
	}
	
	/**
	 * Funkcija prima 2 niza stringova i ispisuje riječi koje se nalaze u oba ta stringa.
	 * @param prvi - niz stringova
	 * @param drugi - niz stringova
	 */
	private static void findSameWords(String[] prvi, String[] drugi) {

		String niz[] = new String[100];
		int k = 0;
		int brojac = 0;

		for (int i = 0; i < prvi.length; i++) {
			for (int j = 0; j < drugi.length; j++) {
				if (prvi[i].equals(drugi[j])) {
					niz[k] = prvi[i];
					k++;
					brojac++;
				}
			}
		}
		System.out.println();  		//Čisto da bi u terminalu ispis bio izolovan, da bi bilo čitljivije
		System.out.print("Iste riječi u ove dvije rečenice su: ");
		for (int i = 0; i < brojac; i++) {
			if (i == brojac - 1) {
				System.out.println(niz[i]);
				break;
			}
			System.out.printf(niz[i] + ",");
		}
		System.out.println(); 		//Čisto da bi u terminalu ispis bio izolovan, da bi bilo čitljivije
	}
}
