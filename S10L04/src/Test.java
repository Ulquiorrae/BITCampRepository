import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		try {
			CSVBuilder.saveObject("Users", new User("sanela", 25, false));
			CSVBuilder.saveObject("Users", new User("Žućo", 26, false));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] str = { "sanela", "25", "false" };
		User user = CSVBuilder.findObject(str);
		System.out.println(user);
	}
}
