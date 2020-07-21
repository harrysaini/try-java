package ae_oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Usha", 12, "White");

		System.out.println(fan);

		fan.switchOn();

		System.out.println(fan);

		fan.setSpeed(3);

		System.out.println(fan);

		fan.switchOff();

		System.out.println(fan);
	}

}
