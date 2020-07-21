package ab_flow_control;

public class StringLoopsRunner {

	public static void main(String[] args) {
		String aString = "U am a rokstar amir khabn";

		for (int i = 0; i < aString.length(); i++) {
			System.out.print(aString.charAt(i) + "-" + (int) aString.charAt(i) + " ");
		}

		System.out.println();

		// Java handles strings very similar to golang
		// yes bytes here, based on encoding

		String bString = "日本語";

		for (int i = 0; i < bString.length(); i++) {
			System.out.println(bString.charAt(i) + " " + (int) bString.charAt(i));
		}

		System.out.println(aString.substring(1, 2));

		System.out.println(aString.subSequence(0, 12));

		System.out.println(aString.endsWith("n"));

		System.out.println(bString.endsWith("語"));

		System.out.println("語".equals("語"));

		aString.replace('a', 'b');

		// many methods in strings
	}

}
