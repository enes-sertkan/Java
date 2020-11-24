package day08ternaryoperator;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		  Type java code by using if-else if() statement,  
		  If age is less than 13 output will be “Should not work”, 
		  If age is greater than 65 output will be “Retired”, 
		  Otherwise; output will be “Should work”
		*/ 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		String gender = scan.next();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if (gender.equalsIgnoreCase("male")) {
			if (age<13) {
				System.out.println("Should not work");
			}
		}else if (gender.equalsIgnoreCase("male")) {
			if (age>65) {
				System.out.println("Retired");
			}
		}else {
			System.out.println("Should work");
		}
		
		scan.close();
	}

}
