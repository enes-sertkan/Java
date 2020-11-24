package day02;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put any symbol to draw a triangle");
		String draw = scan.nextLine();
		
		System.out.println("  " + draw);
		System.out.println(" " + draw + " " + draw);
		System.out.println(draw + " " + draw + " " + draw);

	}

}
