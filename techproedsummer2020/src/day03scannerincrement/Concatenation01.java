package day03scannerincrement;

public class Concatenation01 {

	public static void main(String[] args) {
		//Concatenation: To join strings
		String str1 = "Learn";
		String str2 = "Java";
		System.out.println(str1 + str2);
		System.out.println(str1 + " " + str2);
		System.out.println("Learn " + "Java");
		System.out.println("Learn" + " Java");
		
		System.out.println(str1 + 2 + 3);
		System.out.println(str1 + (2 + 3));
		System.out.println(2 + 3 + str2);
		
		//By using str1, str2, 2, and 3 print 6LearnJava-1 on the console
		System.out.println((2 * 3) + str1 +str2 + (2 - 3));

	}

}
