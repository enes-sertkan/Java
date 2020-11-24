package day20arraysdt;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodSplit {

	public static void main(String[] args) {
		// How to split a String by using a character/characters
        String s = "I like to move it move it";
        String t[] = s.split("move");
        //If you use "move" to split, "move" will disappear from the String
        System.out.println(Arrays.toString(t));//[I like to , it , it]
        
        //How to count the number of words in a String
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  string");
        String w = scan.nextLine();
        
        String y[] = w.split(" ");
        System.out.println(Arrays.toString(y));
        System.out.println(y.length);
	}

}
