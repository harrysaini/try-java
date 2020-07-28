package az_misc;

class ID {
	private int id;

	public ID(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ID other = (ID) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

public class A_ObjectEqualsRunner {
	public static void main(String[] args) {
		ID one = new ID(1);

		ID two = new ID(1);

		System.out.println(two.hashCode());
		System.out.println(one.hashCode());

		Integer a = 1;

		System.out.println(a.hashCode());

		String saa = "sads";

		System.out.println(saa.hashCode());

		System.out.println(one.equals(two));
	}
}
