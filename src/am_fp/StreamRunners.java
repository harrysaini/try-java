package am_fp;

import java.util.List;
import java.util.stream.IntStream;

public class StreamRunners {

	public static void main(String[] args) {

		IntStream.range(1, 11).map(i -> i * i).forEach(elem -> System.out.println(elem));

		System.out.println("\n");

		List<String> words = List.of("Apple", "Bat", "Cat");

		words.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

		System.out.println("\n");

		words.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

	}

}
