package day01;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		boolean x = true;
		System.out.println(x);
		char y = 'a';
		System.out.println(y);
		byte z = 127;
		System.out.println(z);
		short a = 12744;
		System.out.println(a);
		int b = 123456;
		System.out.println(b);
		long c = 189743445;
		System.out.println(c);
		double d = 2.2424582;
		System.out.println(d);
		float e = 2.2543f;
		System.out.println(e);
		
		int num1 = 5;
		int num2 = 6;
		System.out.println("\nThe sum of the numbers : The sum of num1 and num2 = " + (num1 + num2));
		
		char one = 'S';
		char two = 'a';
		char three = 'm';
		System.out.println("\n" + one + two + three);
		
		long max = Long.MAX_VALUE;
		long min = Long.MIN_VALUE;
		System.out.println("\nMax value of long : " + max);
		System.out.println("Min value of long : " + min);
		
		//Primitive data types contain 8 data types that is stored in 
		//the stack memory, and only contains values.
		//Non-primitive data type only contains the string which is mostly
		//stored in the heap memory.
		
		//When we write the variable names and if it contains more than
		//word we will use camelCase, must start with a lowercase word 
		//must not start with a number but can contain number in the 
		//middle or in the end, the second word must start with a capital 
		//letter and can also contain special characters like $,_
		
		//OOP mainly focuses on the object that are required to be manipulated
		//instead of logic. The approach is ideal for the programs arge and complex 
		//codes and need to be actively updated or maintained.
		//OOP language follows 4 principles: Encapsulation, Abstraction,
		//Inheritance, Polymorphism.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer less than 30");
		int num01 = scan.nextInt();
		System.out.println(num01);
		
		System.out.println("Enter an integers to get the area and perimeter of a square: ");
		int l1 = scan.nextInt();
		System.out.println(l1 * l1);
		System.out.println(4*l1);
		
		System.out.println("Enter an integers to get the cube of a number: ");
		int cube = scan.nextInt();
		System.out.println(cube*cube*cube);
		
		System.out.println("Enter an integers to get the area and perimeter of a rectangle: ");
		int length = scan.nextInt();
		int width = scan.nextInt();
		System.out.println(length * width);
		System.out.println(2*(length + width));
		
		System.out.println("Enter an integers to get the volume of a rectangular prism : ");
		int w = scan.nextInt();
		int l = scan.nextInt();
		int h = scan.nextInt();
		System.out.println("Volume : " + (w*l*h));
		
		System.out.println("Enter a value to find the area and perimeter of a circle: ");
		float r = scan.nextFloat();
		float pi = 3.14159f;
		System.out.println("Area : " + (pi*r*r));
		System.out.println("Perimeter : " + (2*pi*r));
		
		System.out.println("Enter three numbers to get the perimeter of the triangle: ");
		byte a1 = scan.nextByte();
		byte a2 = scan.nextByte();
		byte a3 = scan.nextByte();
		System.out.println(a1 + a2 + a3);
		
		System.out.println("Enter a value to convert mile to kilometer: ");
		double toKm = scan.nextDouble();
		System.out.println((1.6*toKm) + " KM");
		
		System.out.println("Enter a value to convert Hrs to Sec: ");
		long hrs = scan.nextLong();
		System.out.println("Seconds : " + (hrs*60*60)+ " Sec");
		
		
	}

}
