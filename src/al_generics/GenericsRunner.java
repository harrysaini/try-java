package al_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static <X extends Number> double doubleMe(X elem) {
		return elem.doubleValue() * 2;
	}

	public static double sumOfList(List<? extends Number> list) {
		double sum = 0;

		for (Number num : list) {
			sum += num.doubleValue();
		}

		return sum;
	}

	public static void addValuesToList(List<? super Number> list) {
		list.add(5l);
		list.add(5.4f);
		list.add(5);
		list.add(5.0);

//		list.add("Das");
	}

	public static void main(String[] args) {
		genricList();

		System.out.println(doubleMe(12));

//		System.out.println(doubleMe("sad"));

		List<Integer> l = List.of(1, 2, 3, 4, 5);

		System.out.println(sumOfList(l));

		List<Number> l2List = new ArrayList<>();

		addValuesToList(l2List);

		System.out.println(l2List);

	}

	private static void genricList() {
		MyList<Integer> list = new MyList<>();

		list.addElement(2);
		list.addElement(5);
		list.addElement(2);
		list.addElement(4);

		list.printList();

		MyList<String> list2 = new MyList<>();

		list2.addElement("Dsasda");
		list2.addElement("Dsasda");
		list2.addElement("Dsasda");
		list2.addElement("Dsasda");

		list2.printList();
	}

}
