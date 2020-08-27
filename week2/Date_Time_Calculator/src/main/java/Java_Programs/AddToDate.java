package Java_Programs;

import java.time.LocalDate;


public class AddToDate {
	
	public LocalDate addYearsToDate(LocalDate date , int years)
	{
		return date.plusYears(years);
	}
	public LocalDate addDaysToDate(LocalDate date , int days)
	{
		return date.plusDays(days);
	}
	public LocalDate addWeeksToDate(LocalDate date , int weeks)
	{
		return date.plusMonths(weeks);
	}
	
	public LocalDate addMonthsToDate(LocalDate date , int months)
	{
		return date.plusMonths(months);
	}

}