package com.jts.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunctionalitiues_4 {

	public static void main(String[] args) {

		HashMap<String, String> oddNumbers = new HashMap<>();
		oddNumbers = new HashMap<>();
		oddNumbers.put("Three", "3");
		oddNumbers.put("Five", "5");
		oddNumbers.put("Seven", "7");
		oddNumbers.putIfAbsent("Nine", "9");

		if (oddNumbers.containsKey("Seven")) {
			System.out.println("Key exist");
		}

		if (oddNumbers.containsValue("5")) {
			System.out.println("Value exist");
		}

		boolean oldValue = oddNumbers.replace("Seven", "17", "17");

		oddNumbers.replaceAll((k, v) -> v += " Test");

		System.out.println("HashMap::" + oddNumbers + " OLd Value::" + oldValue);
		System.out.println("Get value::" + oddNumbers.get("Three"));

		System.out.println(oddNumbers.getOrDefault("Three", "Default Value"));
		System.out.println(oddNumbers.getOrDefault("Eight", "Default Value"));

		oddNumbers.forEach((k, v) -> {
			v += " Updated";
			System.out.println("Key::" + k + " Value:: " + v);
		});

		for (Map.Entry<String, String> entry : oddNumbers.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();

			System.out.println("Key::" + k + " Value:: " + v);
			System.out.println("Entry::" + entry);

		}

		System.out.println("Keys::" + oddNumbers.keySet());
		System.out.println("Values::" + oddNumbers.values());

		oddNumbers.merge("Three", "3 Test", (old, newValue) -> old + newValue);

		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.merge("One", "3 Test", (old, newValue) -> old + newValue);

		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.compute("One", (k, v) -> "");
		
		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.computeIfAbsent("Two", (k) -> "100");
		
		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.computeIfPresent("Two", (k, v) -> v + " - 100");
		System.out.println("Upadted Values::" + oddNumbers);

	}
}
