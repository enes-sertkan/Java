package day04operatorsifstatementdt;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		  Type Java code by if-else statement,
		  If the password is "JavaLearner", output will be 
		  "The password is true", otherwise, output will be
		  "The password is false". 
	    */
		
	    String password = "JavaLearner";
	    
	    //== is used just for primitives, do not use == for String
	    //For String we use equals() method
	    
	    if(password.equals("JavaLearner")) {
	    	System.out.println("The password is true");
	    }
	    
	    if(!(password.equals("JavaLearner"))) {
	    	System.out.println("The password is false");
	    }
		
	}

}
