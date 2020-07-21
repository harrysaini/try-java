package aa_basics.chapter5CharDataType;

public class MyChar {

	private char c;

	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVowel() {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}

		return false;
	}

	private boolean charInRange(int low, int high) {
		int code = (int) c;
		if (low <= code && code <= high) {
			return true;
		}

		return false;
	}

	public boolean isNumber() {
		return charInRange('0', '9');
	}

	public boolean isAplhabet() {
		return charInRange(97, 122) || charInRange(65, 90);
	}

	private static void printAllInRange(int low, int high) {
		for (int i = low; i <= high; i++) {
			System.out.print((char) i + " - ");
		}
	}

	public static void printLowerCaseLetters() {
		printAllInRange(97, 122);
	}

	public static void printUpperCaseLetters() {
		printAllInRange('A', 'Z');
	}
}
