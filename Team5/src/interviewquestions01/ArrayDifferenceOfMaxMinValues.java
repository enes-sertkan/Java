package interviewquestions01;

public class ArrayDifferenceOfMaxMinValues {

	/*
	  Write a method that takes an array of integers and returns the difference between 
	  the largest and smallest number. Then print the difference.
	*/
	public static void main(String[] args) {
		
		int arr[] = {4, 5, -6, 10, 2, -1};
		System.out.println(difference(arr));
	}
	
	public static int difference(int [] arr) {
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length;i++ ) {
			
			if(arr[i]>max) {
				max = arr[i];
				
			}else if(arr[i]<min) {
				min = arr[i];
			}
		
		}
		int diff = max - min;
		return diff;
	}

}
