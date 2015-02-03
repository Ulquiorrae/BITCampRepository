
public class Igrac {

	private String ime;
	private String prezime;
	private int brojDresa;
	private Ocjene ocjeneIgraca;
	
	public Igrac(String ime, String prezime, int brojDresa, Ocjene ocjeneIgraca){
		setIme(ime);
		setPrezime(prezime);
		setBrojDresa(brojDresa);
		this.ocjeneIgraca = ocjeneIgraca;
		
	}
	
	public Igrac(String ime, String prezime, int brojDresa, int brzina, int dodavanje, int sut, int igraGlavom) {

		this.ime = ime;
		this.prezime = prezime;
		this.brojDresa = brojDresa;
		this.ocjeneIgraca = new Ocjene(brzina, dodavanje, sut, igraGlavom);
	}
	
	public Igrac(Igrac other){
		
		this.ime = other.ime;
		this.prezime = other.prezime;
		this.brojDresa = other.brojDresa;
		this.ocjeneIgraca = other.ocjeneIgraca;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}
	
	public void setOcjeneIgraca(Ocjene ocjeneIgraca) {
		this.ocjeneIgraca = ocjeneIgraca;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public int getBrojDresa() {
		return brojDresa;
	}
	
	public Ocjene getOcjeneIgraca() {
		return ocjeneIgraca;
	}
	
	public String toString(){
		String out="";
		out += "Ime: " + this.ime;
		out += "\nPrezime: " + this.prezime;
		out += "\nBroj dresa: " + this.brojDresa;
		out += "\nOcjene igrača: " + this.ocjeneIgraca.toString(); 
		return out;
	}
	
	
	}
	

