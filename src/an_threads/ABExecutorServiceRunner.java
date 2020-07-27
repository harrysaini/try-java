package an_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ABExecutorServiceRunner {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		System.out.println("\nTask 3 KickedOff");
		System.out.println("\nTask 3 started");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 ended");

		System.out.println("Main ended");

		executorService.shutdown();
	}

}
