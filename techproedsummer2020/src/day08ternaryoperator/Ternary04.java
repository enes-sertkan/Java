package day08ternaryoperator;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. If the String has 2 characters, 
		 output will be  “It is valid for state abbreviations” Otherwise, 
		 output will be “It is not valid for state abbreviations”
		*/
		
		//To get the number of the characters in a string we will use length() method
		String name = "Jonathan Anderson";
		System.out.println(name.length());//8
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two characters");
		String str = scan.nextLine().toUpperCase();
		System.out.println(str);//str will always print upper case on the console
		
		String result = str.length()==2 ? "Valid for state abbreviations" : "Not valid for abbreviations";
		System.out.println(result);

		scan.close();
	}

}
