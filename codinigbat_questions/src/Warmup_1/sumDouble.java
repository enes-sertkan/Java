package Warmup_1;

public class sumDouble {
	
	public static void main(String[] args) {
//		Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//				diff21(19) → 2
//				diff21(10) → 11
//				diff21(21) → 0
	}

	public int sumDouble(int a, int b) {
		   // Store the sum in a local variable
		   int sum = a + b;
		   
		   // Double it if a and b are the same
		   if (a == b) {
		    sum = sum * 2;
		   }
		  
		   return sum;
		}
}
