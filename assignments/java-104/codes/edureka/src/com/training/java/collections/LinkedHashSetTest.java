package com.training.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Mark")); // add method returns boolean true if object is added successfully and false otherwise
		System.out.println(names.add("Mark")); // Trying to add duplicates hence it must return false 
		System.out.println(names.add("mark")); // Trying to add case-sesitive name hence it must return true 
		System.out.println(names.add("Prakash"));  
		System.out.println(names.add("Charles"));  
		System.out.println(names.add("Rahul"));
		System.out.println(names.add("Sujith"));
		System.out.println(names.add("Anil"));
		
		// LinkedHashSet Does not allow duplicates. Also order of elements is maintained. Default order of elements i.e. Order of insertion
		// To display the elements n ascending order use TreeSet from NavigableSet interface
		System.out.println(names); 
		
		System.out.println("no of participants = " + names.size());
	}

}
