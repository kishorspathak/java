package com.training.java.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		
		// Duplicate key being inserted so old value will be replaced with new value. 
        // Returns previous value associated with key or null if there was on previous value
		System.out.println(bank.put("Sunil", 11250.5f));
		System.out.println(bank.put("Anil", 25000f)); // shall return null since no value is associated with key Anil yet
		
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		// Duplicates keys not allowed but duplicates values allowed
		// Elements are stored in Ascending order of Key.
		System.out.println(bank);

		// In TreeMap key cannot be null but value can be null
		bank.put("Sanjay", null);
		System.out.println(bank); 
		bank.put(null, null); // Putting null key will throw java.lang.NullPointerException
	}

}
