package day08ternaryoperator;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		  Type Java code by using if-else and Ternary.
		  Ask user to enter two integers
		  Write a program to print the minimum one on the console
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter a another number");
		int b = scan.nextInt();
		
		if (a<=b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		//Ternary
		int result = a<=b ? a : b;
		System.out.println(result);
		
		scan.close();
	}

}
