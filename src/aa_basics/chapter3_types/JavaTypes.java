package aa_basics.chapter3_types;

import java.math.BigDecimal;

public class JavaTypes {

	public static void main(String[] args) {
		int a = 12;

		int b = 24;

		short c = 12;

		short d = (int) 45;

		float f = 312.321f;

		double r = 34.23;

		boolean ab = true;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(r);
		System.out.println(ab);

		BigDecimal bg1 = new BigDecimal("321.321321");
		BigDecimal bg2 = new BigDecimal("213.312");

		BigDecimal bg3 = bg1.add(bg2);

		System.out.println(bg3.floatValue());

		System.out.println("213");

		BigDecimal aBigDecimal = new BigDecimal("2321");

		System.out.println(aBigDecimal.multiply(bg3));

	}

}
