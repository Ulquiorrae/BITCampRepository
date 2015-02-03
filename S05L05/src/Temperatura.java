
public class Temperatura {
	
	private char tip; 					
	private int vrijednost;
	
	
	
	public Temperatura(char tip, int vrijednost) {
		this.tip = tip;
		this.vrijednost = vrijednost;
	}
	
	public Temperatura(){
		this.tip = 'C';
		this.vrijednost = 25; 
	}
	
	public Temperatura(Temperatura other){
		
		this.tip = other.tip;
		this.vrijednost = other.vrijednost;
	}
	
	
	
	public String toString() {
		String temperaturaKaoString = "";
		temperaturaKaoString = vrijednost + " " + tip;
		return temperaturaKaoString;
		
	}
	
	public int getTip() {
		return tip;
	}
	
	public int getVrijednost() {
		return vrijednost;
	}
	
	public void setTip(char tip){
		if(this.tip!='K' || this.tip!='C'){
			throw new IllegalArgumentException("Ne možeš unositi slova koja nisu K ili C, K predstavlja kalvine, a C predstavlja stepene, unesi jedno od to dvoje!");
		}
		else{
			this.tip=tip;
		}
	}
	
	public void setVrijednost(int vrijednost){
		if(this.vrijednost<0){
			throw new IllegalArgumentException("Temperatura ne može biti manja od 0.");
		}
		this.vrijednost = vrijednost;
	}
	
	public void konverter(Temperatura other){
		
		if(other.tip == 'K'){
			
			other.tip= 'C';
			other.vrijednost = (int) (other.vrijednost - 273.15);
			
		}
		
	}
	
	
	
}
