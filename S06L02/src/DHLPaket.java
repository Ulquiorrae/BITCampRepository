
public class DHLPaket extends Paket {

	
	public double getDimensionalWeight() {
		return (getWidth()*getHeight()*getLength())/5000;
	}
	
	@Override
	public double getWeight(){
		return Math.max(weight, getDimensionalWeight());
	}
	
	
	
}
