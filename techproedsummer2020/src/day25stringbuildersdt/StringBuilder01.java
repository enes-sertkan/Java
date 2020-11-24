package day25stringbuildersdt;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		//1. Way to create StringBuilder
        StringBuilder stb1 = new StringBuilder();//""
        
        stb1.append("A");//"A"
        System.out.println(stb1);
        
        stb1.append("b");//Ab
        System.out.println(stb1);
        
        //2. Way to create StringBuilder
        StringBuilder stb2 = new StringBuilder("Java");//Java
        stb2.append("X");//Javax
        System.out.println(stb2);
        
        //3. Way to create StringBuilder
        //If you use Integer inside the constructor parenthesis, it means
        //you created a string whose length is 5.
        
        //After declaring the length, it is allowed to create strings in different lengths
        StringBuilder stb3 = new StringBuilder(5);
        
        stb3.append("Java");
        System.out.println(stb3);
        
        stb3.append("XY");
        System.out.println(stb3);
	}
}
