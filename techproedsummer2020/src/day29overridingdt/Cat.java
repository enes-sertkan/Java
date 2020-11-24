package day29overridingdt;

public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*The overriding methods(methods inside the child class) cannot use 
	 more restricted access modifiers than overridden(methods inside the parent class) methods.
	 The access modifiers of overriding methods can be same with or wider than overridden methods.
	 For example; if overridden method's access modifier is "default" then overridingn method's access modifier 
	 can be "default", "protected", and "public"
	 */
	
	/*
	  The return type of overriding methods(methods inside the child class) must be 
	 1) same with the return type of overridden(methods inside the parent class) methods
	 2) the child of the return type of overridden(methods inside the parent class) methods
	*/
	
	/*
	 If the return type of overridden method is primitive then
	 the return type of overriding method must be same with the
	 return type of overridden method. Because there must be 
	 "IS-A" relationship between the return type in overriding
	 and "IS-A" relationship can be between the classes but primitives
	 are not classes so we cannot talk about "IS-A" relationship between 
	 primitives. 
	*/
	
	public void sound () {
		System.out.println("Cats meow");
	}

	@Override
	public void eat() {
		System.out.println("Eat fish");
	}

	@Override
	public Animal drink() {
		// TODO Auto-generated method stub
		return super.drink();
	}
	
	@Override
	public int add() {
		return 5;
	}

	@Override
	void m2() {
		
	}

	
}
