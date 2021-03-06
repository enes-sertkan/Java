package day24varargsaccessmodifiersstringbuilderdt;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 Sometimes we need flexible number of parameters
		 If you use varargs as a parameter in a method, you method runs for 
		 every number of arguments
		 To create a varargs use "..." after the data type. The syntax is like "int... x"
		 Varargs is actually an array because of that in varargs we use Array methods
		 Varargs is like a bottomless pit, you can put infinitely many number of elements
		 into it, there is no any limit. 
		 If you want do not put any element into a varargs, it is fine because empty
		 array is fine
		 
		 Rule 1: If you use varargs in a method it must be the last parameter.
		         If you use varargs at the beginning or in the middle you will get
		         Compile Time Error
		 Rule 2: If you use more than 1 varargs in a methdo as a parameter you will
		         get Compile Time Error.        
		*/
		add();
		add(2);
		add(2, 3);
		add(2, 3, 4);
		add(2, 3, 4, 5, 6, 7, 8, 9);
		
		combine('a', 'l', 'i');

	}
	
	public static void add (int... x) {
		int sum = 0;
		for(int w : x) {
			sum = sum +w;
		}
		System.out.println(sum);
	}

//	 Create a method 
//	 The method will accept the characters and return the characters after joining
//	 The method should run for every number of characters
//	 For example; a, l, i ==> ali
	
	public static void combine (char... y) {
		char sum = 0;
		for (char w : y) {
			System.out.print(w);
		}
		
		System.out.println();
	}
	
	public static void test (int i, short j, double... k) {
		
	}

}
