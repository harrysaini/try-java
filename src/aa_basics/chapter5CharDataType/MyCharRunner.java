package aa_basics.chapter5CharDataType;

public class MyCharRunner {
	public static void main(String[] args) {
		MyChar char1 = new MyChar('a');

		System.out.println(char1.isVowel());
		System.out.println(char1.isAplhabet());
		System.out.println(char1.isNumber());

		MyChar char2 = new MyChar('1');

		System.out.println(char2.isVowel());
		System.out.println(char2.isAplhabet());
		System.out.println(char2.isNumber());

		MyChar.printLowerCaseLetters();
		System.out.println();
		MyChar.printUpperCaseLetters();
	}
}
