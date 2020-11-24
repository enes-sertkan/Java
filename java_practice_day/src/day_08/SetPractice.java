package day_08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		System.out.println("-----HashSet-----");
		
		//Set does not allow duplicate elements
		Set<Integer> phoneNumbers = new HashSet<>();
		phoneNumbers.add(4572334);
		phoneNumbers.add(7122334);
		phoneNumbers.add(8126434);
		phoneNumbers.add(9177334);
		phoneNumbers.add(7122334);// When entering duplicate data, it overrides
		phoneNumbers.add(8182334);
		System.out.println(phoneNumbers);
		
		System.out.println("-----TreeSet-----");
		
		// TreeSet keeps in ascending order - natural order
		// Similar to HashSet, this also does not allow duplicates
		Set<Integer> ssn = new TreeSet<>();
		ssn.add(34536);
		ssn.add(76536);
		ssn.add(15636);
		ssn.add(15636);
		ssn.add(65660);
		System.out.println(ssn);
	}

}
