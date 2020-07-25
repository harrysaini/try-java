package ak_sets;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLenghtComparator implements Comparator<String> {

	private boolean isDesc;

	public StringLenghtComparator(boolean isDesc) {
		super();
		this.isDesc = isDesc;
	}

	@Override
	public int compare(String o1, String o2) {
		return !this.isDesc ? Integer.compare(o1.length(), o2.length()) : Integer.compare(o2.length(), o1.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> myQueue = new PriorityQueue<>();

		myQueue.offer("Ram");
		myQueue.offer("Shyam");
		myQueue.offer("Kala");
		myQueue.offer("Krishan");
		myQueue.offer("Aman");

		System.out.println(myQueue);

		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());

		Queue<String> myQueue2 = new PriorityQueue<>(new StringLenghtComparator(true));

		myQueue2.offer("Ram");
		myQueue2.offer("Shyam");
		myQueue2.offer("Kala");
		myQueue2.offer("Krishan");
		myQueue2.offer("Aman");

		System.out.println(myQueue2);

		Queue<String> myQueue3 = new PriorityQueue<>(new StringLenghtComparator(false));

		myQueue3.offer("Ram");
		myQueue3.offer("Shyam");
		myQueue3.offer("Kala");
		myQueue3.offer("Krishan");
		myQueue3.offer("Aman");

		System.out.println(myQueue3);

	}

}
