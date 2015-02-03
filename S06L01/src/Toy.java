
public class Toy {

	private String name;
	private String type;
	private double price;
	private int manYear;
	private int ageRestriction;
	private int quantity;
	
	public Toy(String name, String type, double price){
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(2014);
		setAgeRestriction(0);
		setQuantity(1);
	}
	
	public Toy(String name, String type, double price, int manYearOrAge, int quantity){
		setName(name);
		setType(type);
		setPrice(price);
		
		if(manYearOrAge < 100){
			setAgeRestriction(manYearOrAge);
		}
		else{
			setManYear(manYearOrAge);
		}
		setQuantity(quantity);
	}
	
	public Toy(String name, String type, double price, int manYear, int ageRestriction, int quantity){
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(manYear);
		setAgeRestriction(ageRestriction);
		setQuantity(quantity);
	}
	

	public Toy(Toy other){
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.manYear = other.manYear;
		this.ageRestriction = other.ageRestriction;
		this.quantity = other.quantity;
	}
	
	public void setName(String name){
		if(name.length() < 1){
			throw new IllegalArgumentException("Ime prazno!");
		}
		else{
			this.name = name;
		}
	}
	
	public void increaseQuantity(int additional){
		this.quantity +=additional;
	}
	
	public void setType(String type){
		if(type.length() < 1){
			throw new IllegalArgumentException("Tip prazan!");
		}
		else{
			this.type = type;
		}
	}
	
	public void setPrice(double price){
		if(price < 9){
			throw new IllegalArgumentException("Cijena prazna!");
		}
		else{
			this.price = price;
		}
	}
	
	public void setManYear(int manYear) {
		this.manYear = manYear;
	}
	
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	
	public void setQuantity(int quantity) {
		if(quantity < 1){
			throw new IllegalArgumentException("Kolicina manja od 1 !!!!!!!");
		}
		else{
		this.quantity = quantity;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getManYear(){
		return manYear;
	}
	
	public int getAgeRestriction(){
		return ageRestriction;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public boolean equals(Toy other){
		
		if( this.name.equals(other.name) && this.type.equals(other.type)
			&& this.price == other.price && this.ageRestriction == other.ageRestriction
			&& this.manYear ==  other.manYear	){
		return true;
		}
		else {
			return false;
		}
	}
	public String toString(){
		String out = "";
		out +="Name: " + this.name;
		out +="\n\tType: " + this.type;
		out +="\n\tPrice: " + this.price;
		out +="\n\tAge: " + this.ageRestriction;
		out +="\n\tYear: " + this.manYear;
		out +="\n\tQuantity : " + this.quantity;
		out +="\n";
		return out;
	}
	
}
