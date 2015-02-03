import java.util.Scanner;

public class ThreadInterupt extends Thread {

	public static void main(String[] args) {

		System.out.println("Program starts...");

		Thread firstThread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(3000);
					System.out.println("Good morning ppl!");
				} catch (InterruptedException e) {
					System.out.println("Not a good morning!");
				}
			}
		};
		

		Thread secondThread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1500);
					System.out
							.println("U no say good morning to me! I got up first! BISH!");
					firstThread.interrupt();
				} catch (InterruptedException e) {
					System.out.println("Not a good morning!");
				}
			}
		};
		
//		firstThread.setDaemon(true);
//		secondThread.setDaemon(true);
		
		
		
		firstThread.start();
		secondThread.start();
		
//		Scanner s = new Scanner(System.in);
//		s.nextLine();

		try {
			firstThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Programs ends!");
	}
	

}
