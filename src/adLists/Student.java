package adLists;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumbersOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		return Collections.max(marks);
	}

	public int getMinimumMarks() {
		return Collections.min(marks);
	}

	public double getAverageMarks() {
		return getTotalSumOfMarks() / (1.0 * getNumbersOfMarks());
	}

	public void addMark(int mark) {
		marks.add(mark);
	}

	public void removeMark(int index) {
		marks.remove(index);
	}

	public String toString() {
		return name + marks;
	}

}
