package day33exceptionsdt;

public class E02 {

	/*
	  Create a getAge() method
	  for negative ages throw exceptions
	*/
	public static void main(String[] args) {
		
		try {
			
			getAge(-12);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println(e.getMessage()); 
			
		}
	}
	
	public static void getAge(int age) {
		
		if(age<0) {
			throw new IllegalArgumentException("Do not use negative values");
		}else {
			System.out.println(age);
		}
	}

}
