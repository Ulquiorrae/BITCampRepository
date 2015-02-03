
public class Krug {
	
	public double poluprecnik;
	double MOJ_PI = Math.PI;
	
	public Krug(double poluprecnikKruga){
		setPoluprecnik(poluprecnikKruga);
	}
	
	
	public double getPovrsina(){
		return poluprecnik * poluprecnik * MOJ_PI;
	}
	
	public double getObim(){
		return 2 * poluprecnik * MOJ_PI;
	}
	
	public void setPoluprecnik(double noviPoluprecnik){
		if(noviPoluprecnik >0){
		poluprecnik = noviPoluprecnik;
		}
		else{
			System.err.println("Poluprecnik nije pozitivan! NEMA PROMJENA!");
		}
		
	}
	
	public String toString(){
		return String.format("r: %.4f; obim:%.4f ; povrsina:%.4f",poluprecnik,getObim(),getPovrsina());
	}
	
	
	public void ispisiKrug(){
		System.out.println("#######");
		System.out.println("Poluprečnik: " + poluprecnik);
		System.out.println("Obim: " + getObim());
		System.out.println("Povrsina: " + getPovrsina());
		System.out.println("#######");
		System.out.println();
	}
	
	
}
