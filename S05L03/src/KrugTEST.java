
public class KrugTEST {

	public static void main(String[] args) {
		
		Krug maliKrug = new Krug(1.0);
		
		maliKrug.setPoluprecnik(2.0);
		System.out.println("Krug je:" + maliKrug.toString());    //način da ispišemo krug sa println: konvertujemo sve u string i preko formata isprintamo sa print
		
//		maliKrug.setPoluprecnik(-1);
		
		Krug velikiKrug = new Krug(100.0);
		velikiKrug.ispisiKrug();
		
		double ukupnaPovrsina = maliKrug.getPovrsina() + velikiKrug.getPovrsina();
		System.out.println("Ukupna povrsina: "+ ukupnaPovrsina);
	}
	
}
