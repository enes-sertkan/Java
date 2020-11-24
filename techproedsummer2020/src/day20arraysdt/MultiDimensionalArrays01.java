package day20arraysdt;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// If the elements of an Array are Arrays then
		// the Arrays are called multidimensional array.
		
		// How to create a multidimensional array
		int mda[][] = new int[3][2] ;
        
		//How to print a multidimensional array on the console
		System.out.println(Arrays.deepToString(mda));
		
		//How to add elements into a multidimensional array
		mda[0][0] = 5;
		System.out.println(Arrays.deepToString(mda));
		
		mda[1][0] = 7;
		System.out.println(Arrays.deepToString(mda));
		
		mda[2][1] = 11;
		System.out.println(Arrays.deepToString(mda));
		
		mda[0][1] = 6;
		mda[1][1] = 8;
		mda[2][0] = 9;
		System.out.println(Arrays.deepToString(mda));
		
		//How to print an element of outer array
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		//How to print the elements of inner array 1 by 1
		System.out.println(mda[0][1]);
		System.out.println(mda[2][1]);
		
		//How to create a multidimensional array in short way
		int mda1[][] = {{3, 4, 5}, {6}, {7, 8}};
		System.out.println(Arrays.deepToString(mda1));
		
	}

}
