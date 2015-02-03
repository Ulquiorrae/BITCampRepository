import java.io.ObjectInputStream.GetField;

public class Test {

	public static void main(String[] args) {

		boolean krajIgre = false;

		Deck deck = new Deck();

		Hand igrac = new Hand();
		igrac.addCard(deck.getNext());
		igrac.addCard(deck.getNext());

		Hand dealer = new Hand();
		dealer.addCard(deck.getNext());
		dealer.addCard(deck.getNext());

		System.out.println("Igrač: " + igrac.getSum());
		System.out.println("Dealer: " + dealer.getSum());

	}

}
