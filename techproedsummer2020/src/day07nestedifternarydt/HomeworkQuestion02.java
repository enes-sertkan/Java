package day07nestedifternarydt;

import java.util.Scanner;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 please can you solve it ? /*Ask user to enter any name of the week, 
		 then get second ,fourth, and sixth letter of the day name and print
		 them on the console, in the same line. For example; if the user
		 enters �Monday� output will be ody
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day of the week");
		String day = scan.next();
		
		char secondLetter = day.charAt(1);
		char fourthLetter = day.charAt(3);
		char sixthLetter = day.charAt(5);
		
		System.out.println("2nd, 4th, and 6th chars: " + secondLetter + fourthLetter + sixthLetter);
		
		scan.close();
	}

}
