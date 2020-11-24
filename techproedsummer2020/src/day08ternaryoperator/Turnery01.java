package day08ternaryoperator;

import java.util.Scanner;

public class Turnery01 {

	public static void main(String[] args) {
		/*
		  Ask user to enter an integer
		  If the integer is greater then 10 print "Good" on the console
		  Otherwise, print "Bad" on the console 
		*/
		
		//1. Way: Use if-else statement to solve
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Print an integer");
		int a = scan.nextInt();
		
		if (a>10) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		
		//2. Way: Use Ternary Operator to solve
		String result = a>10 ? "Good" : "Bad";
		System.out.println(result);

		scan.close();
	}

}
