package day16constructorsdt;

public class Animals {
	
	int height = 50;
	String name = "Rabbit";
	boolean mammal = true;
	
	Animals (int height) {
		this.height = height;
		
	}
	
	
	Animals () {
		
		
	}
	

	public static void main(String[] args) {
		/*
		  Create 2 constructors one is with and other without a parameter
		  By using that constructors create at least 2 objects then print 
		  their features on the console 
		*/
		
		Animals an1 = new Animals(200);
		System.out.println(an1.height);
		System.out.println(an1.mammal);
		System.out.println(an1.name);
		
		System.out.println("___________");
		
		Animals an2 = new Animals();
		System.out.println(an2.height);
		System.out.println(an2.mammal);
		System.out.println(an2.name);
	}

}
