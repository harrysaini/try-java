package an_threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);

		return String.format("Hello %s", name);
	}

}

public class ADExecutorServiceCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> message = executorService.submit(new CallableTask("Harsih"));
		System.out.println("Thread ran");

		System.out.println(message.get());

		System.out.println("Main exiited");
	}
}
