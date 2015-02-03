package Tarik;

public class OurMultithreadedApp {

	public static void main(String[] args) {

		WriteIntegers wi = new WriteIntegers("Integers");
		WriteStrings ws = new WriteStrings("Strings");
		WriteRandomHash wrh = new WriteRandomHash("Hash");
		Thread t = new Thread(wrh);
		t.start();
		wi.start();
		ws.start();
	}

}
