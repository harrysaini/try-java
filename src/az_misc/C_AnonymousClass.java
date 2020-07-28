package az_misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	private String name;
	private int id;

	public Student(String string, int i) {
		this.name = string;
		this.id = i;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

class DecreasingOrder implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		return Integer.compare(two.getId(), one.getId());
	}

}

public class C_AnonymousClass {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Ram", 12), new Student("SHysm", 1), new Student("Pola", 8));

		System.out.println(students);

		List<Student> students2 = new ArrayList<>(students);

		System.out.println(students2);

//		Anonymous class
		Collections.sort(students2, new Comparator<Student>() {

			@Override
			public int compare(Student one, Student two) {
				return Integer.compare(one.getId(), two.getId());
			}
		});

		System.out.println("asc: " + students2);

		students2.sort(new DecreasingOrder());

		System.out.println("desc: " + students2);
	}
}
