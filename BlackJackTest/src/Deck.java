public class Deck {

	private Card[] cards;
	private int brojac;

	public Deck() {

		cards = new Card[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new Card(i + 1);
		}
		Shuffle();
	}

	public void Shuffle() {

		Card[] newCards = new Card[52];
		for (int i = 0; i < cards.length; i++) {
			int temp = (int) (Math.random() * 52);
			if (newCards[temp] == null) {
				newCards[temp] = cards[i];
			} else {
				i--;
			}
			cards = newCards;
		}
	}

	public Card getNext() {
		return cards[brojac++];
	}

	public void ispisiKarte() {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i].toString());
		}
	}

}
