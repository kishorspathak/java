package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		System.out.println("no. of participants = " + names.size());
		System.out.println("is names empty = " + names.isEmpty());
		System.out.println(names);
		
		//List allows duplicates and maintains an order of elements
		//To add an element use add() method
		names.add("Kishor");
		names.add("Kiyansh");
		names.add("Kishor");
		names.add("Kishor");
		names.add("Piyu");
		names.add("Addu");
		names.add("Ayan");
		System.out.println(names + " | size = " + names.size());
		
		//--- This will certainly add an element but this also means that element at this place and all other 
		// needs to be sifted down. Hence ArrayList is not recommended for such scenarios
		// Hence the performance will be affected
		//to add an element at some index using add(index,value)
		names.add(0, "Ashok"); 
		System.out.println(names + " | size = " + names.size());
		
		//To replace an element use set() method
		names.set(1, "ASHOK PATHAK");
		System.out.println(names + " | size = " + names.size());
		
	}

}
