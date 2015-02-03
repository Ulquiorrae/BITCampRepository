
public class Paket {

	protected double width;
	protected double height;
	protected double length;
	protected double weight;
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	double getPrice() {
		double price = getWeight()*3;
		return price;
	}
	
	@Override
	public String toString(){
		String out="";
		out += "Width: " + this.width;
		out += " Height: " + this.height;
		out += " Lenght: " + this.length;
		out += " Weight : " + this.weight;
		out += " Price: " + this.getPrice();
		
		return out;
	}
	
}
