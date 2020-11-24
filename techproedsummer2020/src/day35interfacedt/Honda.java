package day35interfacedt;

public class Honda implements Gas, AirCondition {

	/*
	   1) When you make a concrete class child of an interface use "implements"
	   keyword instead of "extends".
	   
	   2) In parent interfaces you can use variables whose names are same
	   when you call the variables you have to use interface names
	   otherwise you will get CTE
	 */
	public static void main(String[] args) {
		Honda hondaCar = new Honda();
		hondaCar.seat();
		hondaCar.cold();
		hondaCar.refresh();
		hondaCar.speed();
		hondaCar.power();
        hondaCar.eco();
        
        System.out.println(Gas.price);//1
        System.out.println(Engine.price);//3
        System.out.println(AirCondition.price);//2
	}
	
	@Override
	public void eco() {
		System.out.println("Eco Car");
		
	}

	public void seat() {
		System.out.println("leather seats");
	}

	@Override
	public void cold() {
		System.out.println("Cools well");

	}

	@Override
	public void refresh() {
		System.out.println("A good refresher");

	}

	@Override
	public void speed() {
		System.out.println("A speedy car");

	}

	@Override
	public void power() {
		System.out.println("Has good horsepower");

	}
}
