package com.jts.hashmap;

import java.util.HashMap;

public class HashMapFunctionalitiues_3 {

	public static void main(String[] args) {
		HashMap<String, String> numbers = new HashMap<>();
		System.out.println("HashMap::" + numbers.isEmpty() + " Size::" + numbers.size());
		
		numbers = new HashMap<>();
		numbers.put("One", "1");
		numbers.put("Two", "2");
		
		numbers.put("Two", "4");

		System.out.println("HashMap::" + numbers);
		System.out.println("HashMap::" + numbers.isEmpty() + " Size::" + numbers.size());
		
		HashMap<String, String> oddNumbers = new HashMap<>();
		oddNumbers = new HashMap<>();
		oddNumbers.put("Three", "3");
		oddNumbers.put("Five", "5");
		oddNumbers.put("Seven", "7");
		
		numbers.putAll(oddNumbers);
		
		System.out.println("HashMap::" + numbers);
	
	}
}
