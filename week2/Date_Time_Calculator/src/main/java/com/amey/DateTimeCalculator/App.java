package com.amey.DateTimeCalculator;

import java.time.LocalDate;
import java.util.Scanner;
import com.amey.DateDaysMonths.*;
import com.amey.DateTimeCalculator.*;

import Tasks.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("****** WELCOME TO DATE TIME APP ******");
        System.out.println("Select the options below -");
        System.out.println("\n"
        		+ "1. get day \n"
        		+ "2. get week \n"
        		+ "3. add years to date \n"
        		+ "4. add days to date \n"
        		+ "5. add months to date \n"
        		+ "6. add weeks to date \n"
        		+ "7. days between dates \n"
        		+ "8. weeks between dates \n"
        		+ "9. years between dates \n"
        		+ "10. yesterday \n"
        		+ "11. date last week \n"
        		+ "12. date last year \n"
        		+ "13. date last month \n"
        		+ "14. date last year \n"
        		+ "15. yesterday \n"
        		+ "16. tomorrow \n"
        		+ "17. day before yesterday \n"
        		+ "18 day after tomorrow \n"
        		+ "19. N days from date \n"
        		+ "20. N weeks from date \n"
        		+ "21. N years from date \n"
        		+ "22. N weeks from date \n"
        		);
        int option = sc.nextInt();
        AboutDay ab = new AboutDay();
        AddToDate atd = new AddToDate();
        String date;
        LocalDate ld;
        int t;
        
        switch(option){
        case 1: 
        	System.out.println("Enter date (yyyy-mm-dd) : ");
        	date = sc.next();
        	ld = LocalDate.parse(date);
        	System.out.println(ab.getDay(ld));
        case 2: 
        	System.out.println("Enter date (yyyy-mm-dd) : ");
        	date = sc.next();
        	ld = LocalDate.parse(date);
        	System.out.println(ab.getWeek(ld));
        case 3:
        	System.out.println("Enter date (yyyy-mm-dd) : ");
        	date = sc.next();
        	System.out.println("Enter number of years");
        	t = Integer.parseInt(sc.next());
        	ld = LocalDate.parse(date);
        	System.out.println(atd.addYearsToDate(ld,t));
        case 4:
        	System.out.println("Enter date (yyyy-mm-dd) : ");
        	date = sc.next();
        	System.out.println("Enter number of years");
        	t = Integer.parseInt(sc.next());
        	ld = LocalDate.parse(date);
        	System.out.println(atd.addYearsToDate(ld,t));
        }
        
        
    }
}