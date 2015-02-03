public class Student {
	private String ime;
	private String prezime;
	private String email;

	public Student() {
		this.ime = "none";
		this.email = "none";
		this.prezime = "none";
	}

	public Student(String ime, String prezime, String email) {
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		String out = "Ime studenta: " + ime + "\nPrezime Studenta: " + prezime + "\nEmail: " + email;
		return out;
	}

}
