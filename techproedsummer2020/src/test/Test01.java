package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test01{

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		h.put(3, "Bad");

		h.put(2, "Good");

		h.put(1, "Ugly");

		

		h.putIfAbsent(3, "The worst");

		h.putIfAbsent(4, "The best");

		System.out.println(h);

	}
}
