import java.util.Scanner;
public class DuplikatiUStringu {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		
		String recenica;
		boolean dupli;
		System.out.println("Unesi jednu recenicu/string: ");
		recenica = in.nextLine();
		
		dupli=duplikati(recenica);
		
		if(dupli==true) System.out.println("IMA DUPLIKATA!");
		if(dupli==false) System.out.println("NEMA DUPLIKATA!");
		}

	/**
	 * Funkcija ima zadatak da provjeri da li su sva slova u unesenoj rečenici unikatna tj. da li postoje dupla slova ili znakovi.
	 * @param recenica - Recenica tipa string, i razmaci dolaze u obzir.
	 * @return False ukoliko su sva slova u stringu unikati(iključujući razmake), True ukoliko postoje dupla slova u unesenoj rečenici.
	 */
	private static boolean duplikati(String recenica) {
		
		for(int i=0;i<recenica.length();i++){
			for(int j=0;j<recenica.length();j++){
				
				if(i==j) continue;
				
				if(recenica.charAt(i)==' '|| recenica.charAt(j)==' ') continue;
				
				if(recenica.charAt(i)==recenica.charAt(j)){
					
					return true;
				}
			}
		}
		return false;
	}
		}