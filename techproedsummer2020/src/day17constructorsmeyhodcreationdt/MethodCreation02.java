package day17constructorsmeyhodcreationdt;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		/*
		  Create a method outside of the main method
          Ask user to enter two numbers
          Ask user which operation he wants to do
          Print the result after doing the operation which user asked
          Call the method from inside the main method
		*/
		simpleCalculator();
	}
	
    public static void simpleCalculator() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter 2 numbers");
    	double n1 = scan.nextDouble();
    	double n2 = scan.nextDouble();
    	System.out.println("Select an operation among +, -, *, /");
    	char ch = scan.next().charAt(0);
    	
    	switch(ch) {
    	    case '+':
    	    	System.out.println("The sum is = " + (n1+n2));
    	    	break;
    	    case'-':
    	    	System.out.println("The subtraction is = " + (n1-n2));
    	    case '*':
    	    	System.out.println("The multiplication is = " + (n1*n2));
    	    case '/':
    	    	System.out.println("The division is = " + (n1/n2));
    	    default:
    	    	System.out.println("Select an operation among +, -, *, /");
    	    	
    	}
    	scan.close();
    }

}
