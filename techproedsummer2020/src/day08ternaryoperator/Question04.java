package day08ternaryoperator;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		  Type java code by using ternary.
		  Write a program to print absolute 
		  value of an integer entered by user 
		*/
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x = scan.nextInt();
		
	    //Ternary
		//1
		int result = x>=0 ? x : x*-1;
		System.out.println(result);
		
		//2
		System.out.println(x>=0 ? x : x*-1);
	    scan.close();
	}

}
