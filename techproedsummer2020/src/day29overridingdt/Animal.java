package day29overridingdt;

public class Animal {

	public static void main(String[] args) {
		

	}

	public void sound () {
		System.out.println("Animals make sound");
	}
	
	public void eat () {
		System.out.println("Eat everything");
	}
	
	
	//In the following method : return type is animal. We can use class names as return type in methods
	//When you use return type different from "void" you have to use return keyword.
	//After the "return" keyword you must type sth whose data type is matching with the return type of t he method.
	//To create an object we can use "new" keyword and "constructor" but sometimes Java gives us different
	//ways to create an object from different class like String str = "Ali";
	
	public Animal drink( ) {
		return new Animal();
		
	}
	
	public int add () {
		return 4;
	}
	
	//If a method is "final" it means you cannot update its body
	public final void product () {
		System.out.println("Multiplication");
		
	}
	
	//Java does not allow to override static methods because
	//static methods are shared by all objects so 
	// 1) no need to override
	// 2) If class updates the body it will affect all other classes
	
    public static void division () {
		System.out.println("Division");
	}
    
    
    //You cannot override private methods from other classes so you
    //cannot override private methods.
    private void m1() {
    	System.out.println("Method 1");
    }
    
    void m2() {
    	System.out.println("");
    }
    
    
}
