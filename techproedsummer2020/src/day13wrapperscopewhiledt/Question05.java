package day13wrapperscopewhiledt;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		//Type java code by using while loop,
		//Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number.
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int i = scan.nextInt();
        
        while(i>0) {
        	System.out.println(i + "=" + (i*i));
        	i = i*i;
        }
	}

}
