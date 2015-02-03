package Tarik;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class WriteStrings extends Thread {

	private String name;

	public WriteStrings(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		ArrayList<String> strings = new ArrayList();
		strings.add("Vedad");
		strings.add("Mustafa");
		strings.add("Emir");
		strings.add("Gordan");
		strings.add("Haris");

		for (String s : strings) {
			System.out.println(name + ":" + s);
		}
	}
}
