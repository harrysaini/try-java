package ag_oops_inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Ram");

		student.setEmail("email@gmail.com");

		student.setAge(12);

		student.setCollegeName("PEC");

		student.setStudentId("14103033");

		System.out.println(student);

		Person sPerson = new Student("ram");

		sPerson.toString();

	}

}
