package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		//If the collection if to collect heterogenous elements then do not specify any <datatype> or use  <?>
		List<String> names = new ArrayList<String>();
		System.out.println("no. of participants = " + names.size());
		System.out.println("is names empty = " + names.isEmpty());
		System.out.println(names);

		// List allows duplicates and maintains an order of elements
		// To add an element use add() method
		names.add("Kishor");
		names.add("Kiyansh");
		names.add("Kishor");
		names.add("Kishor");
		names.add("Addu");
		names.add("Ayan");
		System.out.println(names + " | size = " + names.size());

		// --- This will certainly add an element but this also means that element at
		// this place and all other
		// needs to be sifted down. Hence ArrayList is not recommended for such
		// scenarios
		// Hence the performance will be affected
		// to add an element at some index using add(index,value)
		names.add(0, "Ashok");
		System.out.println(names + " | size = " + names.size());

		// To get an index of Ashok
		System.out.println("IndexOf('Ashok') = " + names.indexOf("Ashok"));

		// To replace an element use set() method
		names.set(1, "ASHOK PATHAK");
		System.out.println(names + " | size = " + names.size());

		// To get an index of Kishor
		System.out.println("indexOf('Kishor') = " + names.indexOf("Kishor"));

		// To get an index of Kishor from the last
		System.out.println("lastIndexOf('Kishor') = " + names.lastIndexOf("Kishor"));

		// Search for something that's not present, this shall return -1
		System.out.println("IndexOf('Sanjay') = " + names.indexOf("Sanjay"));

		// Get at object at index 1
		System.out.println("Person at index 1 = " + names.get(1));

		// If we try to get something that is not present then index out of bounds
		// exception is returned
//		System.out.println("Getting non-existing index = " + names.get(10));
		try {
			System.out.println("Getting non-existing index = " + names.get(10));
		} catch (IndexOutOfBoundsException iobException) {
			System.err.println("Obejct not found | " + iobException.getLocalizedMessage());
			System.err.println("Exception Message | " + iobException.getMessage());
			// iobException.printStackTrace();
		}

		System.out.println("Exception occured but programmed is not interrupted and next block is executed...");

		// Remove an object from list. All the elements after the removed element are
		// shifted to the left side. If we are adding in-between all elements are
		// shifted to the right
		System.out.println("Removing an element using index | " + names.remove(1)); // Returns Removed Object Ashok
																					// Pathak
		System.out.println("Removing an elemnt using object names | " + names.remove("Kishor")); // Returns True if
																									// exist else false

		System.out.println(names + " | size = " + names.size());

		// Check if list contains kishor
		System.out.println("Check if element kishor is present | " + names.contains("Kishor")); // | true
		System.out.println("Check if element Sunil is present | " + names.contains("Sunil")); // | false

		// When elemets are added in-beween list or removed from list then shifting
		// happens which may lead to performance issue, hence ArrayList is not
		// recommended for adding or removing. However it's good for searching as it's index based
		
		
		//AaaryList max size is max size of integer i.e. Arraylist.Integer.MAX_SIZE, if limit is not there then stackoverflow or memory allocation issue will happen

	}

}
