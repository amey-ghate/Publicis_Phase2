package Java_Programs;

import java.time.LocalDate;

public class Relative {
	
	public LocalDate lastWeek(LocalDate date) {
		return date.minusWeeks(1);
	}

	public LocalDate lastMonth(LocalDate date) {
		return date.minusMonths(1);
	}

	public LocalDate lastYear(LocalDate date) {
		return date.minusYears(1);
	}
	
	public LocalDate yesterday(LocalDate date) {
		return date.minusDays(1);
	}

	public LocalDate tomorrow(LocalDate date) {
		return date.plusDays(1);
	}
	
	public LocalDate getNDaysEarlier(LocalDate date, int n) {
		return date.minusDays(n);
	}

	public LocalDate getNWeekaEarlier(LocalDate date, int n) {
		return date.minusWeeks(n);
	}

	public LocalDate getNMonthsEarlier(LocalDate date, int n) {
		return date.minusMonths(n);
	}

	public LocalDate getNDaysFromNow(LocalDate date, int n) {
		return date.plusDays(n);
	}

	public LocalDate getNWeekFromNow(LocalDate date, int n) {
		return date.plusWeeks(n);
	}

	public LocalDate getNMonthsFromNow(LocalDate date, int n) {
		return date.plusMonths(n);
	}
	
	public LocalDate dayBeforeYesterday(LocalDate date) {
		return date.minusDays(2);
	}

	public LocalDate dayAfterTomorrow(LocalDate date) {
		return date.plusDays(2);
	}

}