package acReference;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeRuner {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		System.out.println(date);

		System.out.println(date.isLeapYear());

		date.plusDays(6);

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(dateTime);

		System.out.println(dateTime.getChronology());
	}

}
