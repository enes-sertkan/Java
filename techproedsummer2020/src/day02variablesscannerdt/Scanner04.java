package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and perimeter
		 of a rectangle whose length and width are entered by a
		 user
		 Hint 1: Area of a rectangle is width x length
		 Hint 2: Perimeter of a rectangle is 2x(width + length)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me two numbers");
		
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		System.out.println("Perimeter: " + 2*(length + width));
		System.out.println("Area: " + (length * width));
        scan.close();
	}
}
