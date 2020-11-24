package day16constructorsdt;

public class Constructors01 {
	
	//When you create a constructor Java deletes the default one
		Constructors01(){
			
		}
		
		//Create a constructor which has 1 parameter
		Constructors01(int price){
			
		}
		
		//Create a constructor which has 2 parameters
		Constructors01(boolean b, char ch){
			
		}
		
		//Create a constructor which has 2 parameters
	    Constructors01(char ch, boolean b){
			
		}


	public static void main(String[] args) {
		
		
		/*
		  1) Constructors are used to create objects from classes
		  
		  2) Constructors are not method because
		     a) Constructors do not have return type
		     b) Constructors names's starts with upper case
		     
		  3) Constructor's name must be same with class name,
		     but methods' name may be same or different from the clas name
		     
		  4) Constructors should be inside the body
		  
		  5) Constructors should be inside the class body
		  
		  5) When you create a class, Java will create a constructor for that class.
		     The constructor is behind the class, it is invisible inside the class.
		     The constructor which Java created is called "default constructor"
		     the variables inside the constructor/method parentheses are called "parameters"
		     Default constructors do not have any "parameters". 
		     Inside the constructor parentheses there is no any parentheses.
		     
		  6) When you create any constructor Java deletes the default one.
		*/
		
		//               To create an object
		//class name        object name     new keyword    class name  with parentheses
		  Constructors01        obj     =      new         Constructors01();

		  
	}

	public void add(int num1, String str, boolean b) {
		
	}
}
