package ao_exceptions;

public class AA_ExceptionHandling {
	public static void main(String[] args) {
		methodOne();
		System.out.println("Main end");
	}

	public static void methodOne() {
		methodTwo();
		System.out.println("MethodOne end");
	}

	public static void methodTwo() {
		try {
			throwNullPointerException(false);
			throwIndexOutOfBounfException(true);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catched");
			e.printStackTrace();
		}
		System.out.println("MethodTwo end");
	}

	public static void throwNullPointerException(boolean throwError) {
		if (throwError) {
			throw new NullPointerException();
		}
	}

	public static void throwIndexOutOfBounfException(boolean throwError) {
		if (throwError) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
