/*Napisati funkciju koja kao parametar prima cijeli ne negativni broj n a koja vraca
niz od 8 clanova gdje svaki od clanova predstavlja jednu cifru broja n napisanog u 
binarnom zapisu. Za broj 3 program treba da vrati niz {0, 0, 0, 0, 0, 0, 1, 1}.
 */
import java.util.Scanner;
public class CifreBinarnogBrojaSmješteneUNiz {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int broj=unesiPozitivanBroj();
		
		String[]cifreBinarnogBroja=getBinarFigures(broj);
		
		ispisiRezultat(broj,cifreBinarnogBroja);
	}

	/**
	 * Funkcija estetski lijepo ispisuje sve članove niza Stringova(članovi niza sadrže cifre binarnog oblika broja).
	 * @param broj
	 * @param cifreBinarnogBroja
	 */
	private static void ispisiRezultat(int broj, String[] cifreBinarnogBroja) {

			System.out.print("Cifre broja 3 pretvorenog u binarni oblik: { ");
			for(int i=0;i<cifreBinarnogBroja.length;i++){
				if(i==cifreBinarnogBroja.length-1){
					System.out.print(cifreBinarnogBroja[i]);
					break;
				}
				System.out.print(cifreBinarnogBroja[i]+",");
			}
			System.out.println(" }");
	}

	/**
	 * Funkcija kao parametar prima broj unesen sa tastature i vraća niz stringova u 
	 * kojem svaki element predstavlja jednu cifru binarnog oblika tog broja.
	 * @param broj
	 * @return niz Stringova
	 */
	private static String[] getBinarFigures(int broj) {

		String[]cifre=new String[8];
		int brojac=0;
		String temp="";
		int cifra;
		int i=cifre.length-1;
		
			while(broj!=0){
				cifra=broj%2;
				temp=temp+cifra;
				cifre[i]=temp;
				i--;
				broj=broj/2;
				temp="";
			}
			
			for(int j=i;j>=0;j--){
				String tempZero="";
				tempZero=tempZero+0;
				cifre[j]=tempZero;
			}
		return cifre;
	}
	

	/**
	 * Funkcija vraća uneseni broj ali samo ako je nesen pozitivan broj.
	 * @return integer
	 */
	private static int unesiPozitivanBroj() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jedan pozitivan cijeli broj: ");
		int broj=in.nextInt();
		while(!pozitivanBroj(broj)){
			System.out.println("Uneseni broj nije pozitivan broj! Unesi jedan pozitivan broj: ");
			broj=in.nextInt();
		}
		return broj;
	}

	/**
	 * Funkcija prima kao parametar jedan broj i provjerava da li je on pozitivan.
	 * @param broj tipa integer
	 * @return true ukoliko je broj pozitivan, u suprotnom return false
	 */
	private static boolean pozitivanBroj(int broj) {
		if(broj>0) return true;

		return false;
	}
}
