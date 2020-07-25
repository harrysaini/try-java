package ag_oops_inheritance;

public class Student extends Person {

	private String collegeName;
	private String studentId;

	public Student(String name) {
		super(name);
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String toString() {
		return super.toString() + "Student [collegeName=" + collegeName + ", studentId=" + studentId + "]";
	}

}
