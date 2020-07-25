package ah_oops_abstract;

public class Runner {

	private static void flyInTheAir(Flyable aFlyable) {
		aFlyable.fly();
	}

	private static void barker(Animal animal) {
		animal.bark();
	}

	public static void main(String[] args) {
		Bird aBird = new Bird();

		flyInTheAir(aBird);
		aBird.bark();

		Aeroplane aeroplane = new Aeroplane();

		flyInTheAir(aeroplane);

		Dog dog = new Dog();
		Cat cat = new Cat();

		Animal[] animals = { dog, cat };

		for (Animal a : animals) {
			barker(a);
		}

	}
}
