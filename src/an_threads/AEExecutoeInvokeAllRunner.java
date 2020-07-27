package an_threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AEExecutoeInvokeAllRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("ram"), new CallableTask("Shyam"),
				new CallableTask("hola"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		executorService.shutdown();

	}
}
