public class Hand {

	private Card[] hand;
	private int acesCounter;
	private int brojac;

	public Hand() {
		this.hand = new Card[52];
		this.acesCounter = 0;
		this.brojac = 0;
	}

	public void addCard(Card newCard) {

		hand[brojac] = newCard;
		brojac++;

		if (newCard.getBroj() == 1) {
			acesCounter++;
		}
	}

	public int getSum() {
		int sum = 0;

		for (int i = 0; i < brojac; i++) {
			sum = sum + hand[i].getVrijednost();
		}
		return sum;
	}

	public void reduceSum(int sum) {
		sum = sum - 10;
	}

	public void reduceAcesCounter(int acesCounter) {
		acesCounter--;
	}

	public int getAcesCounter() {
		return acesCounter;
	}
}
