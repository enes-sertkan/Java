package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW {

	public static void main(String[] args) {
		 /*
	     * create a list of arraylist
	     * add the courses:
	     * java, selenium, testing, junit, cucumber,api, sql, database, sdlc
	     * print the elements from index 2 to index 7 using sublist: list.sublist(2,7);
	     * using iterators, remote if the string value has e and t
	     * 
	     */

		List<String> courses = new ArrayList<>();
		List<String> courses2 = new ArrayList<>();
		
		courses.add("java");
		courses.add("selenium");
		courses.add("testing");
		courses.add("junit");
		courses.add("cucumber");
		courses.add("api");
		courses.add("sql");
		courses.add("database");
		courses.add("sdlc");
	    System.out.println(courses);
	    
	    System.out.println(courses.subList(2, 7));
	    courses2.addAll(courses.subList(2, 7));
	    System.out.println(courses2);
	    
	    Iterator<String> crs = courses2.iterator();
	    while(crs.hasNext()) {
	    	String str = crs.next();
	    	if (str.contains("e") && str.contains("t")) {
				crs.remove();
			}
	    }
	    System.out.println(courses2);
	}

}
