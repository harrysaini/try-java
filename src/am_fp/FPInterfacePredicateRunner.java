package am_fp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}

class DoubleFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * 2;
	}

}

class PrintConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}

public class FPInterfacePredicateRunner {

	public static void main(String[] args) {
		List<Integer> l = List.of(11, 2, 3, 4, 5, 2, 5, 3, 2, 1, 6, 3);

		l.stream().filter(new EvenNumberPredicate()).map(new DoubleFunction()).forEach(new PrintConsumer());

	}

}
