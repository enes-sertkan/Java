package day45questionsdt;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IQ01 {
	
	public static void main(String[] args) {
	
		String[] arr = {"A", "B", "A", "C", "B", "D", "A", "B", "B"};
		
		//1. Way
		Set<String> set1 = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i].equals(arr[k])) {	
				    set1.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		
		//2. Way: For each loop and set
		Set<String> set2 = new HashSet<>();
		Set<String> set3 = new HashSet<>();
		
		for(String w : arr) {
			if(set2.add(w)==false) {
				set3.add(w);	
			}
		}
		System.out.println(set3);
		
		//3. Way: Map and for each loop
		
		// {"A", "B", "A", "C", "B", "D", "A", "B", "B"}
		
		Map<String, Integer> map = new HashMap<>();
		for(String w : arr) {
			int count = 1;
			if (!map.containsKey(w)) {
				map.put(w, count);
			}else {
				map.put(w, map.get(w)+1);
			}
		}
		System.out.println(map);
		
		//4. Way: Functional Programming
		List<String> list = Arrays.asList(arr);
		list.stream()
		    .filter(t->Collections.frequency(list, t)>1)
		    .collect(Collectors.toSet())
		    .forEach(t-> System.out.print(t + " "));
		
		System.out.println();
		
		
	}

}
