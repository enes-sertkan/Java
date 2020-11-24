package day06ifelsestatementdt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// Ask user to enter an integer
		//If the number is greater than 0 print "Positive" on the console
		// If the number is less than 0 print "Negative" on the console
		//If the number is equal to 0 print "Neutral" on the console
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer");
        
        int a = scan.nextInt();
        
        if (a>0) {
        	System.out.println("Positive");
        }else if (a<0) {
        	System.out.println("Negative");
        // No need for 'else if' statement, but you may do it
        }else {
        	System.out.println("Neutral");
        }
        
        if (a>0) {
        	System.out.println("Positive");
        }else if (a<0) {
        	System.out.println("Negative");
        // No need for 'else if' statement, but you may do it
        }else if (a==0) {
        	System.out.println("Neutral");
        }
        scan.close();
        
	}

}
