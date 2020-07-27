package ao_exceptions;

import java.util.Scanner;

public class AB_FInallyRunner {

	public static void main(String[] args) {
		scanerMe();
		System.out.println("MIai");
		scanerMeTryNew();
	}

	private static void scanerMe() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String s = "Sad";
			s.length();
			return;

		} finally {
			scanner.close();
			System.out.println("will always run");
		}
	}

	private static void scanerMeTryNew() {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = "Sad";
			s.length();
			return;
		}
	}
}

/**
 * Finally always runs RunTimeException and subclasses is not checked Other
 * exceptions are checked ( need to try/catch or throw )
 */
