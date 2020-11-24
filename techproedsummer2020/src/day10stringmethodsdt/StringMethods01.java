package day10stringmethodsdt;

public class StringMethods01 {

	public static void main(String[] args) {
		/*
		  1) length() ==> To get the number of characters in a string
		                  Returns integer
		                  
		  2) equals() ==> To check if two strings are same or not
		                  Returns boolean
          
          3) toUpperCase() ==> To convert all characters to upper case in a string
                               Returns string
          
          4) toLowerCase() ==> To convert all characters to lower case in a string
                               Returns string
          
          5) contains() ==> To check if a specific character exists in a String 
		                    Returns boolean
		  
		  6) equalsIgnoreCase() ==> To check if two Strings are same with ignoring cases
		                            Returns boolean
		  
		  7) charAt() ==> To get a character from String by using index
		                  Returns char  
		*/
		
		// 8) replace method ==> To change a character(s) in a string
		//                       string

		String str = "Easy, Java is Easy";
		System.out.println(str.replace('a', 'x'));// Exsy , Jxvx is Exsy
		//If you do not make assignment, original String does not change
		//str = str.replace('a', 'x');
		System.out.println(str);
		
		//In replace() we can use both char and String as parameters
		System.out.println(str.replace('a', '&'));//E&sy, J&v& is E&sy
		
		//In replace() we can use more than one character as parameter
		System.out.println(str.replace("Easy", "Hard"));
		System.out.println(str.replace("Easy", "Hard"));
		
		System.out.println(str.replace("", "/"));
		System.out.println(str.replace(" ", "/"));
		System.out.println(str.replace("a", ""));
		
		//9) replaceAll() makes the same thing with replace()
		//                There are two differences between them
		//                1)replaceAll() does not accept char as parameter
		//                2)replaceAll() accepts "regex" as parameter
		
		System.out.println(str.replaceAll("J", "L"));
		//str.replaceAll('J','l'); ==> Do not use parameters in replaceAll()
		
		//"regex" stands for "Regular Expressions"
		String m = "Java 123 ?!@";
		
		// ==> \\w means a->z and A->Z and 0->9 and _
		System.out.println(m.replaceAll("\\w", "*"));
		
		//In regex upper case has a negative meaning
		// \\W means characters EXCEPT a->z and A->Z and 0->9 and _
		System.out.println(m.replaceAll("\\W", "*"));
		
		// ==> \\d means 0->9
		System.out.println(m.replaceAll("\\d", "*"));
		System.out.println(m.replaceAll("\\D", "*"));
		
		// ==> \\s is four white space
		System.out.println(m.replaceAll("\\s", "==>"));
		System.out.println(m.replaceAll("\\S", "yes"));
		
	}

}
