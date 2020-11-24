package day37iteratorscollectionsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(22);
		list.add(23);
		System.out.println(list);
		
		//Loops cannot update a list, loops can navigate among the elements but cannot update them
		for (int w : list) {
			w = w + 5;
		}

		System.out.println(list);
		
		//To update loops we use Iterators.
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			
			Object et = it.next();
			it.remove();
		}
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(31);
		list1.add(32);
		list1.add(33);
		System.out.println(list1);
		
		//Increase the value of every element by 5
		ListIterator<Integer> lit = list1.listIterator();
		
		while(lit.hasNext()) {
			Integer el = lit.next();
			lit.set(el + 5);
		}
		System.out.println(list1);
		
		/*
		  1) Create a list whose elements are String and every element has more than 4 characters
		  2) Make last 3 characters of every element like ***
		  3) Use ListIterator
		*/
		
		List<String> list2 = new ArrayList<>();
		list2.add("Automation");
		list2.add("Testing");
		list2.add("Database");
		list2.add("Restful");
		System.out.println(list2);
		
		ListIterator<String> lite = list2.listIterator();
		
		while (lite.hasNext()) {
			String al = lite.next();
			lite.set(al.replace(al.substring(al.length()-3), "***"));
		}
		System.out.println(list2);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
