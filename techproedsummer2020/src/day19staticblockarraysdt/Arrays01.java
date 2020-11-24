package day19staticblockarraysdt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// How to create an array
		
		int arr[] = new int[4];
		
		//How to print array on the console
		arr[0] = 11;
		System.out.println(Arrays.toString(arr));
		arr[3] = 14;
		System.out.println(Arrays.toString(arr));
		arr[1] = 12;
		System.out.println(Arrays.toString(arr));
		arr[2] = 13;
		System.out.println(Arrays.toString(arr));
		
		// How to get the number of elements in an array
		
		System.out.println(arr.length);
		// In strings when we use length we need parentheses but in array no need for parentheses
		
		//how to create array in a short way
		int brr[] = {21, 22, 23, 24};
		System.out.println(Arrays.toString(brr));
		
		//What happens if you try to use a non-existing index in an array?
		//Answers: you do not get a Compile Time Error
		//         you get Run Time Error ==> ArrayIndexOutOfBoundsException
		//brr[4]=25
		
		//How to print specific element on the console
		System.out.println(brr[1]);
		System.out.println(brr[0]);
		System.out.println(brr[2]);
		System.out.println(brr[3]);
		
		//How to print all elements by using loop on the console
		//If you use some specific numbers in your code it means you are hard-coding
		//It is not good. Try to make your code dynamic by using like brr.length
		for(int i=0; i<=brr.length-1; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
