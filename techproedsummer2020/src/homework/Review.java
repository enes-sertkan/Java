package homework;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		//Question 1 and 2 done Create a class whose name is â€œReviewâ€? Create main method
		
		//Question 3 Create a program to print all primitive data types on the console
		//boolean, char, byte, short, int, long, float, and double
		System.out.println("boolean, char, byte, short, int, long, float, and double");
		
		//Question 4 Create two integer variables their names are num1 and num2  and output should be â€œThe sum of the numbers : The sum of num1 and num2"
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter num1 and num2 to get their sum");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1 + num2);
		
		//Question 5 Create char variables to print your ï¬?rst name on the console
		
		//Question 7
		
		/*
		 1. Primitive data types contain boolean, char, byte, short, int, long,
		    float and double
		    Non Primitive data types contain string
		 2. Java uses CamelCase as a practice for writing names of methods, 
		    variables, classes, packages and constants. 
		 3. Paranthesis
		 4. Object Oriented programming is a programming style which is associated
		    with the concepts like class, object, etc.
		    An object-based application in Java is based on declaring classes, 
		    creating objects from them and interacting between these objects.
		    An object-based application in Java is based on declaring classes,
		    creating objects from them and interacting between these objects.
		 */	    
        scan.close();
	}

}
