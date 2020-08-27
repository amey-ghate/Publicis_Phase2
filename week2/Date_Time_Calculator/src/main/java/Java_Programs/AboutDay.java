package Java_Programs;

import java.time.LocalDate;
import java.util.Locale;
import java.time.DayOfWeek;
import java.time.temporal.WeekFields;



public class AboutDay {
	
	public int getWeek(LocalDate date)
	{
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		int t = date.get(
				weekFields.weekOfWeekBasedYear()
				);
		return t;
	}
	
	public DayOfWeek getDay(LocalDate date)
	{
		return date.getDayOfWeek();
	}
	
}