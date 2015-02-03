import java.util.Scanner;
public class CezarovaSifra {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jednu rečenicu: ");
		String recenica=in.nextLine();
		
		String kodiranaRecenica=ceasarCode(recenica);
		
		System.out.println("Unesena rečenica iskodirana Cezarovim kodom je: "+kodiranaRecenica);
		
	}

	/**
	 * Funkcija prima string i vraća taj string u kojem je svako slovo zamijenjeno slovom koje se nalazi 3 mjesta ispred po abecednom redu.
	 * @param recenica
	 * @return String
	 */
	private static String ceasarCode(String recenica) {
		
		String novaRecenica = "";
		
		for(int i=0;i<recenica.length();i++){
			
			char znak = recenica.charAt(i);
			int broj=(int)znak;
			broj=broj+3;
			znak=(char)broj;
			novaRecenica=novaRecenica+znak;
		}
		return novaRecenica;
	}

}
