package day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;

public class LL01 {

	public static void main(String[] args) {
		
		//addFirst() adds the elements at the beginning of the linked list
		LinkedList<String> sll = new LinkedList<>();
		sll.add("A");
		sll.addFirst("B");
		sll.addFirst("C");
		sll.add("B");
		sll.add("B");
		System.out.println(sll);
		
		//addLast() adds the elements at the Last of the linked list
		sll.addLast("N");
		System.out.println(sll);
		
		//getFirst() gets the elements at the first of the linked list
		System.out.println(sll.getFirst());
		
		//getLast() gets the elements at the last of the linked list
        System.out.println(sll.getLast());
        
        //Collections.sort() puts the elements in natural order
        Collections.sort(sll);
        System.out.println(sll);
        
        //clear() removes/deletes/clears all elements
//        sll.clear();
//        System.out.println(sll);
        
        //contains() check if a specific element exists in the list
        System.out.println(sll.contains("N"));
        
        //element() Retrieves and does not remove the head (first element) of the list
        //If there is no first element you will get NoSuchException
        System.out.println(sll.element());
        
        System.out.println(sll.get(2));
        
        sll.removeFirstOccurrence("B");
        System.out.println(sll);
        
	}

}
