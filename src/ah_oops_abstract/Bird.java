package ah_oops_abstract;

public class Bird extends Animal implements Flyable {

	@Override
	public void fly() {
		System.out.println("wings maaring maaring");
	}

	@Override
	void bark() {
		System.out.println("chew chew");
	}

}
