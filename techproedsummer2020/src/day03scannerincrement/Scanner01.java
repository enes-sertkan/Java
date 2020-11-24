package day03scannerincrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		//How to get string from user
		
		//Instead of "red underline" tell "Java/it is complaining" or
		//"Compile Time Error"
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, give me your full name");
		//If you use next(), Java will return just the first word in the string
		//If you use nextLine(), Java will return all String 
        String fullName = scan.nextLine();
        System.out.println(fullName);
        scan.close();
	}

}