package day11stringmethodsdt;

public class StringMethods02 {
	
	public static void main(String[] args) {
		// 13) trim() method will delete the space characters from the
		//        beginning and ending of the String
		
		String str = " Java  ";
		//Before trim()
		System.out.println(str);
		System.out.println(str.length());
		
		//After trim()
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		// 14) IndexOf() method 
		String s = "Java is easy";
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('s'));
		//In indexOf() method you can use Strings and chars as parameters
		
		System.out.println(s.indexOf("is"));// It will return index of 1==>5
		// If you look for index of multiple characters you will get 
		// the index of first character
		
		System.out.println(s.indexOf('x'));
		
		System.out.println(s.indexOf('a', 4 ));//9
		// After the 4th index(inclusive) what is the index of 'a' ==> 9
		
		System.out.println(s.indexOf('a', 3));
		// After the 3rd index(inclusive) what is the index of 'a' ==> 3
		//first occurence 'a' ==>3
		
		// 15) lastIndexOf() method will return the index of last occurence
		//                   of a character
		
		String t = "Learn java learn";
		System.out.println(t.lastIndexOf('a'));
		System.out.println(t.lastIndexOf("ar"));//13, it returned the first index
		
		System.out.println(t.lastIndexOf('e', 5));
		
	}

}
