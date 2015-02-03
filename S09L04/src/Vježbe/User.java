package Vježbe;

public class User {

	private String name;
	private String surname;
	private int age;
	boolean driversLicence;
	
	
	/**
	 * Constructor for class {@link User}
	 * @param name - String
	 * @param surname - String
	 * @param age - int
	 * @param driversLicence - boolean
	 */
	public User(String name, String surname, int age, boolean driversLicence) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.driversLicence = driversLicence;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isDriversLicence() {
		return driversLicence;
	}


	public void setDriversLicence(boolean driversLicence) {
		this.driversLicence = driversLicence;
	}
	
	
	public String toCSVString(String delimeter) {
		String string = "";
		string = string.concat(name + delimeter + " ");
		string = string.concat(surname + delimeter + " ");
		string = string.concat(age + delimeter + " ");
		string = string.concat(driversLicence + "");
		return string;
	}
	
	
	
	
}
