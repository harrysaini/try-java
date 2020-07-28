package aq_concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	private int i = 0;
	private AtomicInteger j = new AtomicInteger();

	Lock lock = new ReentrantLock();

	synchronized public void incrementI() {
		int a = i;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a++;
		i = a;
	}

	public void lockIncrementI() {
		lock.lock();
		int a = i;
		a++;
		i = a;
		lock.unlock();
	}

	public void incremtJ() {
		j.incrementAndGet()
	}

	public int getI() {
		return i;
	}
}

class Incrementor extends Thread {

	private Counter counter;
	private int number;

	public Incrementor(int number, Counter counter) {
		this.counter = counter;
		this.number = number;
	}

	public void run() {
		counter.incrementI();
		System.out.println(number + " " + counter.getI());
	}
}

public class A_Synchronized {

	public static void main(String[] args) throws InterruptedException {
//		viaExecutorService();

//		System.out.println("\n\n\\n\n\n");

		viaSimpleLoop();
	}

	private static void viaSimpleLoop() throws InterruptedException {
		Counter counter = new Counter();

		List<Incrementor> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(new Incrementor(i, counter));
		}

		for (Incrementor incrementor : list) {
			incrementor.start();
		}

		System.out.println("Main");

		for (Incrementor incrementor : list) {
			incrementor.join();
		}

		System.out.println("Final value " + counter.getI());
	}

	private static void viaExecutorService() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Counter counter = new Counter();

		for (int i = 1; i <= 100; i++) {
			executorService.execute(new Incrementor(i, counter));
		}

		System.out.println("Main");

		executorService.shutdown();

		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			System.out.println("Final value " + counter.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
