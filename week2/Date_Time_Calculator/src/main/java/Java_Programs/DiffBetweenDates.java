package Java_Programs;

import java.time.LocalDate;
import java.util.Date;

import java.time.temporal.ChronoUnit;

public class DiffBetweenDates {
	
	public long daysBetweenDates(LocalDate date1, LocalDate date2) {
		return ChronoUnit.DAYS.between(date1, date2);
		
	}

	public long monthsBetweenDates(LocalDate date1, LocalDate date2) {
		return ChronoUnit.MONTHS.between(date1, date2);
		
	}

	public long yearBetweenDates(LocalDate date1, LocalDate date2) {
		return ChronoUnit.YEARS.between(date1, date2);
		
	}

}