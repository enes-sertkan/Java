package day_02;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
//	    Create a class : �IfElseStatement2�
//		Print �Please enter your operation and 2 number�
//		Get one operation symbol from user
//		Print �Please enter 2 numbers�
//		Get 2 double numbers form users
//		Example
//		if Addition, 7, 4 then print here is the sum of your operation 7 + 4 = 11
//		Test data:
//		Addition 
//		Subtraction
//		Division 
//		Multiplication
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your operation");
		String operation = scan.next();
		
		System.out.println("Please enter two numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (operation.equalsIgnoreCase("addition")) {
			System.out.println(x+y);
			
		}else if (operation.equalsIgnoreCase("subtraction")) {
			System.out.println(x-y);
			
		}else if (operation.equalsIgnoreCase("division")) {
			System.out.println(x/y);
			
		}else if (operation.equalsIgnoreCase("multiplication")) {
			System.out.println(x*y);
			
		}else {
			System.out.println("enter two vaild numbers");
		}
		
		//OR
		System.out.println("Please enter 2 numbers");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		if(operation.equalsIgnoreCase("Addition")) {//addition, ADDITION, AdDITION
			System.out.println("The sum of your operation "+num1+" + "+num2+" = "+(num1+num2));
		}else if(operation.equalsIgnoreCase("Subtruction")) {
			System.out.println("The diffence of your operation "+num1+" - "+num2+" = "+(num1-num2));
		}else if(operation.equalsIgnoreCase("Division")) {
			System.out.println("The quotiant of your operation "+num1+" / "+num2+" = "+(num1/num2));
		}else if(operation.equalsIgnoreCase("Multiplication")) {
			System.out.println("The product of your operation "+num1+" * "+num2+" = "+(num1*num2));
		}else {
			System.out.println("The "+operation+" is not Valid. Try again");
		}
		
		//What is difference between equals and equalsIgnoreCase
//		String str1="Java";
//		String str2="JAVA";
//		System.out.println(str1.equals(str2));//false
//		System.out.println(str1.equalsIgnoreCase(str2));//tru

		scan.close();
	}

}
