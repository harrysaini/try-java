package am_fp;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FPConcepts {

	public static void main(String[] args) {
		List<Integer> l = List.of(11, 2, 3, 4, 5, 2, 5, 3, 2, 1, 6, 3);

		Consumer<? super Integer> action = printConsumer();

		Predicate<? super Integer> predicate = isEventPredicate();

		l.stream().filter(predicate).forEach(action);

		System.out.println();

		BinaryOperator<Integer> accumulator = sumAccumulator();

		int sum = l.stream().reduce(0, accumulator);

		System.out.println(sum);

	}

	private static BinaryOperator<Integer> sumAccumulator() {
		return (acc, val) -> acc + val;
	}

	private static Consumer<? super Integer> printConsumer() {
		return elem -> {
			System.out.print(elem);
			System.out.println("sd");
		};
	}

	private static Predicate<? super Integer> isEventPredicate() {
		return elem -> elem % 2 == 0;
	}
}
