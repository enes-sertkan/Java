package day_02;

import java.util.Scanner;

public class IfElseStatement {
//Create a class : “IfElseStatement”
//	Print “Please enter your job title”
//	create a String variable named “jobTitle” and get the data from the user
//	Use the below test data to print the correct jobTitle.
//	Example : if jobTitle is qa then print “Your job title is Qualty Analyst”
//		test data:
//		qa then print Quality Analyst
//		dev then print Developer
//		ba then print Business Analyst
//		pm then print Project Manager

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = scan.next();
		
		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Your job is Quality Analyst");
			
		}else if (jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Your job is Quality Analyst");
			
		}		else if(jobTitle.equalsIgnoreCase("ba")){
			System.out.println("Your job is Business Analyst");
			
		}else if(jobTitle.equalsIgnoreCase("pm")){
		    System.out.println("Your job is Project Manager");
		    
		}else {
			System.out.println("Please enter a valid job title");
			
		}
		
		//or
		
		String qa = "Quality Analyst";
		String dev = "Developer";
		String ba = "Bussiness Analyst";
		String pm = "Project Manager";
		
		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Your job title is " + qa);
			
		}else if (jobTitle.equalsIgnoreCase("dev")) {
			System.out.println("Your job title is " + dev);
			
		}		else if(jobTitle.equalsIgnoreCase("ba")){
			System.out.println("Your job title is " + ba);
			
		}else if(jobTitle.equalsIgnoreCase("pm")){
		    System.out.println("Your job title is " + pm);
		    
		}else {
			System.out.println("Please enter a valid job title");
			
		}
		
		scan.close();
	}
}
