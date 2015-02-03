import java.util.Scanner;
public class rekurzijaMINESWEEP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int [][] polje=napraviPolje();
		ispisiMatricu(polje);
		System.out.println("#-------------------------------------#");
		
		int x=in.nextInt();
		int y=in.nextInt();
		
		
		otvoriPolje(polje,x,y);
		ispisiMatricu(polje);
	}
	
	/**
	 * Funkcija postavlja mine kao broj -1 na polja koja su generisana funkcijom randomInRange
	 * @param polje
	 */
	private static void postaviMine(int[][] polje) {

		int x, y;
		int brojMina;
		int mina = -1;
		int brojac = 0;

//		brojMina = (int) (polje.length * polje.length * (0.3));
		brojMina = 15;

		while (brojac != brojMina) {

			x = randomInRange();
			y = randomInRange();

			if (polje[x][y] != -1) {
				polje[x][y] = mina;
				brojac++;
			}

		}
	}

	/**
	 * Funkcija generira random broj između 0 i 4 (jer su to indexi redova i kolona matrice)
	 * @return integer
	 */
	private static int randomInRange() {
		Scanner in = new Scanner(System.in);
		int randomNum;
		randomNum = (int) (0 + Math.random() * (4 - 0));
		return randomNum;
	}

	/**
	 * Funkcija ispisuje dvodimenzionalni niz, tj. poljanu za igranje.
	 * 
	 * @param polje
	 */
	private static void ispisiMatricu(int[][] polje) {
		System.out.println("+-----------------------------+");
		for (int i = 0; i < polje.length; i++) {
			System.out.print("| ");

			for (int j = 0; j < polje[i].length; j++) {
				System.out.printf("%2d  | ", polje[i][j]);
			}
			System.out.println();
			System.out.println("+-----------------------------+");
		}
		System.out.println();
	}

	/**
	 * Funkcija je void i treba da kreira dvodimenzionalni niz.
	 * 
	 * @return dvodimenzionalni niz
	 */
	private static int[][] kreirajMatricu() {
		Scanner in = new Scanner(System.in);

		int matrica[][] = new int[5][5];
		
		return matrica;
	}

	
	public static int[][] napraviPolje(){
		
		int[][] polje = kreirajMatricu();
		postaviMine(polje);
		System.out.println();
		
//		postaviBrojeveUOkoliniMine(polje);
		
		return polje;
	}

	public static void otvoriPolje(int [][]matrica,int x, int y){
		
		
		if(x<0 || x>4 || y<0 || y>4){
			return;
		}
		
		if(matrica[x][y]==0 && matrica[x][y]!=5){
			matrica[x][y]=5;
			otvoriPolje(matrica, x+1, y);
			otvoriPolje(matrica, x-1, y);
			otvoriPolje(matrica, x, y+1);
			otvoriPolje(matrica, x, y-1);
		}
		
		return;
	}
}