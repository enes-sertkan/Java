package day08ternaryoperator;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		  Type java code by using ternary and if-else, 
		  ask user to enter an integer, if the integer is even,
          the output will be “The integer is even”. 
          If the integer is odd, the output will be “The integer is odd”.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		//1. Way: if-else
		if (a%2==0) {
			System.out.println("Integer is even");
		}else {
			System.out.println("Integer is odd");
		}
		
		//2. Way: Ternary
		String result = a%2==0 ? "Integrer is even" : "Integer is odd";
		System.out.println(result);
		
		//Alternative way 1
		System.out.println(a%2==0 ? "Integrer is even" : "Integer is odd");
		
	    scan.close();
		
	}

}
