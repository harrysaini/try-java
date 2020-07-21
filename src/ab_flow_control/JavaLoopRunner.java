package ab_flow_control;

import java.util.Scanner;

public class JavaLoopRunner {

	public static void forLoop() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("For loop end");
	}

	public static void whileLoop() {
		int i = 0;
		while (i < 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("While loop end");
	}

	/**
	 * DO while loop
	 */
	public static void doWhile() {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.print("Enter number - ");
			a = scanner.nextInt();

			System.out.println("Square is, " + (a * a));
		} while (a >= 0);
		System.out.println("do while loop end");
		scanner.close();
	}

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		doWhile();
	}
}
