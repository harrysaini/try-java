package chapterTwo;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike bullet = new MotorBike();

		bullet.setSpeed(12);

		System.out.println(bullet.getSpeed());

		MotorBike bike = new MotorBike();

		bike.setSpeed(12);

		System.out.println(bike.getSpeed());

		MotorBike hola = new MotorBike();

		hola.setSpeed(23);
		System.out.println(hola.getSpeed());

	}

}
