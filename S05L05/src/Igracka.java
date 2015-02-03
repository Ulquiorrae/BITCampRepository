public class Igracka {

	private String naziv;
	private String tip;
	private double cijena;
	
	private int godinaProizvodnje;
	private int dobnoOgranicenje;
	
	public Igracka(){
		this.naziv = "Defaultni naziv";
		this.tip = "Defaultni tip";
		this.cijena = 50;
		this.godinaProizvodnje = 2014;
		this.dobnoOgranicenje = 0;
	}
	
	public Igracka(String naziv, String tip, int cijena){
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.godinaProizvodnje = 2014;
		this.dobnoOgranicenje = 0;
	}
	
	public Igracka(String naziv, String tip, int cijena, int godinaProizvodnje){
		
			if(godinaProizvodnje<100){
//			temp=godinaProizvodnje;
//			godinaProizvodnje=dobnoOgranicenje;
//			dobnoOgranicenje=temp;
			this.naziv = naziv;
			this.tip = tip;
			this.cijena = cijena;
			this.godinaProizvodnje = dobnoOgranicenje;
			this.dobnoOgranicenje = godinaProizvodnje;
			}
			else{
			this.naziv = naziv;
			this.tip = tip;
			this.cijena = cijena;
			this.godinaProizvodnje = godinaProizvodnje;
			this.dobnoOgranicenje = 0;
			}
	}
	
	
	public Igracka(String naziv, String tip, int cijena, int godinaProizvodnje, int dobnoOgranicenje){
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.godinaProizvodnje = godinaProizvodnje;
		this.dobnoOgranicenje = dobnoOgranicenje;
	}
	
	public String toString(){
		String ispis="";
		System.out.println("Naziv: " + naziv);
		System.out.println("Tip: " + tip);
		System.out.println("Cijena: " + cijena + "KM");
		System.out.println("Godina proizvodnje: " + godinaProizvodnje + ".");
		System.out.println("Dobno ograničenje: " + dobnoOgranicenje + " godina.");
		return ispis;
	}
	
	public String getNaziv(){
		return naziv;
	}
	
	public String getTip(){
		return tip;
	}
	
	public double getCijena(){
		return cijena;
	}
	
	public long getGodinaProizvodnje(){
		return godinaProizvodnje;
	}
	
	public int dobnoOgranicenje(){
		return dobnoOgranicenje;
	}
	
	public void setNaziv(String naziv){
		this.naziv = naziv;
	}
	
	public void setTip(String tip){
		this.tip = tip;
	}
	
	public void setCijena(int cijena){
		this.cijena = cijena;
	}
	
	public void setGodinaProizvodnje(int godinaProizvodnje){
		this.godinaProizvodnje = godinaProizvodnje;
	}
	
	public void setDobnoOgranicenje(int dobnoOgranicenje){
		this.dobnoOgranicenje = dobnoOgranicenje;
	}
	
	public boolean equals(Igracka other) {
		if (	this.naziv == other.naziv 
				&& this.tip == other.tip
				&& this.cijena == other.cijena
				&& this.godinaProizvodnje == other.godinaProizvodnje
				&& this.dobnoOgranicenje == other.dobnoOgranicenje) {
			return true;
		}
		return false;
	}
}
