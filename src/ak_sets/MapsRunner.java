package ak_sets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsRunner {

	public static void main(String[] args) {

		Map<String, Integer> map = Map.of("AasDFGsa", 1, "Bdsads", 3, "dasdas", 3);

		System.out.println(map);

//		Hash map
//		no order, no sorted

		HashMap<String, Integer> map2 = new HashMap<>(map);

		map2.put("AB", 2);
		map2.put("sadsa", 2);

		System.out.println(map2);

		map2.put("AB", 21);
		System.out.println("hash" + map2);

		System.out.println("\n");

//		Linked Hash map
//	    order, no sorted

		LinkedHashMap<String, Integer> map21 = new LinkedHashMap<>(map);

		map21.put("AB", 2);
		map21.put("sadsa", 2);

		System.out.println(map21);

		map21.put("AB", 21);
		System.out.println("linkded" + map21);

		System.out.println("\n");

//		Tree Map
//		sorted

		TreeMap<String, Integer> map211 = new TreeMap<>(map);

		map211.put("AB", 2);
		map211.put("sadsa", 2);

		System.out.println(map211);

		map211.put("AB", 21);
		System.out.println("tree" + map211);

		System.out.println(map211.ceilingKey("AB"));

		System.out.println(map211.subMap("AB", true, "z", true));

	}

}
