package ae_oops;

public class Fan {

	private String make;
	private int radius;
	private String color;

	private boolean isOn;
	private int speed;

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Fan(String make, int radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed(5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed(0);
	}

	public String toString() {
		return String.format("Make - %s \n Radius - %d \n Color - %s \n isON - %b \n speed - %d", make, radius, color,
				isOn, speed);
	}

}
