import java.util.Date;

public class DatumMULTI extends Thread {

	private int start;
	private int end;
	private static int counter;
	private Date startTime;
	private static Date endTime;

	public DatumMULTI(int start, int end) {
		this.start = start;
		this.end = end;
		counter = 0;
	}

	public static int getCounter() {
		return counter;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void run() {
		startTime = new Date();
		for (int i = this.start; i < this.end; i++) {
			if (isPrime(i)) {
				this.counter++;
			}
		}
		endTime = new Date();
		printResult();
	}

	private void printResult() {

		System.out.printf("From %7d to %7d counter: %5d", start, end, counter);
		System.out.println("Thread time: " + (double) (endTime.getTime() - startTime.getTime()) / 1000);

	}

	
	public static void main(String[] args) {

		int numThreads = 5;
		int startInterval = 1;
		int endInterval = 20;
		int step = (endInterval - startInterval) / numThreads;
	

		DatumMULTI[] threads = new DatumMULTI[numThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new DatumMULTI(startInterval + i * step, startInterval + (i + 1) * step);
			threads[i].start();
		}
		
		for(int i=0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Date startTime = new Date();
			
			System.out.println("Total time: " + (double) (endTime.getTime() - startTime.getTime()) / 1000);
		}
	}

}
