package day22foreachloopdt;

public class ForEachLoopdt {

	public static void main(String[] args) {
		/*
		  1) For each loops works with collections. (Arrays, Lists)
		  2) The other name of For Each Loop is "Enhanced Loops"
		*/
		
		int arr[] = {1, 2, 3, 4, 5};
		
		//How to print all elements of an array on the console
		for(int w : arr) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Find the sum of all elements of arr by using for-each loop
		int s = 0;
		for(int w : arr) {
			s = s + w;
			
		}
        System.out.println(s);
        
        //Print the even elements on the console by using for-each loop
        
        for(int a : arr) {
        	if(a%2==0) {
        		System.out.print(a + " ");
        	}
		}
        
        System.out.println();
        
        //Print the even elements on the console by using for-each loop and continue
        for (int w : arr) {
        	if(w%2!=0) {
        		continue;
        	}
        	System.out.print(w + " ");
        }
        
        System.out.println();
        
        //Find the multiplication of odd elements by using for-each loop and continue
        int sum = 1;
        for (int w : arr) {
        	if(w%2==0) {
        		continue;
        	}
        	sum = sum*w;
        }
        System.out.print(sum);
        
        //Find the sum of all elements except 3 by using for-each loop and continue
        int sum1 = 0;
        for (int w : arr) {
        	if(w==3) {
        		continue;
        	}
        	sum1 = sum1 + w;
        }
        System.out.println(sum1);
	}

}
