import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Kalendar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int godina=2014;
		int prviDanUGodini =3;
		String [] mjeseci = new String[] {"Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August", "Septembar", "Oktobar","Novembar","Decembar"};
		int[]brDanaPoMjesecima = new int[]{ 31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31 };
		if(godinaJePrestupna(godina)){
			brDanaPoMjesecima[1] = 29;
			
		}
		for(int i=0; i < 12; i++){
			System.out.println(
					ispisiMjesec(mjeseci[i],
						         brDanaPoMjesecima[i], 
						         vratiPrviDanUMjesecu(i, prviDanUGodini, brDanaPoMjesecima), 1));
			System.out.println();
			
		}
		System.out.println(ispisiMjesec("Neki mjesec", 28, 5, 7));             //srednja varijabla govori od kojeg dana treba poćeti 
		
	}

	
	/**
	 * 
	 * @param godina
	 * @return true ako je godina prestupna a false ako nije
	 */
	public static boolean godinaJePrestupna(int godina){
		
		if(godina%100 == 0){
			return true;
		}
		if(godina%400 == 0){
			return false;
		}
		if(godina%4 == 0){
			return true;
		}
		
		return false;
	}
	
	
	public static String ispisiMjesec(String nazivMjeseca, int brDanaUMjesecu,int prviDanUMjesecu, int prviDan, String...dani){
		
		
		if(dani.length!=7){
			
			dani=new String[]{"Pon", "Uto", "Sri", "Cet", "Pet", "Sub", "Ned"};
			
		}
		String str=String.format("%28s",nazivMjeseca) +"\n";
		
		int idx=prviDan-1;
		
		//ispisuje PON UTO SRI CET PETAK..zavisno od toga šta treba da ustvari piše.
		do{
			str+=String.format("%4s", dani[idx]);
			idx++;
			idx=idx%7;
		}while(idx!=prviDan-1);
		
		str+="\n";
		
		int slobodnihMjesta=( prviDanUMjesecu - prviDan + 7 )%7;     //broj slobodnih mjesta prije odbrojavanja dana, nakon ovoga idx se ne resetuje

		//ispis slobodnih mjesta , idx se ne resetuje da bi kasnije samo mogli nastaviti upisivati brojeve nakon razmaka.
		for(idx=0;idx < slobodnihMjesta; idx++){
			
			str+=String.format("%4s", "");
			
		}
		
		//ispisuje brojeve, prelazi u novi red kada je idx%7 == 0 jer onda prelazi u sljedeću sedmicu.
		while(idx < brDanaUMjesecu + slobodnihMjesta){
			
			str+=String.format("%4d",(idx - slobodnihMjesta + 1));
			idx++;
			if(idx % 7 == 0){
				
				str+="\n";
				
			}
		}
		
		return str;
	}
	
	public static int vratiPrviDanUMjesecu(int mjesec, int prviDanUGodini, int[] brojDanaPoMjesecima){
		
		int prviDanUMjesecu = prviDanUGodini;
		for(int i = 0; i < mjesec; i++){
			prviDanUMjesecu += brojDanaPoMjesecima[i];
		}
		prviDanUMjesecu%=7;
		if(prviDanUMjesecu == 0) prviDanUMjesecu = 7;
		return prviDanUMjesecu;
	}
	
}
