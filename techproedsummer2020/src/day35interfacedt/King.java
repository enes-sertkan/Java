package day35interfacedt;

public abstract class King extends Hotel{

	public static void main(String[] args) {

	}

	@Override
	public void breakfast() {
		System.out.println("Breakfast for kings");
	}

	@Override
	public void cleaning() {
		System.out.println("Clean the room for kings");
	}

	public void tea() {
		System.out.println("Twice a day");
	}

}
