package day27inheritancedt;

public class Insect extends Animal{

	boolean poisonous = true;
	
	public static void main(String[] args) {
		
		Insect insect = new Insect();
		System.out.println("Can a insects breathe? " + insect.breathe);
		System.out.println("Are insects poisonous? " + insect.poisonous);
		
		insect.drink();
		insect.eat();
		insect.move();
		insect.invisible();
	}

	public void invisible() {
		System.out.println("Some insects are invisible");
	}
}
