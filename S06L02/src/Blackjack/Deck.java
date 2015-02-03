package Blackjack;

public class Deck {

private Card[] cards;
private int brojac;


	public Deck() {
		cards = new Card[52];
		for (int i = 0; i < cards.length; i++)
			cards[i] = new Card(i + 1);

		Shuffle();
		
	}
	
	public void Shuffle() {
		Card[] temp = new Card[52];
		for (int i = 0; i < cards.length; i++) {
			int b = (int) (Math.random() * 52);
			if (temp[b] == null)
				temp[b] = cards[i];
			else
				i--;
		}
		cards = temp;
	}

	public void ispisiKarte() {
		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i].toString());
	}
	
	
	public Card getNext(){
		
		return cards[brojac++];
		
	}
}