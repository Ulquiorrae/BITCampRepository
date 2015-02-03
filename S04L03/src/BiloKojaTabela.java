
public class BiloKojaTabela {

	public static void main(String[] args) {

		int brojRedova = 3;
		int brojKolona = 5;
		char[][]igra = novaIgra(brojRedova , brojKolona);
		
		ispisiStanjeIgre(igra);
		
//		char znak = 'X';
//		String pozicija = "A0";
//		odigrajPotez(igra, znak, pozicija);
//		odigrajPotez(igra, 'Y', "B0");
		
//		System.out.println("\n\n\n\n IKS - OKS \n\n\n\n");
//		char[][]iksOks = novaIgra(3,3);
//		odigrajPotez(iksOks, 'X', "B1");
//		odigrajPotez(iksOks, 'O', "A0");
//		odigrajPotez(iksOks, 'X', "A2");
//		odigrajPotez(iksOks, 'O', "A1");
	}

	
	
	/**
	 * Funkcija postavlja uneseni znak na poziciju koju smo unijeli sa tastature.
	 * @param igra - polje za igru
	 * @param znak - simbol koji označava nekog igrača, recimo u IKSOKS bi to bili simboli X ili O zavisno od toga šta igrači odaberu.
	 * @param pozicija - pozicija oblika [x][y] koja predstavlja poziciju u matrici tj. poljani za igru u koju upisujemo odabrani simbol.
	 */
	private static void odigrajPotez(char[][] igra, char znak, String pozicija) {

		int kolona = pozicija.toUpperCase().charAt(0) - 'A';	//Pošto mi unosimo A0,A1,B3,C2.....onda možemo izolirati prvo znak kao slovo, kao char i oduzeti A da dobijemo int vrijednost. Koristimo UPPERCASE da bi bili sigurni da će to uvijek biti veliko slovo
		int red = Integer.parseInt(pozicija.substring(1));  	//pretvorimo drugi znak iz stringa u integer i dobijemo iz C5....dobijemo broj 5 .
		igra[red][kolona] = znak;								//Uneseni znak postavimo na poziciju koju smo unijeli, tj pretvorili smo stringove u pozicije [x][y] kao lokacije u matrici				
		ispisiStanjeIgre(igra);									//ispisuje stanje igre nakon odigranog poteza.
	}


	private static void ispisiStanjeIgre(char[][] igra) {

		int brojRedova = igra.length;     									//Uzimamo broj redova kao dužinu matrice, što predstavlja dužinu reda matrice.
		int brojKolona = igra[0].length;									//Uzimamo prvi red jer sigurno postoji i izvučemo njegovu dužinu. TO nam predstavlja dužinu kolone, tj. "dubinu" matrice.
		
		ispisiZaglavlje(brojKolona);										//Ispisuje horizontalnu liniju na vrhu tabele i nazive polja.(A B C D E)
		for(int i=0; i<brojRedova; i++){	
			char[] red = igra[i];											//Uzima lokaciju reda, tj. redni broj reda u matrici.
			ispisiRed(red, i);												//Ispisuje jedan red...njegov index, početak reda, vrijednost i uspravne linije.
		}
	}

	
	private static void ispisiRed(char[] red, int indexReda) {
		ispisiIndexReda(indexReda);											//ispisuje index reda na početku tabelice, indexi redova na slici
		System.out.print(" "+'|');
		for(int i=0; i<red.length; i++){
			char polje = red[i];
			if(polje == 0){
				polje = ' ';
			}
			System.out.printf(" %c |", polje);
		}
		ispisiHorizontalnuLiniju(red.length);  								//ispisuje hor. liniju nakon ispisa reda.
	}


	private static void ispisiIndexReda(int indexReda) {		
		System.out.printf("%4d", indexReda);
		
	}


	/**
	 * Funkcija ispisuje prvu liniju tabele preko crtica te dodaje naziv polja...A3,C5..
	 * @param brojKolona
	 */
	private static void ispisiZaglavlje(int brojKolona) {
		System.out.print("      ");
		for(int i=0; i<brojKolona; i++){									//Ispisuje A B C D E....tako što castira i kao brojač i character i dodaje A i tako broji 65 66 67 68, što su ustvari slova A B C D E
			char imeKolone = (char) ('A' + i);
			System.out.printf(" %c  ", imeKolone);
		}
		ispisiHorizontalnuLiniju(brojKolona);								//Ispisuje horizontalnu liniju crticama
	}


	private static void ispisiHorizontalnuLiniju(int brojKolona) {
		System.out.println();
		System.out.print("     +");
		for(int i=0; i<brojKolona; i++){
			System.out.print("---+");
		}
		System.out.println();
	}


	private static char[][] novaIgra(int brojRedova, int brojKolona) {
		return new char[brojRedova][brojKolona];
	}
}
