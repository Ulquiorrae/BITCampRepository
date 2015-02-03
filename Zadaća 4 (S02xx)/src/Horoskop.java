/**
 *Program od korisnija traži da unese svoj dan i mjesec roðenja a korisniku govori koji je znak u horoskopu
 * 
 * @author Haris Krkaliæ - BIT Camp Generacija I
 * 
 */
import java.util.Scanner;
public class Horoskop {
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int dan = 0,mjesec=0;
		boolean tacno=true;
		
		while(tacno=true){
		System.out.println("Unesi mjesec roðenja: ");
		mjesec=in.nextInt();
	
		
		if(mjesec<1 || mjesec>12){
			
			System.out.println("Vaš mjesec roðenja može biti samo broj izmeðu 1 i 12, unesi ponovo!");
			System.out.println();
			continue;

		}
		
		System.out.println("Unesi dan roðenja: ");
		dan=in.nextInt();
		
		if((mjesec==1 || mjesec==3 || mjesec==5 || mjesec==7 || mjesec==8 || mjesec==10 || mjesec==12)&&(dan<1 || dan>31)){
			
			System.out.printf("%d. mjesec ima maximalno 31 dan! Unesi broj izmeðu 1 i 31 !",mjesec);
			System.out.println();
			continue;

		}
		
		if((mjesec==4 || mjesec==6 || mjesec==9 || mjesec==11)&&(dan<1 || dan>30)){
			
			System.out.printf("%d. mjesec ima maximalno 30 dana! Unesi broj izmeðu 1 i 30 !",mjesec);
			System.out.println();
			continue;

		}
		
		if((mjesec==2)&&(dan<1 || dan>29)){
			
			System.out.printf("%d. mjesec ima maximalno 29 dana! Unesi broj izmeðu 1 i 29 !",mjesec);
			System.out.println();
			continue;

		}
		
		break;
		
		}
		
		
		horoskop(dan,mjesec);
		

	}
	

	
	
	public static void horoskop(int dan,int mjesec){
		
		
		if((mjesec==12 && dan>=22 && dan<=31)||(mjesec==1 && dan>=1 && dan<=19)){
			
				System.out.println("Vaš horoskopski znak je: Capricorn");
				
			}

		
		if((mjesec==1 && dan>=20 && dan<=31)||(mjesec==2 && dan>=1 && dan<=18)){
			
			System.out.println("Vaš horoskopski znak je: Aquarius");
			
		}
		
		if((mjesec==2 && dan>=19 && dan<=28)||(mjesec==3 && dan>=1 && dan<=20)){
			
			System.out.println("Vaš horoskopski znak je: Pisces");
			
		}
		
		if((mjesec==3 && dan>=21 && dan<=31)||(mjesec==4 && dan>=1 && dan<=19)){
			
			System.out.println("Vaš horoskopski znak je: Aries");
			
		}
	
		if((mjesec==4 && dan>=20 && dan<=30)||(mjesec==5 && dan>=1 && dan<=20)){
			
			System.out.println("Vaš horoskopski znak je: Taurus");
			
		}
		
		if((mjesec==5 && dan>=21 && dan<=31)||(mjesec==6 && dan>=1 && dan<=20)){
			
			System.out.println("Vaš horoskopski znak je: Gemini");
			
		}
		
		if((mjesec==6 && dan>=21 && dan<=30)||(mjesec==7 && dan>=1 && dan<=22)){
			
			System.out.println("Vaš horoskopski znak je: Cancer");
			
		}
		
		if((mjesec==7 && dan>=23 && dan<=31)||(mjesec==8 && dan>=1 && dan<=22)){
			
			System.out.println("Vaš horoskopski znak je: Leo");
		}
		
		if((mjesec==8 && dan>=23 && dan<=31)||(mjesec==9 && dan>=1 && dan<=22)){
			
			System.out.println("Vaš horoskopski znak je: Virgo");
			
		}
		
		if((mjesec==9 && dan>=23 && dan<=30)||(mjesec==10 && dan>=1 && dan<=22)){
			
			System.out.println("Vaš horoskopski znak je: Libra");
			
		}
		
		if((mjesec==10 && dan>=23 && dan<=31)||(mjesec==11 && dan>=1 && dan<=21)){
			
			System.out.println("Vaš horoskopski znak je: Scorpio");
			
		}
		
		if((mjesec==11 && dan>=22 && dan<=30)||(mjesec==12 && dan>=1 && dan<=21)){
			
			System.out.println("Vaš horoskopski znak je: Sagittarius");
			
		}
		
	

		}
		
		
		
	}
	
	

