
public class Truck {
	private char letter;
	private Truck nextTruck;
	
	public Truck(char letter){
		this.letter = letter;
	}
	

	public void attach(Truck nextTruck){
		this.nextTruck = nextTruck;
	}
	
	public Truck getNext(){
		return nextTruck;
	}
	
	@Override
	public String toString(){
		return ""+letter;
	}
	
}
