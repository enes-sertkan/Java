package day27inheritancedt;

public class Cat extends Mammal{

	String clean = "They are clean";
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		System.out.println("Can a cat breathe? " + cat.breathe);
		System.out.println("Are are clean? " + cat.clean);
		System.out.println("Can a cat smell " + cat.smell);
		
		cat.drink();
		cat.eat();
		cat.meow();
		cat.feed();
		cat.move();

	}

	public void meow() {
		System.out.println("They meow");
	}
	
	/*
	  From child(sub) class to parent(super) class Java calls "IS-A" relationship
	  From parent(super) class to child(sub) class Java calls "HAS-A" relationship
	*/
}
