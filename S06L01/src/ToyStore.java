
public class ToyStore {

	private String name;
	private Toy[] inventory;
	private int numToys;
	
	
	public ToyStore(String name){
		setName(name);
		inventory = new Toy[1];
		numToys = 0;
	}
	
	public void setName(String name) {
		if(name.length() < 1){
			throw new IllegalArgumentException("IME PRAZNOOO!");
		}
		else{
		this.name = name;
		}
	}
	
	
	
	public void addToy(Toy newToy){
		/*Check if in inventory*/
		for(int i=0; i<numToys; i++){
			if(inventory[i].equals(newToy)){
				inventory[i].increaseQuantity(newToy.getQuantity());
			}
		}
		
		inventory[numToys] = new Toy(newToy);
		numToys++;
		if(numToys == inventory.length){
			//prosiriti inventory niz
			resize();
		}
	}
	
	/**
	 * Funkcija proširuje niz elemenata
	 */
	private void resize(){
		
		int newSize = 2 * this.inventory.length;
		Toy[] temp = new Toy[newSize];
		
		for(int i=0; i<numToys; i++){
			temp[i] = this.inventory[i];
		}
		this.inventory = temp;
	}
	
	
	public void removeToy(Toy newToy){
		
		for(int i=0; i<numToys; i++){
			if(inventory[i].equals(newToy)){
				for(int j=i; j < numToys-1; j++){
					inventory[j] = inventory[j+1];
				}
				inventory[numToys]=null;
				numToys--;
			}
		}
	}
	
//	/**
//	 * Ispis po autoru, po kriteriju. Sortiramo po kriteriju i vratimo kao string, koristimo bubble sort
//	 * @return
//	 */
//	public String printByQuantity(){
//		sortInventoryByQuantity();
//		return toString();
//	}
	
	
	public String getName() {
		return name;
	}
	
	public String toString(){
		String out = "";
		out += this.name;
		out +="\nToy list: \n";
		for(int i=0; i<numToys; i++){
			out += "\t" + inventory[i].toString();
			out += "\n";
		}
		out += "\n";
		
		return out;
	}
	
}
