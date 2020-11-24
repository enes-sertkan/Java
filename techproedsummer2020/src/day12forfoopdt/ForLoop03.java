package day12forfoopdt;

public class ForLoop03 {

	public static void main(String[] args) {
		//Print the integers which are divisible by 3 from 1 to 70
		//On the same line
		
		for (int i=1; i<=70; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
		//OR
		
		for(int i=3; i<=70; i=i+3) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		//Find the sum of the first 10 counting numbers
		
		int sum = 0;
		
		for(int i=1 ; i<=10 ; i++) {
			sum = sum + i;
		}
		//To see final sum on the console you must print syso(sum);
		//Out of the loop
		System.out.println(sum);
         
		//If you put syso(sum); inside the for loop you will print the sum on the console
		//for every loop//If you put syso(sum); inside the for loop you will print the sum on the console
		//for every loop
		
        int sum2 = 0;
		
		for(int i=1 ; i<=10 ; i++) {
			sum2 = sum2 + i;
			System.out.println(sum2);
		}
				
	}

}
