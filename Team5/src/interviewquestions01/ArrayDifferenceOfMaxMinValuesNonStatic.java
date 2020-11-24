package interviewquestions01;

public class ArrayDifferenceOfMaxMinValuesNonStatic {

	/*
	  Write a method that takes an array of integers and returns the difference
	  between the largest and smallest number.Then print the difference.
	 */
	
	public static void main(String[] args) {
		int array[] = {4, 5, -6, 10, 2, -1};
		
		ArrayDifferenceOfMaxMinValuesNonStatic obj = new ArrayDifferenceOfMaxMinValuesNonStatic();
		//An object is created
		//This object will be used find the difference of Max and Min values.
		
		System.out.println(obj.difference(array));
		//This is to print the the difference of the Max and Min values.
		
	}
	
	//Below is to find the Max and Min values from/of the array
	public int difference(int [] arr) {
		int max = arr[0];
		int min = arr[0];
				
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
				
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		//Returning the difference
		return max-min;
	}
}
