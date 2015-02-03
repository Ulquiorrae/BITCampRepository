public class User implements CSVInterface {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private boolean isJavaProgrammer;

	public User() {
		super();
	}

	public User(String name, int age, boolean isJavaProgrammer) {
		this.name = name;
		this.age = age;
		this.isJavaProgrammer = isJavaProgrammer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isJavaProgrammer() {
		return isJavaProgrammer;
	}

	public void setJavaProgrammer(boolean isJavaProgrammer) {
		this.isJavaProgrammer = isJavaProgrammer;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (isJavaProgrammer ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		User other = (User) obj;
		
		if (age != other.age)
			return false;
		if (isJavaProgrammer != other.isJavaProgrammer)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", isJavaProgrammer="
		+ isJavaProgrammer + "]";
	}

	
	@Override
	public String objectToCSV()
	{
		return getName() + ", " + getAge() + ", " + isJavaProgrammer();
	}

	
	@Override
	public void csvToObject(String csv) {
		String[] array = csv.split(", ");
		this.name = array[0];
		this.age = Integer.parseInt(array[1]);
		this.isJavaProgrammer = Boolean.parseBoolean(array[2]);
	}

}
