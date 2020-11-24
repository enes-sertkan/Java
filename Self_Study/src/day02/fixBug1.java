package day02;

public class fixBug1 {

	public static void main(String[] args) {
		float num1 = 3.23f;
		double num2 = 3.23;
		
		float num3 = 3.23F;
		double num4 = 3.23;
		
		short num5 = 255;
		byte num6 = (byte) num5;
		System.out.println(num6);
		
		int n1 = 5/2;
		System.out.println(n1);
		
		float n2 = 5f/2f;
		System.out.println(n2);
		
		double n3 = 5d/2d;
		System.out.println(n3);

	}

}
