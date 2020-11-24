package day08ternaryoperator;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		  Type java code by using ternary. 
		  Take values of length and width of a rectangle 
		  from user and check if it is square or not.
		*/
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		String result = x==y ? "Square" : "Rectangle";
		System.out.println(result);
		
		scan.close();
	}

}
