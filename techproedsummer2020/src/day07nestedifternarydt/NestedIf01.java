package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter gender and age.
		 If the gender is "male" and the age is less than 20 print "boy"
		 otherwise print "man" on the console
		 Ask user to enter gender and age.
		 If the gender is "female" and the age is less than 20 print "girl"
		 otherwise print "woman" on the console
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your gender");
		//If you want to convert all characters in String to lowercase use toLowercase()
		String gender = scan.next();
		System.out.println("Please, enter your age");
		int age = scan.nextInt();
		
		//equalsIgnoreCase will work in almost every case, it is a method to compare 
		//Strings
		if(gender.equalsIgnoreCase("male")) {
			if(age<20) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");
			}
		}else if (gender.equalsIgnoreCase("female")) {
			if(age<20) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
			}
		}else {
			System.out.println("Undefined Gender");
		}
		
		scan.close();

	}

}
