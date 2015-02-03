import java.util.Scanner;
public class DuplaSlovaUStringu {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String recenica;
		String[]novaRecenica;
		String rijec;
		int duzina;
		
		
		
		System.out.println("Unesi jednu rečenicu: ");
		recenica=in.nextLine();
		
		duzina=recenica.length();
		
		novaRecenica=new String[duzina];
		
		
		for(int i=0;i<recenica.length();i++){
			
			novaRecenica[i]=recenica.substring(i, i+1);
			
			
		}
		
		for(int i=0;i<duzina;i++){
		
		System.out.print(novaRecenica[i]);
		
		}
		
	}
}
