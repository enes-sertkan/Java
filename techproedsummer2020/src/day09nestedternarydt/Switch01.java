package day09nestedternarydt;

public class Switch01 {

	public static void main(String[] args) {
		/*
		  If the user pressed 1, 2, 3 the program will print the number 
		  that is pressed; 
          otherwise, program will print "Not allowed".
		*/

		//1. Way: if-else-if
		int x = 3;
		if(x==1) {
			System.out.println("One");
		}else if(x==2) {
			System.out.println("Two");
		}else if(x==3) {
			System.out.println("Three");
		}else {
			System.out.println("Not allowed");
		}
		
		//2.Way: Switch
		switch (x) {
		case 1:
			System.out.println("One");
		    break;
		case 2:
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
		default:
		System.out.println("Not allowed");
		}
	}

}
