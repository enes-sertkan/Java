package day_07;

public class MyCar extends Vehicle{

/*
	2. Create another class: MyCar and extend Vehicle
	create variables and methods: 
	int maxSpeed; 
	cod method doUber
	Collapse
*/

	// Vehicle = Parent of MyCar class 
	// why do we need inheritance in Java
	// Reusability : Whatever inside Vehicle is inside MyCar
	// Attention : We cannotreach the objects in the child class
	
	int maxSpeed;
	public void doUber() {
		
	}
	
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		
		
		myCar.maxSpeed=120;
		myCar.model = "L.Aventador";
		myCar.doUber();
		myCar.year = 2020;
		myCar.mileage = 0;
		
		System.out.println("Max speed : " + myCar.maxSpeed 
				+ "\nMy car model : " + myCar.model 
				+ "\nMy car year : " + myCar.year 
				+ "\nMy car mileage : " + myCar.mileage);

	}
	
}
