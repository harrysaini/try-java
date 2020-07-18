package aa_basics.types;

public class BiNumbers {
	private int num1;
	private int num2;

	BiNumbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		return num1 + num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void doubleMe() {
		this.num1 *= 2;
		this.num2 *= 2;
	}
}
