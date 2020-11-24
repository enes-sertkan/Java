package day14whiledowhiledt;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		//Type java code by using while loop,
		//Write a program to count the factors of 
		//an integer which is entered by user.
        //For example; 6==> 1,2,3,6 ==> Print on the console 6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = scan.nextInt();
		
		int i = 1;
		int count = 0;
		while (i<=num) {
			if (num%i==0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		
		System.out.println();
		
		System.out.println(count);
		
        scan.close();
	}

}