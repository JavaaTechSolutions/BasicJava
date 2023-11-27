package com.jts.hashmap;

import java.util.HashMap;

public class HashMapFunctionalitiues_1 {

	public static void main(String[] args) {
		HashMap<String, String> numbers = new HashMap<>();
		numbers.put("One", "1");
		numbers.put("Two", "2");

		System.out.println("HashMap::" + numbers);

		numbers.clear();

		System.out.println("HashMap::" + numbers);
	}
}
