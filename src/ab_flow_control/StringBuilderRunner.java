package ab_flow_control;

public class StringBuilderRunner {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder("sasa");

		stringBuilder.append(" sadsasa");

		stringBuilder.setCharAt(0, 'A');

		System.out.println(stringBuilder);

		StringBuffer stringBuffer = new StringBuffer("dsadsa");

		stringBuffer.append(" Dssa");

		System.out.println(stringBuffer);
	}

}
