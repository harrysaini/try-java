package ak_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsRunner {

	public static void main(String[] args) {
		List<Integer> numList = List.of(11221, 222, 35, 222, 35, 5, 7);

		System.out.println(numList);

		Set<Integer> set = Set.copyOf(numList);

		System.out.println(set);

//		HAsh set
//		no order, no sorted

		HashSet<Integer> hashSet = new HashSet<>(numList);

		System.out.println(hashSet.contains(1));

		boolean ok = hashSet.add(1);
		System.out.println(ok);
		ok = hashSet.add(4);
		System.out.println(ok);

		System.out.println(hashSet);

//		HASH link list
//		order maintains

		LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<>(numList);

		System.out.println(hashSet2);

//		Tree hash set
//		sorted

		TreeSet<Integer> treeSet = new TreeSet<>(numList);

		System.out.println(treeSet);

//		tree set have extra methods
		System.out.println(treeSet.floor(222));
		System.out.println(treeSet.ceiling(222));

		System.out.println(treeSet.subSet(7, true, 222, true));

	}
}
