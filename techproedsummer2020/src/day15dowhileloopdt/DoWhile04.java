package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
   	    // Ask user to enter an integer
        // If the integer is even print on the console "You won!"
        // otherwise ask user to enter another integerTODO Auto-generated method stub
           
        Scanner scan = new Scanner(System.in);
	    
	    int i = 1;
	    do {
	    	
	    	System.out.println("Enter a number");
	    	i = scan.nextInt();
	    	
	    }while(i%3!=0);
	    
	    System.out.println("Won!");
	    
	    scan.close();
	}

}
