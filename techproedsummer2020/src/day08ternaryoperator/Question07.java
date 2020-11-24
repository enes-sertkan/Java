package day08ternaryoperator;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		  Ask user to enter an integer. 
		  If the number has 3 digits, 
		  output will be  “This number has 3 digits” Otherwise, 
		  output will be “This number has no 3 digits” 
		  How can you decide the number of digits of an integer?
		*/
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scan.nextInt();
		
		String result = x>=100 ? "This number has three digits" : "This number has no three digits";
		System.out.println(result);
			
		scan.close();
	}

}
