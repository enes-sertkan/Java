package homework;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		float pi = 3.12159f;
		float radius = scan.nextFloat();
		System.out.println("Area: " + (pi * radius * radius));
		System.out.println("Perimeter" + (2 * pi * radius));
		scan.close();
	}
    
}