package Blackjack;
public class Hand {
private Card[] hand;
private int acesNum;
private int  counter;

	public Hand(){
		this.hand= new Card[52];
		this.acesNum=0;
		this.counter=0;
	}

	public void addCard(Card newCard){
		hand[counter] = newCard;
		counter++;
		
		if(newCard.getBroj()==1)
			acesNum++;
	}

	public int getSum(){
		int sum = 0;
		for(int i=0;i<counter;i++){
			sum += hand[i].getVrijednost();
		}
		return sum;
	}
	
	public void setSum(int sum){
		sum = sum-10;
	}
	
	public void setAcesNum(int acesNum){
		acesNum--;
	}

	
	public int getAcesNum() {
		return acesNum;
	}

	
}