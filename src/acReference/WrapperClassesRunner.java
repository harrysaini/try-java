package acReference;

public class WrapperClassesRunner {

	public static void main(String[] args) {

//		deplrecated
//		Integer integer = new Integer(7);
//
//		Integer integer2 = new Integer(8);

		Integer integer3 = 7;
		Integer integer4 = Integer.valueOf(7);
		System.out.println(integer3 == integer4);

		System.out.println(Integer.MAX_VALUE);

		System.out.println(integer3.hashCode());

		Float float1 = Float.valueOf(0.1f);

		System.out.println(float1 + float1);

	}
}
