package day06ifelsestatementdt;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		   Type java code by using if-else if() statement,
		   A school has following rules for grading system:
		   1. Below 50-D, 2. 50 to 60-C, 3. 60 to 80-B, 4. Above 80-A
		   Ask user to enter marks and print the corresponding graded. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the marks");
		int mark = scan.nextInt();
		
		if (mark>=0 && mark<50) {
			System.out.println("D");
			
		}else if (mark>=50 && mark<60) {
			System.out.println("C");
		}else if (mark>=60 && mark<80) {
			System.out.println("B");
		}else if (mark>=80 && mark<=100) {
			System.out.println("A");
		}else {
			System.out.println("Enter marks from 0 to 100 only");
		}
        
		scan.close();
	}

}
