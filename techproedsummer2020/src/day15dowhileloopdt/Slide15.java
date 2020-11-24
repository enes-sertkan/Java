package day15dowhileloopdt;

import java.util.Scanner;

public class Slide15 {

	public static void main(String[] args) {
		//1) Write a program to print numbers from 1 to 5 on the console by using do-while loop
		
		int i = 1;
		do {
			if(i>=i) {
				System.out.print(i + " ");
			}
			i++;
		}while(i<=5);

		System.out.println();
		
		//2) Write a program to print numbers from 10 to 3 on the console by using do-while loop.
		
		int o = 10;
		do {
			if (o<=10) {
				System.out.print(o + " ");
			}
			o--;
		}while (o>=3);
		
		System.out.println();
		
		//3) Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
		//by using do-while loop
		
		int x = 2;
		do {
			if(x%5==0) {
				System.out.print(x + " ");
			}
			x++;
		}while(x<100);
		
		System.out.println();
		
		//4) Write a program to print letters from c to m on the console by using do-while loop.
		
		char letters = 'c';
		do {
			System.out.print(letters + " ");
			letters++;
		}while (letters<='m');
		
		System.out.println();
		
		//5) Ask user to enter a number.
		//If the number is divisible by 10 then print "Won!" on the console
		//otherwise ask user to enter another number.
		//Use do-while loop.
		
		Scanner scan = new Scanner(System.in);
		int y = 0;
		do {
			System.out.println("Enter a number");
            y = scan.nextInt();
		}while (y%10!=0);
		System.out.println("Won!");
		
		
		//6) Ask user to enter a name.
		//If the name contains the letter ‘a’ then print "Won!" on the console
		//otherwise ask user to enter another name.
		//Use do-while loop.
		
		String name = "";
		do {
			System.out.println("Enter your name");
			name = scan.next();
		}while(!name.toUpperCase().contains("A"));
		System.out.println("You Won!");
		
		//7)Ask user to enter a String
		//Print the characters whose indexes are odd on the console
		//For example; Germany ==> e m n
		
		System.out.println("Enter a word");
		String chr = scan.next();
		int ch = 0;
		int lng = chr.length();
		
		do {
			if (ch%2!=0) {
				System.out.print("Index " + ch + " = " + chr.toUpperCase().charAt(ch) + ", ");
				
			}
			ch++;
		}while (ch<lng);
		
		
		scan.close();
	}

}
