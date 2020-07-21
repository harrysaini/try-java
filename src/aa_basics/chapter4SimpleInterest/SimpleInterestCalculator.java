package aa_basics.chapter4SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int years) {
		return principle
				.add(principle.multiply(interest.divide(new BigDecimal("100")).multiply(new BigDecimal(years))));
	}
}
