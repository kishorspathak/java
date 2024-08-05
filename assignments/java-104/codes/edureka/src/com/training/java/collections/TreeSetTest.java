package com.training.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Mark")); // add method returns boolean true if object is added successfully and false otherwise
		System.out.println(names.add("Mark")); // Trying to add duplicates hence it must return false 
		System.out.println(names.add("mark")); // Trying to add case-sesitive name hence it must return true 
		System.out.println(names.add("Prakash"));  
		System.out.println(names.add("Charles"));  
		System.out.println(names.add("Rahul"));
		System.out.println(names.add("Sujith"));
		System.out.println(names.add("Anil"));
		
		// TreeSet Does not allow duplicates. Order of insertion is not maintained instead items are displayed in Ascending order
		// Internally set uses compareTo() method. If compareTo returns +ve ASCII value then element is placed after the root element (1st element). 
		// If compareTo returns -ve ASCII value then element is placed before the root element (1st element). 
		// If compareTo returns "Zero", then element is not added to TreeSet 
		System.out.println(names); 
		
		System.out.println("no of participants = " + names.size());
	}

}
