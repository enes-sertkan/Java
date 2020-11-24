package day08ternaryoperator;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		  Type java code by using ternary and if-else. 
		  Ask user to enter two integers. 
		  Write a program to print the minimum one on the console.
		*/
         
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
				
		//if-else
		if (x>=y) {
			System.out.println(y);
		}else {
			System.out.println(x);
		}
		
		//or
		//Ternary
		int result = x>=y ? y : x ;
		System.out.println(result);
		
		scan.close();
	}

}
