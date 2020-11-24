package day15dowhileloopdt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
//       Ask user ta enter his/her first name, last name and Social Security Number.
//		 Then type a program which makes
		
//		 a)initials of the first name and the last name in uppercase,
//		 other characters will be in lowercase.
		
//   	 b)all characters except last 4 characters of the Social Security Number “ * ”.
//		 For example; Suleyman Alptekin *****5678
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.next();
		
		System.out.println("Enter your last name");
		String lastName = scan.next();
		
		System.out.println("Enter your SSN");
		String ssn = scan.next();
		
		String initialFirstName = firstName.substring(0, 1).toUpperCase();
		String othersInFirstName = firstName.substring(1).toLowerCase();
		String correctedFirstName = initialFirstName + othersInFirstName;
		
		String initialLastName = lastName.substring(0, 1).toUpperCase();
		String othersInLastName = lastName.substring(1).toLowerCase();
		String correctedLastName = initialLastName + othersInLastName;
		System.out.println(correctedFirstName + " " + correctedLastName);
		
		String asterix = "*****";
		String lastFourDigits = ssn.substring(5);
		String correctedSsn = asterix + lastFourDigits;
		System.out.println(correctedSsn);

		scan.close();
	}

}
