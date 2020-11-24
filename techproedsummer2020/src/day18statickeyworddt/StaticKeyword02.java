package day18statickeyworddt;

public class StaticKeyword02 {

	public static void main(String[] args) {
		// i = 12 ==> static     and    k = 13 ==>non-static

		System.out.println(StaticKeyword01.i);
		
		StaticKeyword01 obj1 = new StaticKeyword01();
		
		System.out.println(obj1.k);
	}

}
