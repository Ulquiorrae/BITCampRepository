import java.util.Scanner;
public class ImOnABoat {
//	Given the speed of a boat (as integer) calculate the time it will need to cover a given distance. 
//	The Speed is defined in miles/hour the distance in kilometers.
	

	public static void main(String args []){
		
		Scanner in=new Scanner(System.in);
		
		int brzinaBroda;
		double distanceKilometers, distanceMiles;
		double time;
		double sekundeUKUPNO;
		double sati, minute, sekunde;
			
		System.out.println("Unesi brzinu broda (mph): ");
		brzinaBroda=in.nextInt();
		
		System.out.println("Unesi koliku udaljenost pređe brod (km): ");
		distanceKilometers=in.nextInt();
		
		
		
		distanceMiles=(distanceKilometers/1.60934);
		
		time=distanceMiles/brzinaBroda; //vrijeme izraženo u satima!!
		
		System.out.println(time);
		sekundeUKUPNO=time*3600;
		
		sati=(int)sekundeUKUPNO/3600;
		sekundeUKUPNO=sekundeUKUPNO%3600;
		minute=(int)sekundeUKUPNO/60;
		sekundeUKUPNO=sekundeUKUPNO%60;
		sekunde=(int)sekundeUKUPNO;
		
		System.out.println("Ukupno vrijeme koje je potrebno brodu je: " +sati + " : " + minute + " : " + sekunde + " : ");
		
		
		
		
		
		
		
		
	}
}
