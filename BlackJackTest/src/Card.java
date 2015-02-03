public class Card {

	private int vrijednost;
	private int broj;
	private int znak;

	public Card(int broj) {

		this.broj = broj % 13;
		this.broj++;
		if (this.broj == 1) {
			this.vrijednost = 11;
		} else if (this.broj >= 10) {
			this.vrijednost = 10;
		} else {
			this.vrijednost = this.broj;
		}
		if (this.broj >= 11) {
			this.broj++;
		}
		this.znak = broj / 13;
	}

	public int getVrijednost() {
		return vrijednost;
	}

	public int getBroj() {
		return broj;
	}

	public int getZnak() {
		return znak;
	}

	public void setVrijednost(int vrijednost) {
		this.vrijednost = vrijednost;
	}

	public void setZnak(int znak) {
		this.znak = znak;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String toString() {
		String out = "";
		out += this.broj + "\n";
		out += this.znak + "\n";
		out += this.vrijednost + "\n";
		return out;
	}

}
