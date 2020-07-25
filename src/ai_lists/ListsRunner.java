package ai_lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsRunner {

	public static void main(String[] args) {

		List<String> words = List.of("Apple", "Bat", "Cat", "Dog");

//		words.add("Ram"); is immutabel

		System.out.println(words);

		List<String> wordsAl = new ArrayList<String>(words);

		System.out.println(wordsAl);

		wordsAl.add("Ram");

		System.out.println(wordsAl);

		wordsAl.addAll(List.of("Ram", "Shyam"));

		System.out.println(wordsAl);

		for (String word : wordsAl) {
			System.out.println(word);
		}

		System.out.println("\n\n");

		Iterator<String> iterator = wordsAl.iterator(); // used for deletion

		System.out.println(iterator.next());

		System.out.println(iterator.next());

		while (iterator.hasNext()) {
			if (iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}

		System.out.println(wordsAl);

		Iterator<String> iterator2 = wordsAl.iterator(); // used for deletion

		System.out.println(iterator2.next());

		System.out.println(iterator2.next());

		System.out.println(iterator2.next());

	}

}
