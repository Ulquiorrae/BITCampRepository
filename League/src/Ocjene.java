
public class Ocjene {

	private int brzina;
	private int dodavanje;
	private int sut;
	private int igraGlavom;
	
	public Ocjene(int brzina, int dodavanje, int sut, int igraGlavom) {
		setBrzina(brzina);
		setDodavanje(dodavanje);
		setSut(sut);
		setIgraGlavom(igraGlavom);
	}
	
	public double getSumaOcjena (){
		double sumaOcjena;
		sumaOcjena = this.brzina + this.dodavanje + this.sut+ this.igraGlavom;
		return sumaOcjena;
	}
	
	public void setBrzina(int brzina) {
		if(brzina <0 || brzina >100){
			throw new IllegalArgumentException("GREŠKA! Ocjene se kreću u intervalu (0,100)!");
		}
		else{
		this.brzina = brzina;
		}
	}
	
	public void setDodavanje(int dodavanje) {
		if(dodavanje <0 || dodavanje >100){
			throw new IllegalArgumentException("GREŠKA! Ocjene se kreću u intervalu (0,100)!");
		}
		else{
		this.dodavanje = dodavanje;
		}
	}
	
	public void setSut(int sut) {
		if(sut <0 || sut >100){
			throw new IllegalArgumentException("GREŠKA! Ocjene se kreću u intervalu (0,100)!");
		}
		else{
		this.sut = sut;
		}
	}
	
	public void setIgraGlavom(int igraGlavom) {
		if(igraGlavom <0 || igraGlavom >100){
			throw new IllegalArgumentException("GREŠKA! Ocjene se kreću u intervalu (0,100)!");
		}
		else{
		this.igraGlavom = igraGlavom;
		}
	}
	
	public int getBrzina() {
		return brzina;
	}
	
	public int getDodavanje() {
		return dodavanje;
	}
	
	public int getSut() {
		return sut;
	}
	
	public int getIgraGlavom() {
		return igraGlavom;
	}
	
	public String toString(){
		String out = "";
		out += "Brzina: " + this.brzina;
		out += "\n	       Dodavanje: " + this.dodavanje;
		out += "\n	       Sut: " + this.sut;
		out += "\n	       Igra glavom: " + this.igraGlavom;
		return out;
	}
}
