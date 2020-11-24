package day13wrapperscopewhiledt;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
//	    Ask user to enter a letter, if it is upper case 
//		check it is before “F” or not in alphabetical order.
//		If it is before “F” in alphabetical order output will be 
//		“ Big before F”, otherwise output will be
//		“Big after F.” If it is lower case check it is before 
//		“h” or not in alphabetical order.
//		If it is before “h” in alphabetical order output will be 
//		“Small before h”, otherwise “Small after h”
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char ch = scan.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			if(ch<'F') {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after or on F");
			}		
		}else if(ch>='a' && ch<='z') {
			if(ch<'h') {
				System.out.println("Small before h");
			}else {
				System.out.println("Small after or on h");
			}		
		}else {
			System.out.println("I told you enter a letter what are you doing?");
		}
		
		scan.close();
	
	}

}
