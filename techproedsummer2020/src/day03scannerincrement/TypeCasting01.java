package day03scannerincrement;

public class TypeCasting01 {

	public static void main(String[] args) {
		//byte < short < int < long < float < double
		
		//AutoWudening: To convert small data type to large data type.
		//Converting small to large is easy, because of that Java can do it
		//automatically
		byte num1 = 112;
		short num2 = num1;
		
		int num3 = 2345;
		double num4 = num3;
		
		//byte < short < int < long < float < double
		
		
		
		//Explicit Narrowing: if you convert large data to small
		//You have to type the name of the small data type before the
		//variable name
		long num5 = 657;
		short num6 = (short) num5;
		
		double num7 = 12.56;
		float num8 = (float) num7;
		
		//example
		short num9 = 255;
		byte num10 = (byte) num9;
		System.out.println(num10); 
	}

} 
