package day08ternaryoperator;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. If the String has 2 characters, 
		 output will be  “It is valid for state abbreviations” Otherwise, 
		 output will be “It is not valid for state abbreviations”
		 */
         
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two characters");
		String letter = scan.next().toUpperCase();
		System.out.println(letter);
		
		String result = letter.length()==2 ? "Valid for state abbreviations" : "Not valid for abbreviations";
		System.out.println(result);
		
		scan.close();
	}

}
