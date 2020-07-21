package ab_flow_control;

import java.util.Scanner;

public class MenuMapperRunner {

	private static void printOptions() {
		System.out.println("Choose options");
		System.out.println("Addition  - 1");
		System.out.println("Minus - 2");
		System.out.println("Multiply - 3");
		System.out.println("Divide - 4");
		System.out.println("Exit - 5");

		System.out.print("Choose option - ");
	}

	private static int performOperation(int num1, int num2, int operation) {
		if (operation == 1) {
			return num1 + num2;
		} else if (operation == 2) {
			return num1 - num2;
		} else if (operation == 3) {
			return num1 * num2;
		} else if (operation == 4) {
			return num1 / num2;
		} else {
			return -1;
		}
	}

	private static int performOperationSwitch(int num1, int num2, int operation) {
		switch (operation) {
		case 1:
			return num1 + num2;
		case 2:
			return num1 - num2;
		case 3:
			return num1 * num2;
		case 4:
			return num1 / num2;
		default:
			return -1;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("Enter number 1 - ");

			int num1 = scanner.nextInt();

			System.out.print("Enter number 2 - ");

			int num2 = scanner.nextInt();

			printOptions();

			int option = scanner.nextInt();
			if (option == 5) {
				System.out.println("Exiting");
				break;
			}

			int result = performOperationSwitch(num1, num2, option);

			System.out.println("Anwser is - " + result);
			System.out.println();
			System.out.println();

		}

		scanner.close();

	}

}
