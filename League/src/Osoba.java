public class Osoba {

	String ime;
	String prezime;
	String email;
	String funkcija;

	public Osoba(String ime, String prezime, String email, String funkcija) {
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.funkcija = funkcija;

	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime.length() < 1)
			throw new IllegalArgumentException("Ime nije pravilno uneseno");
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime.length() < 1)
			throw new IllegalArgumentException("Ime nije pravilno uneseno");
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	
	
	public void setEmail(String email) {
		if (email.length() < 1)
			throw new IllegalArgumentException("Email nije pravilno uneseno");
		this.email = email;
	}

	
	
	public String getFunkcija() {
		return funkcija;
	}

	public void setFunkcija(String funkcija) {
		if (funkcija.length() < 1)
			throw new IllegalArgumentException("Funkcija nije pravilno uneseno");
		this.funkcija = funkcija;
	}

	public String toString() {
		String osobaToString = "Ime: " + ime + "\nPrezime: " + prezime
				+ "\nEmail:" + email + "\nFunkcija=" + funkcija + "\n\n";
		return osobaToString;
	}

}