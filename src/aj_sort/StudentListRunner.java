package aj_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DecreasingOrder implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		return Integer.compare(two.id, one.id);
	}

}

public class StudentListRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Ram", 12), new Student("SHysm", 1), new Student("Pola", 8));

		System.out.println(students);

		List<Student> students2 = new ArrayList<>(students);

		System.out.println(students2);

		Collections.sort(students2);

		System.out.println("asc: " + students2);

		students2.sort(new DecreasingOrder());

		System.out.println("desc: " + students2);
	}
}
