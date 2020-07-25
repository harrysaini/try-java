package am_fp;

import java.util.List;

public class FPStaticRferenceRunner {
	public static void print(Object a) {
		System.out.println(a);
	}

	public static Integer square(Integer i) {
		return i * i;
	}

	public static boolean isEven(Integer i) {
		return i % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> l = List.of(11, 2, 3, 4, 5, 2, 5, 3, 2, 1, 6, 3);

		l.stream().map(FPStaticRferenceRunner::square).forEach(FPStaticRferenceRunner::print);

		System.out.println("\n");

		Integer max = l.stream().filter(FPStaticRferenceRunner::isEven).max(Integer::compare).orElse(0);

		System.out.println(max);
	}
}
