package day27inheritancedt;

public class Dog extends Mammal{

	String loyal = "They are loyal";
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("Can a dog breathe? " + dog.breathe);
		System.out.println("Are dogs loyal? " + dog.loyal);
		System.out.println("Can a dog smell " + dog.smell);
		System.out.println("They die one day " + dog.die);
		//I am able to use static "die" variable but it is not
		//because of the inheritance, it is because of the being 
		//static
		
		dog.drink();
		dog.eat();
		dog.bark();
		dog.feed();
		dog.move();

	}

	public void bark() {
		System.out.println("They bark");
	}
}
