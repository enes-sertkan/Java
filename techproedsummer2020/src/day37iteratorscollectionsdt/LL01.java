package day37iteratorscollectionsdt;

import java.util.LinkedList;
import java.util.List;

public class LL01 {

	/*
	  1) Linked lists do not use indexes, because of that in
	     linked lists accessing elements directly is difficult.
	     If you need to access to an element directly use array
	     list.
	     
	  2) Adding and removing elements are verified in Linked lists.
	     Because of that our program will do most of th time
	     adding and removing operations using linked list is the
	     best way.
	*/
	public static void main(String[] args) {
		
		List<String> llist = new LinkedList<>();
		llist.add("Steve");
		llist.add("Carl");
		llist.add("Raj");
		llist.add("Megan");
		llist.add("Ali");
		System.out.println(llist);
		
		llist.add(2, "XXX");
        System.out.println(llist);
        
        List<String> llist1 = new LinkedList<>();
        llist1.add("AAA");
        llist1.add("BBB");
        
        llist.addAll(llist1);
        System.out.println(llist);
        
        llist.addAll(4, llist1);
        System.out.println(llist);
        
        llist.remove(2);
        System.out.println(llist);
        
        llist.remove("AAA");
        System.out.println(llist);
        
        llist.removeAll(llist1);
        System.out.println(llist);
	}

}
