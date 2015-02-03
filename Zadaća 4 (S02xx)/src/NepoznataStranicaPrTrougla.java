import java.util.Scanner;
public class NepoznataStranicaPrTrougla {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int stranica1,stranica2;
		double stranica3;
		double kateta=0,hipotenuza;
		
		System.out.println("Unesi prvu stranicu pravouglog trougla: ");
		stranica1=in.nextInt();
		
		System.out.println("Unesi drugu stranicu pravouglog trougla: ");
		stranica2=in.nextInt();
	
		
		hipotenuza=Math.sqrt(stranica1*stranica1+stranica2*stranica2);
		
		if(stranica1>stranica2){
			
		kateta=Math.sqrt(stranica1*stranica1-stranica2*stranica2);

		}
		
		if(stranica2>stranica1){
			
		kateta=Math.sqrt(stranica2*stranica2-stranica1*stranica1);

			}

		if(hipotenuza>kateta) System.out.printf("Da bi pravougli trougao postojao, treæa stranica mora biti najmanje duga: %f",kateta);
		if(kateta>hipotenuza) System.out.printf("Da bi pravougli trougao postojao, treæa stranica mora biti najmanje duga: %f",hipotenuza);
		
		;
		
	}
	
	
	
}
