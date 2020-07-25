package al_generics;

import java.util.ArrayList;

public class MyList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T elem) {
		list.add(elem);
	}

	public boolean removeElement(T elem) {
		return list.remove(elem);
	}

	public void printList() {
		for (T elem : list) {
			System.out.println(elem);
		}
	}
}
