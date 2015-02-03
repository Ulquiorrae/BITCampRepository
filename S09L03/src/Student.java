
public class Student {
	
	private int ID;
	private String name;
	private Address address;
	
	public Student(int iD, String name, Address address) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String toCSV() {
		CSVBuilder csv = new CSVBuilder();
		csv.append(ID).append(name).append(address);
		return csv.toString();
		
	}
	
	
}
