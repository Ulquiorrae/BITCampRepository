import testniPackage.*;
import testniPackage.testniPackage2.*;

public class ProvjeraNapisanogKoda {

	public static void main(String[] args) {

		testniPackage.testnaKlasa.nekiIspisiTesnojKlasi();
		testnaPodKlasa.josNekiIspis("Evo nas sa importom!");
		testnaKlasa.nekiIspisiTesnojKlasi();
		
//		testnaKlasa.nekiIspisKojiNijeStatic();							//ovo ne mogu koristiti zato što funkcija nekiIspisKojiNijeStatic u klasi testnaKlasa NIJE STATIC
		
		testnaKlasa promjenjivaTipaTestnaKlasa = new testnaKlasa();			//kreirao sam promjenjivu tipa testnaKlasa i alocirao novo mjesto za nju u memoriji da bi mogao pristupiti funkcijama koje nisu static
		promjenjivaTipaTestnaKlasa.nekiIspisKojiNijeStatic();				//sad mogu pristupit ovoj static klasi zato što sam "kupio prava" jer sam napravio novu varijablu tipa 
		promjenjivaTipaTestnaKlasa.nekiIspisiTesnojKlasi();
		
	}

	
	
}
