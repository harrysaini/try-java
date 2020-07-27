package ao_exceptions;

class MyArgumentInvalidExeception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5032183995336753131L;

	public MyArgumentInvalidExeception(String msg) {
		super(msg);
	}
}

class MyNumber {
	private int number;

	public MyNumber(int number) {
		super();
		this.number = number;
	}

	public int divideBy(MyNumber that) throws MyArgumentInvalidExeception {
		if (that.number == 0) {
			throw new MyArgumentInvalidExeception("Divide by zero");
		}
		return this.number / that.number;
	}
}

public class AC_CustomException {
	public static void main(String[] args) {

		MyNumber n = new MyNumber(12);

		MyNumber n2 = new MyNumber(0);

		try {
			int result = n.divideBy(n2);
			System.out.println(result);
		} catch (MyArgumentInvalidExeception e) {
			e.printStackTrace();
		}
	}
}
