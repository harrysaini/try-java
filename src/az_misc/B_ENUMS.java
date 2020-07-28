package az_misc;

enum Season {
	WINTER("win"), SPRING("spr"), AUTOMN("au"), SUMMER("sm");

	private String value;

	private Season(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	};

}

public class B_ENUMS {

	public static void main(String[] args) {
		Season season = Season.AUTOMN;

		System.out.println(season.getValue());
	}
}
