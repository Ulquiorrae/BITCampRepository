import java.util.Scanner;
public class IzbacivanjeSlovaIzStringa {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String recenica;
		String novaRecenica="";
		String slovo;
		
		System.out.println("Unesi jednu reèenicu(sa razmacima): ");
		recenica=in.nextLine();
		
		while(true){
		System.out.println("Unesi slovo koje želiš izbaciti iz unesene reèenice: ");
		slovo=in.nextLine();
		
		if(slovo.length()>1){
			System.out.println("Molimo vas da unesete samo jedno slovo!");
			continue;
		}
		break;
		}
		
		
		for(int i=0;i<recenica.length();i++){
			
			String temp=recenica.substring(i, i+1);
			String slovotemp=slovo.substring(0, 1);
			
			
			boolean istina=temp.equalsIgnoreCase(slovotemp);
			
			if(istina==false){
				
				novaRecenica=novaRecenica+temp;
				
			}
			
		}
		
		System.out.println("Nova recenica bez unesenog slova je: "+ novaRecenica);
		
	}
}
