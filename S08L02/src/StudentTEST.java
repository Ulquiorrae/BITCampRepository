
public class StudentTEST {

	public static void main(String[] args) {
		
		Student prvi = new Student("Haris", 16051,7);
		Student drugi = new Student("Damir", 12321,9);
		Student treci = new Student("Gordan", 18431,5);
		Student cetvrti = new Student("Marko", 16781,8);
		Student peti = new Student("Messi", 14231,8);
		
		
		Student [] students = new Student[5];
		
		students[0] = prvi;
		students[1] = drugi;
		students[2] = treci;
		students[3] = cetvrti;
		students[4] = peti;
		
		sortStudents(students);
		
		for(Student student : students){
			System.out.println(student);
		}
		
	}

	public static void sortStudents(Student [] arrayOfStudents) {

		for (int i = 1; i < arrayOfStudents.length; i++) {

			Student key = arrayOfStudents[i];
			int j = i;

			while (j > 0 && key.compareTo(arrayOfStudents[j-1]) == -1) {

				arrayOfStudents[j] = arrayOfStudents[j-1];
				j--;
			}
			 arrayOfStudents[j] = key;
		}

	}
}
