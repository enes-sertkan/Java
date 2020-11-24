package day39collectionsdt;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	/*
	  Deque: Double ended Queue is an interface
	  
	  Note: For Queue's you can add new elements to end of the Queue but for Deque
	        you can add elements to the end and to the beginning.
	        
	        For Queue's you can remove elements from the beginning of the Queue but for Deque
	        you can remove elements from beginning and from the end of Deque
	*/
	
	public static void main(String[] args) {
		
		Deque<String> dq = new LinkedList<>();
		dq.add("Chris");
		dq.add("Ali");
		dq.add("Brandon");
		dq.add("Andie");
		dq.add("Tucker");
		System.out.println(dq);
		
		dq.addFirst("XXX");
		System.out.println(dq);
		
		dq.addLast("ZZZ");
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		
		dq.removeLast();
		System.out.println(dq);
		
		//If add() or addLast() cannot add element for any reason, they throw
		//IllegalStateException, but if offer() cannot add the element for any reason, it returns false
		dq.offer("YYY");
		System.out.println(dq);
		
		
	}

}
