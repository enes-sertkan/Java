
package day40mappsdt;

import java.util.Hashtable;
import java.util.Map;

public class HT01 {

	public static void main(String[] args) {
		
		Map<String, String> ht = new Hashtable<>();ht.put("", "");
		ht.put("Cat", "Meow");
		ht.put("Dog", "Bark");
		ht.put("Lion", "Roar");
		ht.put("Bee", "Buzz");
		ht.put("Cow", "Moo");
		
		//If you use "null" for key of a HashTable you will get NullPointerException
		//ht.put(null, "Yell");
		
		//If you use "null" for value of a HashTable you will get NullPointerException
		//ht.put("Chicken", null);
		
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		
		Map<String, String> ht1 = new Hashtable<>();ht.put("", "");
		ht.put("C", "M");
		ht.put("D", "B");
		ht.put("L", "R");
		
		//Copies all of the mappings from the specified map to this map
		ht.putAll(ht1);
		System.out.println(ht);
		
	}

}
