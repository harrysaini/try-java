package am_fp;

import java.util.List;

public class FPRunner {

	public static void main(String[] args) {
		List<Integer> l = List.of(11, 2, 3, 4, 5, 2, 5, 3, 2, 1, 6, 3);

		printList(l);

		sumList(l);

		streamOperations(l);

	}

	private static void streamOperations(List<Integer> l) {
		System.out.println("\n\n");

		System.out.println("Operations -> -> ");

		l.stream().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();

		l.stream().distinct().forEach(e -> System.out.print(e + " "));
		System.out.println();

		l.stream().distinct().map(e -> e * e).forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

	private static void sumList(List<Integer> l) {
		System.out.println("\n\n");

		System.out.println("SUM -> -> ");

		int sum = l.stream().reduce(0, (acc, val) -> acc + val);

		System.out.println(sum);
	}

	private static void printList(List<Integer> l) {
		l.stream().forEach(elem -> {
			System.out.print(elem);
			System.out.println("sd");
		});

		l.stream().filter(elem -> elem % 2 == 0).forEach(elem -> {
			System.out.print(elem + " ");
		});

		System.out.println();

		l.stream().filter(elem -> elem % 2 == 1).forEach(elem -> {
			System.out.print(elem + " ");
		});
	}

}
