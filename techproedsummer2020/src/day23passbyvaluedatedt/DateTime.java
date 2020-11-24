package day23passbyvaluedatedt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		// How to get current date
		System.out.println(LocalDate. now());
		
		//How to get future dates
		LocalDate date1 = LocalDate.now();
        System.out.println(date1.plusDays(5));
        System.out.println(date1.plusMonths(4));
        System.out.println(date1.plusYears(3));
        
        //How to get dates from past
        System.out.println(date1.minusDays(7));
        System.out.println(date1.minusMonths(2));
        System.out.println(date1.minusYears(5));
        
        //How to get current time
        System.out.println(LocalTime.now());
        
        //How to get future times
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.plusSeconds(5));
        System.out.println(time1.plusMinutes(2));
        System.out.println(time1.plusHours(4));
        
        //How to get time from past
        System.out.println(time1);
        System.out.println(time1.minusSeconds(5));
        System.out.println(time1.minusMinutes(2));
        System.out.println(time1.minusHours(4));
        
        //How to get date and time together
        System.out.println(LocalDateTime.now());
	}

}
