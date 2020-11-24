package mentoringsessions;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {

	public static void main(String[] args) {
		//Write a Java program to calculate your age
		
		// date of birth
		LocalDate pdate = LocalDate.of(2001, 05, 04);
		
		// current date
		LocalDate now = LocalDate.of(2020, 9, 7);
		
		Period diff = Period.between(pdate, now);
		
		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
                diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
