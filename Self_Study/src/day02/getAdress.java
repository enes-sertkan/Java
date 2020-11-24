package day02;

import java.util.Scanner;

public class getAdress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter full name");
		String fullName = scan.nextLine();
		
		System.out.println("Please enter your adress");
		String adress = scan.nextLine();
		
		System.out.println("\n" + fullName);
		System.out.println(adress);

	}

}
