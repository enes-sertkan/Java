package day_07;

public class MyFreindsCar extends Vehicle{
	
//  Now complete the task:
//  Create a class MyFriendsCar and extend Vehicle
//  create 1 int variable :price and assign a value
//  Then create a method :selling() and print This car is for sale and price is price
//  and print assign and print all of the information of the car
	
	int price =  12000;
	public void selling() {
		System.out.println("This car is for sale and the price is " + price);
	}
	
	public static void main(String[] args) {
		MyFreindsCar mfc = new MyFreindsCar();
		
		mfc.model = "BMW";
		mfc.year = 2017;
		mfc.mileage = 1200;
		
		System.out.println(mfc.price
				+ "\n" + mfc.model
				+ "\n" + mfc.year
				+ "\n" + mfc.mileage);
		mfc.selling();
		mfc.drive();
		mfc.oilChange();

	}

}
