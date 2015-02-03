package Blackjack;

public class Card {

private int broj;	
private int vrijednost;
private int znak;

//	/**
//	 * Ovo je konstruktor koji prima vrijednost u segmentu [1,52] i kreira kartu sa odgovarajućim znakom i vrijednošću
//	 * @param redniBroj
//	 */
//	public Card(int redniBroj) {
//		int vrijednostZnaka;
//		vrijednostZnaka = redniBroj / 14;
//
//		if (vrijednostZnaka == 0) this.znak = 'S';
//		if (vrijednostZnaka == 1) this.znak = 'P';
//		if (vrijednostZnaka == 2) this.znak = 'M';
//		if (vrijednostZnaka == 3) this.znak = 'B';
//
//		if (redniBroj % 13 == 0) {
//			this.vrijednost = 13;
//			return;
//		}
//		this.vrijednost = redniBroj % 13;
//	}
	
	public Card(int broj){
		
		this.broj = broj%13;
		this.broj++;
		if(this.broj ==1){
			this.vrijednost =11;
		}
		else if(this.broj>=10){
			this.vrijednost =10;
		}
		else{
			this.vrijednost = this.broj;
		}
		if(this.broj >=11){
			this.broj++;
		}
		this.znak = broj/13;
	}
	
	
	
	/**
	 * Getter za vrijednost karte, pomoću njega pristupamo atributu vrijednost
	 * @return integer
	 */
	public int getVrijednost() {
		return vrijednost;
	}
	
	/**
	 * Postvalja vrijednost atributa vrijednost
	 * @param vrijednost
	 */
	public void setVrijednost(int vrijednost) {
		this.vrijednost = vrijednost;
	}

	/**
	 * Getter za znak karte(srce,mak,list,baklava, pomoću njega pristupamo atributu znak
	 * @return
	 */
	public int getZnak() {
		return znak;
	}
	
	public int getBroj() {
		return broj;
	}

	/**
	 * Postavlja vrijednost atributa znak
	 * @param znak
	 */
	public void setZnak(char znak) {
		this.znak = znak;
	}
	
	/**
	 * Funkcija definiše na koji način će se klasa ispisivati na ekran
	 */
	public String toString() {
		String out ="";
		out += this.broj +"\n";
		out += this.znak +"\n";
		out += this.vrijednost +"\n";
		return out;
	}
}