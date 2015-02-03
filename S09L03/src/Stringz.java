
public class Stringz {

	public static void main(String[] args) {
		System.out.println("##############################################################################################################################");
		standard100();
		System.out.println("##############################################################################################################################");
		concat100();
		System.out.println("##############################################################################################################################");
		sBuilder100();
		System.out.println("##############################################################################################################################");
	}

	
	/**
	 * This method adds 100 numbers to a String and prints it on screen using concat method from String class.
	 */
	public static void concat100() {
		String string = "";
		for (int i = 0; i <= 100; i++) {
			if (i == 100) {
				string = string + i;
				break;
			}
			String temp = "" + i;
			string = string.concat(temp + ", ");
			temp = "";
		}
		System.out.println(string);
	}

	
	/**
	 * This method adds 100 numbers to a String and prints it on screen using Stringbuilder.
	 */
	public static void sBuilder100() {
		StringBuilder string2 = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			String temp = "" + i;
			if (i == 100) {
				string2.append(temp);
				break;
			}
			string2.append(temp + ", ");
			temp = "";
		}
		System.out.println(string2);
	}
	
	/**
	 * This method adds 100 numbers to a String and prints it on screen.
	 */
	public static void standard100() {
		String string = "";
		for (int i = 0; i <= 100; i++) {
			if (i == 100) {
				string = string + i;
				break;
			}
			string = string + i + ", ";
		}
		System.out.println(string);
	}
}
