public class Avion {
	private Paket[] packages = new Paket[3];

	public Paket[] getPackages() {
		return packages;
	}

	public double getTotalWeight() {
		double total = 0;

		for (Paket p : packages) {
			total += p.getWeight();
		}

		return total;
	}
}
