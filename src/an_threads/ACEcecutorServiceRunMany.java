package an_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println(String.format("\nTask%d  started", number));
		for (int i = 100 * number; i < 100 * (number + 1); i++) {
			System.out.print(i + " ");
		}
		System.out.println(String.format("\nTask%d  ended", number));
	}
}

public class ACEcecutorServiceRunMany {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));

		executorService.shutdown();

	}

}
