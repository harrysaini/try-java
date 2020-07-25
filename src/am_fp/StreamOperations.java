package am_fp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {

	public static void main(String[] args) {
		List<Integer> l = List.of(11, 2, 3, 4, 5, 2, 5, 3, 2, 1, 6, 3);

		Optional<Integer> max = l.stream().max((a, b) -> Integer.compare(a, b));

		System.out.println(max.get());

		Optional<Integer> min = l.stream().min((a, b) -> Integer.compare(a, b));

		System.out.println(min.get());

		List<Integer> even = l.stream().filter(elem -> elem % 2 == 0).collect(Collectors.toList());

		System.out.println(even);

		List<Integer> squares = IntStream.range(0, 11)
				.map(e -> e * e)
				.boxed()
				.collect(Collectors.toList());

		System.out.println(squares);

	}

}
