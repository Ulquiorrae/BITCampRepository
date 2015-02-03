package Tarik;

import java.util.ArrayList;

public class WriteRandomHash implements Runnable{

	private String name;
	
	public WriteRandomHash(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		ArrayList<String> strings = new ArrayList();
		strings.add("Tarik");
		strings.add("Davor");
		strings.add("Joe");
		strings.add("Messi");
		strings.add("Pedro");

		for (String s : strings) {
			System.out.println(name + ":" + s);
		}
	}
}
