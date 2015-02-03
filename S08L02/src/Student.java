public class Student {

	private String name;
	private int index;
	private double gpa;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param index
	 * @param gpa
	 */
	public Student(String name, int index, double gpa) {
		this.name = name;
		this.index = index;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// public int compareTo(Student other){
	//
	// if(this.gpa > other.gpa){
	// return 1;
	// }
	// if(this.gpa < other.gpa){
	// return -1;
	// }
	// if(this.gpa == other.gpa){
	// if(this.index > other.index){
	// return 1;
	// }
	// if(this.index < other.index){
	// return -1;
	// }
	// if(this.index == other.index){
	// if(this.name.compareTo(other.name) == 1){
	// return 1;
	// }
	// else return -1;
	// }
	// }
	// return 0;
	//
	// }

	public int compareTo(Student other) {

		if (this.gpa > other.gpa)
			return 1;
		else if (this.gpa < other.gpa)
			return -1;

		else {

			if (this.index > other.index)
				return 1;
			else if (this.index < other.index)
				return -1;
			else {

				if (this.name.compareTo(other.name) > 0)
					return 1;
				else if (this.name.compareTo(other.name) < 0)
					return -1;
				else
					return 0;

			}

		}

	}

}
	