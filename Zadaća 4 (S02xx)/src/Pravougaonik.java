import java.util.Scanner;
public class Pravougaonik {

	public static void main(String[] args) {
		
		System.out.println("Pripremi pravougaonik;");
		
		Scanner in=new Scanner(System.in);
		
		int visina,sirina;
		
		System.out.println("Unesi visinu pravougaonika: ");
		visina=in.nextInt();
		
		System.out.println("Unesi širinu pravougaonika: ");
		sirina=in.nextInt();
		
		pripremiPravougaonik(visina,sirina);
		
		
		
	}
	
	
	public static String pripremiPravougaonik(int visina, int sirina){
		
		String str="";
		
		str=pripremiPrviiliZadnjiRed(sirina) + "\n";
		
		for(int i=2;i<visina;i++){
			
		str=str+pripremiSrednjiRed(sirina) + "\n";
			
		}
		
		str+=pripremiPrviiliZadnjiRed(sirina);
		

		return str;
	}
	
	
	public static String pripremiPrviiliZadnjiRed(int sirina){
		
		String prviRed="";
		
		prviRed=prviRed+"+";
		for(int i=2;i<sirina;i++){
			
			prviRed=prviRed+"-";
			
		}
		prviRed=prviRed+"+";
		
		System.out.println(prviRed);
		
		return prviRed;
		
	}
	
	public static String pripremiSrednjiRed(int sirina){
		
		String red="";
		
		red=red+"|";
		
		for(int i=2;i<sirina;i++){
			
			red=red+" ";
			
		}
		
		red=red+"|";
		System.out.println(red);
		
		return red;
	}
	
	
}
