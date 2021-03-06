package day19staticblockarraysdt;

public class StaticBlock {
    
	static int i;
	
	static {
		System.out.println("2nd static block");
	}
	
	static {
		i = 12;
		System.out.println("1st static block");
	}
	
	StaticBlock(){
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
		 /*
		   1) Static block is a code block
		   2) We use static blocks to initialize(Assign first value) static variables
		   3) Static Blocks are executed before all methods, before main method,
		      before all constructors 
		   4) If you have more than one Static Blocks, Java runs the above one first
		 */
		
        System.out.println("I am main method");
        
		StaticBlock obj1 = new StaticBlock();
	}

}
