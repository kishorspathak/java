package com.training.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<String, Float>();

		System.out.println(bank.put("Sunil", 25000f)); // null

		// Duplicate key being inserted so old value will be replaced with new value.
		// Returns previous value associated with key or null if there was on previous
		// value
		System.out.println(bank.put("Sunil", 11250.5f));
		System.out.println(bank.put("Anil", 25000f)); // shall return null since no value is associated with key Anil yet

		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);

		// Duplicates keys not allowed but duplicates values allowed
		// Order of elements is not maintained and only hashing is applied. 
		// To retain the order of insertion use LinkedHashMap<>()
		System.out.println(bank);
		System.out.println();

		float bal = bank.get("Sunil"); // Non-Existing key returns null pointer exception
		System.out.println("A/C balance of \"Sunil\" = " + bal);

		bal += 1150.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println();

		// Get all keys
		System.out.print("A/C holders ---> ");

		Set<String> names = bank.keySet();
		for (String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println("\n");

		// Get all entries
		System.out.println("------------- Account Balances -------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();

		while (it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			Float balance = entry.getValue();
			String acc = String.format("%-8s : %.2f", name, balance);
			System.out.println(acc);
			try {
				TimeUnit.SECONDS.sleep(1); // Thread.sleep(1000)
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		
		// We can put null as key an value in Map
		// Key can be null once in a Map, value can be null multiple times
		bank.put(null, null);
		System.out.println(bank);
		

	}

}
