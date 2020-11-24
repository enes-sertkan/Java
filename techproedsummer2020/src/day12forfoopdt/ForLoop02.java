package day12forfoopdt;

public class ForLoop02 {

	public static void main(String[] args) {
		//print your name 20 times on the console
		
		for (int i = 1 ; i<=20; i++) {
			System.out.println("Enes Sertkan");
		}
		
		//Print integers from 3 to 20 on the same line with a space between them
		//3 4 5 6 7 ... 20
		
		for (int x = 3 ; x<=20 ; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println("");
		//Print the integers from 20 to 3 on the same line with a space between them
		//20 19 18 ... 3
		
		for (int i = 20 ; i>=3 ; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		//print even numbers from 12 to 32 by using for-loop, same line and a space in between
		
		for(int y=12; y<=32; y=y+2) {
			System.out.print(y + " ");
			
		}
		
		System.out.println("");
		//OR
		//use if statement under the for-loop
		for(int y=12; y<=32; y++) {
			if(y%2==0) {
				System.out.print(y + " ");
			}
		}
		
		System.out.println("");
		
		//Print odd integers from 12 to 32 on the same line with a space
		
		for(int i=13; i<=32; i=i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		for(int i=12; i<=32; i++ ) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}

}
