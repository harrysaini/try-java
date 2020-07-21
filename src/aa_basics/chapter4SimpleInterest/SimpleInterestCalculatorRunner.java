package aa_basics.chapter4SimpleInterest;

public class SimpleInterestCalculatorRunner {
	public static void main(String[] args) {
		SimpleInterestCalculator sc = new SimpleInterestCalculator("1000", "10");

		System.out.println(sc.calculateTotalValue(10));
	}
}
