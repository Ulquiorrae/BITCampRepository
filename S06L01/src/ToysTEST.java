
public class ToysTEST {

	public static void main(String[] args) {

		Toy prva = new Toy("Name213", "tip1", 12,12,12);
		Toy druga = new Toy("Name2", "tip2", 42,121,23);
		Toy treca = new Toy("Name3", "tip3", 10,18,33);
		
		ToyStore store = new ToyStore("Prodavnica bureka");
		store.addToy(prva);
		store.addToy(druga);
		store.addToy(treca);
		
		System.out.println(store.toString());
		
		
		store.removeToy(prva);
		System.out.println(store.toString());
		
		
	}

}
