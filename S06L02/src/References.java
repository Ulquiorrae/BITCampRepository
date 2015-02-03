
public class References {

	public static void main(String[] args) {
		Paket p = new Paket();
		Paket[] packages = new Paket[3];

		packages[0] = p;
		
		p = new Paket();
		packages[1] = p;
		
		p = new Paket();
		packages[2] = p;
		
		packages = null;
		
	}

}
