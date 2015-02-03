import java.util.Scanner;
public class AraayUtil {

	/**
	 * Funkcija samo isprinta članove niza na ekran.
	 * 
	 * @param niz
	 */
	public static void printArray(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	/**
	 * Funkcija prima dužinu niza napravljenog u main funkciji i traži od
	 * korisnika da unese članove tog niza.
	 * 
	 * @param size
	 * @return niz integera
	 */
	public static int[] getUserArray(int size) {
		Scanner in = new Scanner(System.in);
		int[] niz = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.printf("Unesi %d. član niza: ", i + 1);
			niz[i] = in.nextInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija prima veličinu niza i jednu vrijednost. Kreira niz te veličine i svaki član ima proslijeđenu vrijednost.
	 * @param size
	 * @param defaultValue
	 * @return niz integera
	 */
	public static int[]getArray(int size, int defaultValue){
		int[] niz = new int[size];
		for (int i = 0; i < size; i++) {
			niz[i] = defaultValue;
		}
		return niz;
	}
	
	/**
	 * Funkcija prima 2 niza integera i kopira elemente prvog niza u drugi niz.
	 * @param niz1
	 * @param niz2
	 */
	public static void copyArray(int niz1[], int niz2[]){
		
		if(isValidSize(niz1.length, niz2.length) == false){
			throw new IllegalArgumentException("GREŠKA !**Prvi niz ne smije biti veći od drugog niza!** GREŠKA!");
		}
		for(int i=0; i<niz1.length; i++){
			niz2[i] = niz1[i];
		}
	}
	
	/**
	 * Funkcija prima niz integera i pomjera sve elemente u lijevo za jedno mjesto, a na mjesto zadnjeg elementa postavlja nulu.
	 * @param niz
	 */
	public static void pomjeriUlijevo(int []niz){
		
		for(int i=0; i<niz.length; i++){
			if(i==niz.length-1){
				niz[i]=0;
				break;
			}
			niz[i]=niz[i+1];
		}
	}
	
	/**
	 * Funkcija prima niz integera i pomjera sve elemente u desno za jedno mjesto, a na mjesto prvog elementa postavlja nulu.
	 * @param niz
	 */
	public static void pomjeriUdesno(int[]niz){
		
		for(int i=niz.length-1; i>0; i--){
			niz[i]=niz[i-1];
		}
		niz[0]=0;
	}
	
	/**
	 * Funkcija provjerava da li je dužina prvog niza veća od dužine drugog niza
	 * @param size1
	 * @param size2
	 * @return false if size1<=size2, true otherwise
	 */
	private static boolean isValidSize(int size1, int size2){
		return size1 <= size2;
	}

	/**
	 * Funkcija traži od korisnika da unese broj redova i kolona matrice, te onda traži od korisnika da unese elemente te matrice.
	 * @return dvodimenzionalni niz
	 */
	public static int[][] dajMatricu() {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesi broj redova matrice: ");
		int brojRedova = in.nextInt();

		System.out.println("Unesi broj kolona matrice: ");
		int brojKolona = in.nextInt();

		int matrica[][] = new int[brojRedova][brojKolona];

		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojKolona; j++) {
				System.out.printf("Unesi [%d][%d] član matrice: ",i,j);
				matrica[i][j] = in.nextInt();
			}
		}
		return matrica;
	}

	/**
	 * Funkcija prima dvodimenzionalni niz i index tražene kolone, a vraća jednodimenzionalni niz čiji su elementi ustvari elementi kolone po indexom tražene kolone.
	 * @param matrica
	 * @param trazenaKolona
	 * @return int[]
	 */
	public static int[] getColumn(int[][] matrica, int trazenaKolona) {

		int[]niz = new int[matrica[0].length];
		
		for(int i=0;i<matrica.length;i++){
			niz[i]=matrica[i][trazenaKolona];
		}
		
		
		return niz;
	}

	/**
	 * Funkcija prima 1D niz i neki broj, a vraća index tog broja u tom nizu.
	 * @param niz
	 * @param trazeniBroj
	 * @return int
	 */
	public static int linearSearch(int[] niz, int trazeniBroj) {
		int index;
		for(int i=0; i<niz.length; i++){
			if(niz[i]==trazeniBroj){
				index=i;
				return index;
			}
		}
		return -1;
	}

	/**
	 * Funkcija prima jednodimenzionalni niz i sortira ga zavisno od unesene varijable "ascending".
	 * @param niz
	 * @param ascending
	 */
	public static void sortArray(int[] niz, boolean ascending) {

		if(ascending){
			sortAscending(niz);
		}
		if(!ascending){
			sortDescending(niz);
		}
	}

	/**
	 * Funkcija prima 1D niz i sortira elemente od najvećeg do najmanjeg.
	 * @param niz
	 */
	private static void sortDescending(int[] niz) {

		int temp;
		for(int i=0; i<niz.length; i++){
			for(int j=1; j<niz.length; j++){
				if(niz[j-1]<niz[j]){
					temp=niz[j-1];
					niz[j-1]=niz[j];
					niz[j]=temp;
				}
			}
		}
		
	}

	/**
	 * Funkcija prima 1D niz i sortira elemente od najmanjeg do najvećeg.
	 * @param niz
	 */
	private static void sortAscending(int[] niz) {

		int temp;
		for(int i=0; i<niz.length; i++){
			for(int j=1; j<niz.length; j++){
				if(niz[j-1]>niz[j]){
					temp=niz[j-1];
					niz[j-1]=niz[j];
					niz[j]=temp;
				}
			}
		}
		
	}



}
