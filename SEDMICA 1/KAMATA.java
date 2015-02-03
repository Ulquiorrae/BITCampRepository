
public class KAMATA {
	
	public static void main(String args[]) {
		
		//kamata između 0 i 15, kolika je glavnica? kolika je kamata? koliki je ukupni trosak?
		
		int glavnica=1500;
		int minimum=0;
		int maximum=15;
		int randomNum;
		double ukupniTrosak;
		
		randomNum = minimum + (int)(Math.random()*maximum); 
		ukupniTrosak=glavnica + randomNum;
		
		System.out.print("Glavnica duga iznosi:");
		System.out.println(glavnica);
		System.out.print("Kamata duga iznosi:");
		System.out.println(randomNum);
		System.out.print("Ukupni trošak iznosi:");
		System.out.print(ukupniTrosak);
		
		
		

		
	}

}
