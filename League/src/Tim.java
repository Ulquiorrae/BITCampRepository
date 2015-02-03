import java.util.Arrays;


public class Tim {

	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getGrad() {
		return grad;
	}


	public void setGrad(String grad) {
		this.grad = grad;
	}


	public Igrac[] getIgraci() {
		return igraci;
	}


	public void setIgraci(Igrac[] igraci) {
		this.igraci = igraci;
	}


	public Osoba[] getOsoblje() {
		return osoblje;
	}


	public void setOsoblje(Osoba[] osoblje) {
		this.osoblje = osoblje;
	}


	public int getBrojIgraca() {
		return brojIgraca;
	}


	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}


	public int getBrojOsoblja() {
		return brojOsoblja;
	}
	
	public double getKoeficijentSrece() {
		double minKoef = Math.random() * 4; 
		double maxKoef = 7 + Math.random() * (10 - 7 + 1);

		double koeficijent = maxKoef - minKoef;

		double koeficijentTima = 0;
		for (int i = 0; i < igraci.length; i++) {
			koeficijentTima += igraci[i].getOcjeneIgraca().getSumaOcjena() * koeficijent;
		}
		return koeficijentTima;
	}

	public void setBrojOsoblja(int brojOsoblja) {
		this.brojOsoblja = brojOsoblja;
	}

	public void setKoeficijentSrece(double koeficijentSrece) {
		this.koeficijentSrece = koeficijentSrece;
	}


	String ime;
	String grad;
	private Igrac[] igraci;
	private Osoba[] osoblje;
	int brojIgraca;
	int brojOsoblja;
	private double koeficijentSrece;
	
	
	public Tim(String ime, String grad){
		
		this.ime = ime;
		this.grad = grad;
		igraci = new Igrac[11];
		osoblje = new Osoba[1];
		brojIgraca = 0;
		brojOsoblja = 0;
	}
	
	
	public Tim(Tim other){
		
		this.ime = other.ime;
		this.igraci = other.igraci;
		this.osoblje = other.osoblje;
		this.brojIgraca = other.brojIgraca;
		this.brojOsoblja = other.brojOsoblja;
	}
	
	public void dodajIgraca(Igrac novi){
		
		igraci[brojIgraca] = new Igrac(novi);
		brojIgraca++;
		
		if(brojIgraca>11){
			throw new ArrayIndexOutOfBoundsException("Maximalan broj igraèa u timu je 11 !");
		}
	}
	
	public void dodajIgraca(String ime, String prezime, int brojDresa, int brzina, int dodavanje, int sut, int igraGlavom){
		
		igraci[brojIgraca] = new Igrac(ime, prezime, brojDresa, brzina, dodavanje, sut, igraGlavom);
		brojIgraca++;
		
		if(brojIgraca>11){
			throw new ArrayIndexOutOfBoundsException("Maximalan broj igraèa u timu je 11 !");
		}
	}
	
	public void dodajOsobu(String ime, String prezime, String email, String funkcija) {
		osoblje[brojOsoblja] = new Osoba(ime, prezime, email, funkcija);
		brojOsoblja++;
		if (brojOsoblja == osoblje.length) {
			resizeOsoblje();
		}
	}
	
	
	private void resizeOsoblje() {
		int newLenght = 2 * osoblje.length;
		Osoba[] temp = new Osoba[newLenght];

		for (int i = 0; i < osoblje.length; i++) {
			temp[i] = osoblje[i];
		}
		osoblje = temp;
	}


	@Override
	public String toString() {
		return "Tim [ime=" + ime + ", grad=" + grad + ", igraci="
				+ Arrays.toString(igraci) + ", osoblje="
				+ Arrays.toString(osoblje) + ", brojIgraca=" + brojIgraca
				+ ", brojOsoblja=" + brojOsoblja + ", koeficijentSrece="
				+ koeficijentSrece + "]";
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tim other = (Tim) obj;
		if (brojIgraca != other.brojIgraca)
			return false;
		if (brojOsoblja != other.brojOsoblja)
			return false;
		if (grad == null) {
			if (other.grad != null)
				return false;
		} else if (!grad.equals(other.grad))
			return false;
		if (!Arrays.equals(igraci, other.igraci))
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (Double.doubleToLongBits(koeficijentSrece) != Double
				.doubleToLongBits(other.koeficijentSrece))
			return false;
		if (!Arrays.equals(osoblje, other.osoblje))
			return false;
		return true;
	}
	
	
}
