package day18statickeyworddt;

public class StaticKeyword01 {
	
	static int i = 12;
	
	int k = 13;

	public static void main(String[] args) {
		
		//As you see to access variable i(static), we did not create any object we used just the 
		//class name, but to access variable k()non-static we created on object otherwise 
		//Java did not show us variable k
		
		//You can access to a static variable by using class name(recommended),
		//You can access to a static variable by using object as well but it is not recommended
		
		//Static variables are common variables for every object because of that if you make
		//any update on a static variable all objects will see the update
	}

	public void increment() {
		i++;
		k++;
	}
}
