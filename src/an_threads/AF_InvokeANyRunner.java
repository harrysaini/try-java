package an_threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AF_InvokeANyRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("ram"), new CallableTask("Shyam"),
				new CallableTask("hola"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();

	}
}
