package aa_basics.types;

public class BiNumbersRunner {

	public static void main(String[] args) {
		BiNumbers a = new BiNumbers(12, 10);

		System.out.println(a.add());
		System.out.println(a.multiply());

		a.doubleMe();

		System.out.println(a.getNum1());
		System.out.println(a.getNum2());
	}

}
