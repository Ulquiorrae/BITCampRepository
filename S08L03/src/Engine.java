
public class Engine {
	private String name;
	private Truck nextTruck;
	
	public Engine(String name){
		this.name = name;
	}
	
	
	public void attach(Truck nextTruck){
		this.nextTruck = nextTruck;
	}
			
	public Truck getFirst(){
		return nextTruck;
	}
	
	
	
}