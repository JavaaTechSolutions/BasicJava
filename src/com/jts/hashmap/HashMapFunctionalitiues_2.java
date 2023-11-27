package com.jts.hashmap;

import java.util.HashMap;

public class HashMapFunctionalitiues_2 {

	public static void main(String[] args) {
		HashMap<String, String> numbers = new HashMap<>();
		numbers.put("One", "1");
		numbers.put("Two", "2");

		System.out.println("HashMap::" + numbers);

		HashMap<String, String> cloneNumbers = (HashMap<String, String>) numbers.clone();

		System.out.println("HashMap::" + cloneNumbers);
		
		System.out.println("HashMap::" + numbers.clone());
	}
}
