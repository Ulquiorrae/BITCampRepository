import java.util.Scanner;
public class SviPalindromiUStringu {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Unesi jednu rečenicu: ");
		String recenica=in.nextLine(); 
		String palindromi;
		
		
		palindromi=getPalindroms(recenica);
		
		System.out.println("Palindromi u unesenom stringu su: "+palindromi);
		
	}

	/**
	 * Funkcija prima jednu rečenicu tipa string i vraća samo one riječi koje su palindromi.
	 * @param recenica
	 * @return String
	 */
	private static String getPalindroms(String recenica) {

		String palindromi="";
		
		String[] rijeci=recenica.split(" ");
		
		
		for(int i=0;i<rijeci.length;i++){
			
			if(isPalindrom(rijeci[i])==true){
				
				palindromi=palindromi+rijeci[i]+" ";
			}
			
		}
		return palindromi;
	}

	/**
	 * Funkcija prima riječ kao dio stringa i proverava da li je riječ palindrom(simetrična riječ).
	 * @param string
	 * @return true ako je riječ palindrom, i false ako riječ nije palindrom
	 */
	private static boolean isPalindrom(String string) {

		for(int i=0;i<string.length()/2;++i){
			
			if (string.charAt(i) != string.charAt(string.length() - i - 1)){
				
				return false;
			}
		}
		
		return true;
	}

}
