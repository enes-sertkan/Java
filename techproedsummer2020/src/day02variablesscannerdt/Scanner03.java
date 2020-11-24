package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and perimeter
		 of a square whose side length is entered by user
		 Hint 1: Area of a square is length x length
		 Hint 2: Perimeter of a square is 4 x length
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a numbers");
		
		double length = scan.nextDouble();
		System.out.println("Perimeter: " + (length * 4));
		System.out.println("Area: " + (length * length));
		scan.close();

	}

}
