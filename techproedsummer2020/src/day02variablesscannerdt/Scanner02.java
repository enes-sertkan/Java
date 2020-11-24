package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//Get two integers from user
		//Print their sum and product on the console
		
		//1. Step
		Scanner scan = new Scanner(System.in);
        //2.step
		System.out.println("Please, enter two integers to add");
		//3. Step
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The sum: " + (num1 + num2));
		System.out.println("The product: " + (num1 * num2));
		System.out.println("The division: " + (num1 / num2));
		scan.close();
	}
}