public class Liga {
	private Tim[] timoviLige;
	private String imeLige;
	private int brojTimova;

	public Liga(String imeLige) {
		timoviLige = new Tim[8];
		brojTimova = 0;
	}

	public void dodajTim(Tim noviTim) {
		if (brojTimova > 8)
			throw new ArrayIndexOutOfBoundsException("Liga mora imat 8 timova");

		timoviLige[brojTimova] = new Tim(noviTim);
		brojTimova++;

	}

	public void izbaciTim(Tim nekiTim) {

		for (int i = 0; i < brojTimova; i++) {
			if (timoviLige[i].equals(nekiTim)) {
				for (int j = i; j < brojTimova - 1; j++) {
					timoviLige[j] = timoviLige[j + 1];
				}
				timoviLige[brojTimova - 1] = null;
				brojTimova--;
			}
		}
	}

	public int getBrojTimova() {
		return brojTimova;
	}

	public void setBrojTimova(int brojTimova) {
		this.brojTimova = brojTimova;
	}

	public Tim getTim(int redniBroj) {
		return timoviLige[redniBroj];
	}

	public String toString() {
		String ligaToString = "";
		for (int i = 0; i < brojTimova; i++) {
			ligaToString += timoviLige[i].getIme();
			ligaToString += "\n";
		}
		return ligaToString;
	}
}