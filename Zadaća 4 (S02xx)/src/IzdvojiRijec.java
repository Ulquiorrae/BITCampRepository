import java.util.Scanner;

public class IzdvojiRijec {

	public static void main(String[] args) {

		try{
		Scanner in = new Scanner(System.in);
		String str;
		int redniBrojRijeciKojuTrazimo;
		System.out.println("Unesi jednu rečenicu: ");
		str=in.nextLine();
		
		System.out.println("Unesi redni broj riječi koju tražiš: ");
		redniBrojRijeciKojuTrazimo=in.nextInt();
		if(redniBrojRijeciKojuTrazimo<1){
			
			System.out.println("Broj riječi koju tražimo ne može biti manji od 1!");
			return;
		}
		
		
		System.out.println("To je rijec: " + izvadiRijec(str, redniBrojRijeciKojuTrazimo));
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
	}

	public static String izvadiRijec(String recenica,int redniBrojRijeciKojuTrazimo) throws Exception{

		String trazenaRijec = "";
		int trenutnaRijec=0;
		int trenutniIndex=0;
		
		while(trenutnaRijec < redniBrojRijeciKojuTrazimo){
			
			if(recenica.charAt(trenutniIndex)!=' '){
				
				if(trenutniIndex==0) {
					trenutnaRijec++;
				}
				else{
					//provjerava da li rijec ima razmak prije same rijeci
					if(recenica.charAt(trenutniIndex-1)==' '){
						trenutnaRijec++;
					}
				}	
			}
			trenutniIndex++;
			if(trenutniIndex>=recenica.length()){
				
				throw new Exception("Broj rijeci u recenici je manji od unesenog");
			}
		}
		trenutniIndex--;
		
		while(recenica.charAt(trenutniIndex)!=' '){
			
			trazenaRijec+=recenica.charAt(trenutniIndex);
			trenutniIndex++;
			
		}
		return trazenaRijec;
	}

}
