package day02;

public class Concatenation01 {

	public static void main(String[] args) {
		//19
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		System.out.println(str1 + " " + str2);
		System.out.println((numA + numB) + " " + str1);
		System.out.println(str2 + (numA + "" + numB));
		System.out.println(str2 + (numB - numA));
		
		//20
		System.out.println((numA*numB) + "" + (numB - numA) + " " + str1 + "-" + (numB - numA));


	}

}
