package Blackjack;

public class BlackjackTEST {

	public static void main(String[] args) {
		
	Deck karta = new Deck();
		
	karta.ispisiKarte();
		
	System.out.println("$$$$$$$$$$$$$$$$$$$$$");
	System.out.println("$$$$$$$$$$$$$$$$$$$$$");
	System.out.println("$$$$$$$$$$$$$$$$$$$$$");
	
//	karta.Shuffle();
//	karta.ispisiKarte();
	
	System.out.println(karta.getNext());
	System.out.println(karta.getNext());
	System.out.println(karta.getNext());
	System.out.println(karta.getNext());
	
	}
}
