package Vježbe;
import java.util.Scanner;

public class Datum {
	private int dan;
	private int mjesec;
	private int godina;
	
	/**
	 * Defaultni konstruktor. Kada u mainu f-ja ne prima ništa, poziva se ovaj konstruktor!
	 * npr. Datum prviDatum = new Datum();
	 * Recimo ako neko neće da unese neki od parametara, ili samo neke hoće da unese, ili u ovom slučaju nijedan.
	 * Ovaj konstruktor postavlja vrijednosti na: dan = 1, mjesec = 1, godina = 1900
	 */
	public Datum() {
		this.dan = 1;
		this.mjesec = 1;
		this.godina = 1900;
	}
	
	/**
	 * OVO JE KONSTRUKTOR! Mora imati isto ime kao i klasa, uos: Datum
	 * @param dan
	 * @param mjesec
	 * @param godina
	 */
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	
	/**
	 * Copy Konstruktor-kopira vrijednost jednog datuma u drugi
	 * Ustvari poziva se kada "Datum drugiDatum = new Datum(prviDatum);", 
	 * zato što ovaj konstruktor prima drugi objekat tipa Datum.
	 * @param other
	 */
	public Datum(Datum other){
		
		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;
	}
	
	/**
	 * Public je jer nam treba van ove klase, tj. u DatumTEST npr.
	 * Ova funkcija pretvara integere u string, zbog ispisa.
	 */
	public String toString() {
		String datumKaoString = "";
		datumKaoString = dan + "." + mjesec + "." + godina;
		return datumKaoString;
		
		
	}
	
	/**
	 * Funkcija prima 2 objekta tipa Datum i uspoređuje ih, tj. uspoređuje sve njihove parametre.
	 * Ako su svi parametri jednaki, vraća TRUE, otherwise vraća FALSE.
	 * @param other tipa Datum
	 * @return true ako su isti, false ako nisu
	 */
	public boolean equals(Datum other){
		if(this.dan == other.dan && this.mjesec == other.mjesec && this.godina == other.godina){
			return true;
		}
		return false;
	}
	
	/**
	 * Funkcija prima 2 objekta tipa Datum. Uspoređuje koji je datum "veći".
	 * @param other tipa Datum
	 * @return 0 ako su jednaki, 1 ako je prvi datum veći, -1 ako je prvi datum manji
	 */
	public int compare(Datum other) {
		int temp = 0;
		if (this.godina < other.godina) {
			temp = -1;
		}
		if (this.godina > other.godina) {
			temp = 1;
		}
		if (this.godina == other.godina) {
			if (this.mjesec < other.mjesec)
				temp = -1;
			if (this.mjesec > other.mjesec)
				temp = 1;
			if (this.mjesec == other.mjesec) {
				if (this.dan < other.dan)
					temp = -1;
				if (this.dan > other.dan)
					temp = 1;
				if (this.dan == other.dan)
					temp = 0;
			}
		}
		return temp;
	}
	
	/**
	 * Getter za dan
	 * @return int
	 */
	public int getDan() {
		return dan;
	}
	
	/**
	 * Getter za mjesec
	 * @return int
	 */
	public int getMjesec() {
		return mjesec;
	}
	
	/**
	 * Getter za godinu
	 * @return int
	 */
	public int getGodina() {
		return godina;
	}
	
	/**
	 * Setter za dan.
	 * @param noviDan
	 */
	public void setDan(int dan) {
		if (dan < 0 || dan > 31) {
			throw new IllegalArgumentException(
					"Dan nije u validnom intervalu, ne može biti veći od 31 ni manji od 0 !!");
		} else {
			this.dan = dan;
		}
	}
	
	/**
	 * Setter za mjesec.
	 * @param mjesec
	 */
	public void setMjesec(int mjesec) {
		if (mjesec < 1 || mjesec > 12) {
			throw new IllegalArgumentException(
					"Mjesec nije u validnom intervalu, ne može biti veći od 12 ni manji od 1 !!");
		} else {
			this.mjesec = mjesec;
		}
	}
	
	/**
	 * Setter za godinu.
	 * @param godina
	 */
	public void setGodina(int godina) {
		if (godina < 1900 || godina > 3014) {
			throw new IllegalArgumentException(
					"Godina nije u validnom intervalu, ne može biti veća od 3014 ni manja od 1900 !!");
		} else {
			this.godina = godina;
		}
	}
	

}
