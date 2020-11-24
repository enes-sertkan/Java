package day35interfacedt;

public class Family extends Hotel{

	public static void main(String[] args) {

	}

	@Override
	public void breakfast() {
		
	}

	@Override
	public void cleaning() {
		
	}

	@Override
	public void breakfastInBed() {
		super.breakfastInBed();
		System.out.println("Breakfast in bed is better");
	}

}
