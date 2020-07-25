package ak_sets;

import java.util.Collections;
import java.util.HashMap;

public class UseMapRunner {

	public static void main(String[] args) {
		String aString = "I am a very good boy. I like to do good work. Ha Ha Ha";

		countCharacters(aString);

		countWords(aString);

	}

	/**
	 * Count number of words
	 * 
	 * @param aString
	 */
	private static void countWords(String aString) {
		String[] words = aString.replace(".", "").split(" ");

		HashMap<String, Integer> countWords = new HashMap<>();

		for (String word : words) {
			Integer val = countWords.get(word);
			Integer updatedVal = val == null ? 1 : val + 1;
			countWords.put(word, updatedVal);
		}

		System.out.println(countWords);
	}

	/**
	 * Count number of characters
	 * 
	 * @param aString
	 */
	private static void countCharacters(String aString) {
		char[] characters = aString.toCharArray();
		HashMap<Character, Integer> count = new HashMap<>();

		for (char character : characters) {
			Integer val = count.get(character);
			Integer updatedVal = val == null ? 1 : val + 1;
			count.put(character, updatedVal);
		}

		System.out.println(count);

		System.out.println(Collections.max(count.values()));
	}
}
