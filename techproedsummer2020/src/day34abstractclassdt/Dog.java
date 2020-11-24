package day34abstractclassdt;

public class Dog extends Animal {

	/*
	 1)Inside a concrete class you cannot create abstract method. 
	   All methods inside a concrete class must be concrete
	 2)You have to override all abstract methods from all parents
	   not just from the first parent  
	 */
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		super.breathe();
	}

}
