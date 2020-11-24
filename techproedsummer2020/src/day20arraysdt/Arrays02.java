package day20arraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// How to check if two arrays are equal to each other
		// If same elements have same indexes then the Arrays are
		// equal to each other
		// If Arrays different elements they cannot be equal to each other
		// In the following example arr1 is equal to arr2, but ar3 is different
		int arr1[] = {2, 7, 6};
		int arr2[] = {2, 7, 6};
		int arr3[] = {6, 2, 7};
		
		//1. Way: using loops to check equality
		int count = 0;
        for(int i=0; i<arr1.length; i++) {
        	if (arr1[i]==arr2[i]) {
        		count++;
        	}
        }
        if(count==arr1.length) {
        	System.out.println("Arrays are same");
        }else {
        	System.out.println("Arrays are not same");
        }
        
        //2. Way: Use equals()  in Array class to check equality
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
	}

}
