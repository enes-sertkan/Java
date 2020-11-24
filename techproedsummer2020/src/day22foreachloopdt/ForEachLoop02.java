package day22foreachloopdt;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		
		//Find the value of all elements by using for-each loop
		//For example : Average Value for 2, 4, 6 is (2+4+6)2
		double sum = 0;
		for(Integer w : list) {
			sum = sum + w;
		}
		System.out.println(sum/list.size());
	
	    //Remove all elements which are starting with lower cases from 
		//list by using for-each and continue
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ab");
		list1.add("cd");
		list1.add("Ef");
		list1.add("gh");
		list1.add("Ij");
		
	    for(String w : list1) {
	    	if(w.charAt(0)>='a' && w.charAt(0)<='z') {
	    		continue;
	    		
	    	}
	    	System.out.print(w);
	    }
	    
	    System.out.println();
	    
	    //Print just first 2 elements of list
	    int count = 0;
	    for (int w : list) {
	    	System.out.print(w + " ");
	    	count++;
	    	if(count==2) {
	    		break;
	    	}
	    }
	    
	    
     }
}
