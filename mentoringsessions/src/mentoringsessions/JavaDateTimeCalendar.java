package mentoringsessions;

import java.time.LocalDate;
import java.time.Month;

public class JavaDateTimeCalendar {

	public static void main(String[] args) {
//		Write a Java program to to get the information of current/given month.
//
//		Sample format :
//
//		Integer value of the current month: 2                                                                         
//		Length of the month: 28                                                                                       
//		Maximum length of the month: 29                                                                               
//		First month of the Quarter: JANUARY
		
		LocalDate ldt = LocalDate.of(2020, Month.SEPTEMBER, 6);
		Month mn = ldt.getMonth(); // FEBRUARY
		int mnIntValue = mn.getValue(); //9
		int minLength = mn.minLength(); //30
		int maxLength = mn.maxLength(); //30
		Month firstMonthQuarter = mn.firstMonthOfQuarter(); //January
		System.out.println("\nInteger value of the current month: " + mnIntValue);
		System.out.println("Length of the month: " + minLength);
		System.out.println("Maximum length of the month: " + maxLength);
		System.out.println("First month of the Quarter: " + firstMonthQuarter + "\n");

	}

}
