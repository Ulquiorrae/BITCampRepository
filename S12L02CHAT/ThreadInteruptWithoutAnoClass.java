public class ThreadInteruptWithoutAnoClass extends Thread {

	public static void main(String[] args) {

		System.out.println("Program starts...");

		Thread firstThread = new LongSleepThread();
		Thread secondThread = new ShortSleepThread();
		
		firstThread.start();
		secondThread.start();

		System.out.println("Programs ends!");
	}

	
	public static class LongSleepThread extends Thread {
		@Override
		public void run() {
			try {
				sleep(3000);
				System.out.println("Good morning yo!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class ShortSleepThread extends Thread {
		@Override
		public void run() {
			try {
				sleep(1500);
				System.out.println("Early bird yo!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
