import java.util.Scanner;
public class DjeljivSa2345 {
//da li je broj djeljiv sa 2 3 4 5 i onda provjeriti da li je djeljiv sa 6 ali ne koristiti %6, provjeriti da li je djeljiv sa 2 i sa 3 i ispisati da li je djeljiv sa 2 i sa 3!
	
	
	public static void main(String args[]) {

		
		Scanner in = new Scanner(System.in);
		int broj;
		boolean saDva=false;
		boolean saTri=false;
		
		System.out.println("Unesi jedan broj: ");
		broj=in.nextInt();
		
		
		if(broj%2==0){
				
		System.out.println("Broj je djeljiv sa 2 ! ");	
		saDva=true;
			
		}
		
		if(broj%3==0){
			
		System.out.println("Broj je djeljiv sa 3 ! ");	
		saTri=true;	
		
		}
		
		if(broj%4==0){
			
		System.out.println("Broj je djeljiv sa 4 ! ");	
			
	
		}
		
		if((saDva==true)&&(saTri==true)) {
		
		System.out.println("Broj je djeljiv sa 6 jer je djeljiv sa 2 i sa 3 ! ");	
			
		}
		
		
		
	
	}
}
	
	
	

