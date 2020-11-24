package day23passbyvaluedatedt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DayTime02 {

	public static void main(String[] args) {
		// How to update date format ==> 2020-06-30 --> 2020/06/20 --> 30-06-2020 --> 06$30$20
		LocalDate date = LocalDate.now();
		System.out.println(date);//2020-06-30
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dtf.format(date));//30/06/20
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		System.out.println(dtf1.format(date));//30/Jun/20
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
		System.out.println(dtf2.format(date.plusMonths(2)));//30/August/20
        
        //How to update time format
		LocalTime time = LocalTime.now();
		
		//If you use lower case "h"'s, Java uses 12 hour system(AM/PM)
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(time));//06:42
		
		//If you use lower case "H"'s, Java uses 24 hour system(no AM or PM)
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf4.format(time));//18:46
		
		//How to get local time
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
	}

}
