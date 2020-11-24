package mentoringsessions;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDateDuration {
	
	public static void main(String[] args) {
		
//		Write a Java program to define a period of time using date-based values (Period) 
//		and a duration of time using time-based values (Duration).
		
		Period fromDays = Period.ofDays(120);
        System.out.println("Period from days: " + fromDays);

        Period periodFromUnits = Period.of(2000, 11, 24);
        System.out.println("Period from units: " + periodFromUnits);

        LocalDate localDate = LocalDate.now();
        Period periodFromLocalDate = Period.of(localDate.getYear(),
                localDate.getMonthValue(), localDate.getDayOfMonth());
        System.out.println("Period from LocalDate: " + periodFromLocalDate);

        Period periodFromString = Period.parse("P2020Y9M7D");
        System.out.println("Period from String: " + periodFromString);

        LocalDate startLocalDate = LocalDate.of(2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2020, 9, 7);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println("\nBetween " + startLocalDate + " and "
                + endLocalDate + " there are " + periodBetween.getYears() + " year(s)");
        System.out.println("Between " + startLocalDate + " and "
                + endLocalDate + " there are " + periodBetween.getMonths() + " month(s)");
        System.out.println("Between " + startLocalDate + " and "
                + endLocalDate + " there are " + periodBetween.getDays() + " days(s)");

        System.out.println("Expressed as y:m:d: " + periodToYMD(periodBetween));

        System.out.println(startLocalDate + " is after "
                + endLocalDate + " ? " + periodBetween.isNegative());

        Period periodBetweenPlus1Year = periodBetween.plusYears(1L);
        System.out.println("\n" + periodBetween + " has " + periodBetween.getYears() + " year,"
                + " after adding one year it has " + periodBetweenPlus1Year.getYears());

        Period p1 = Period.ofDays(5);
        Period p2 = Period.ofDays(20);
        Period p1p2 = p1.plus(p2);
        System.out.println(p1 + "+" + p2 + "=" + p1p2);
    }

    private static String periodToYMD(Period period) {

        if (period == null) {
            // or throw IllegalArgumentException
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(period.getYears())
                .append("y:")
                .append(period.getMonths())
                .append("m:")
                .append(period.getDays())
                .append("d");

        return sb.toString();
	}

}
