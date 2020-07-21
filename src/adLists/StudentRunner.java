package adLists;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 100, 92, 93, 94, 85, 9 };

		Student student = new Student("Ram", marks);

		System.out.println(student.getMaximumMarks());
		System.out.println(student.getAverageMarks());
		System.out.println(student.getMinimumMarks());
		System.out.println(student.getTotalSumOfMarks());

		student.addMark(92);

		System.out.println(student);

		student.removeMark(0);

		System.out.println(student);

		int aString;

		aString = 6;

		System.out.println(aString);

	}

}
