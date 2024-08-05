package com.training.java.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
//		names.add("Mark");
		
		System.out.println(names.add("Mark")); // add method returns boolean true if object is added successfully and false otherwise
		System.out.println(names.add("Mark")); // Trying to add duplicates hence it must return false 
		System.out.println(names.add("mark")); // Trying to add case-sesitive name hence it must return true 
		System.out.println(names.add("Prakash"));  
		System.out.println(names.add("Charles"));  
		System.out.println(names.add("Rahul"));
		System.out.println(names.add("Sujith"));
		System.out.println(names.add("Anil"));
		
		// HashSet Does not allow duplicates. Also order of elements is not maintained. To maintain order use LinkedHashSet
		System.out.println(names); 
		
		System.out.println("no of participants = " + names.size());
	}

}
