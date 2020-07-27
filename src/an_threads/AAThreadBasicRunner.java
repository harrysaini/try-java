package an_threads;

class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask 1 started");
		for (int i = 100; i < 200; i++) {
			System.out.print(i + " ");
			Thread.yield();
		}
		System.out.println("\nTask 1 ended");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask 2 started");
		for (int i = 200; i < 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 ended");
	}

}

public class AAThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\nTask 1 KickedOff");
		Thread task1 = new Task1();
		task1.setPriority(10);
		task1.start();

		System.out.println("\nTask 2 KickedOff");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(1);
		task2Thread.start();

		task1.join();
		task2Thread.join();

		Thread.sleep(1000);

		System.out.println("\nTask 3 KickedOff");
		System.out.println("\nTask 3 started");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 ended");

		System.out.println("Main ended");

	}
}
