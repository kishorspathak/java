package com.training.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Process of going through all elements of a collection and retrieving objects is called iteration
 * To get the index of each element while iterating through a list using an Iterator, you need to maintain a separate counter 
 * to keep track of the current index. Java's Iterator does not provide direct access to indices, 
 * but you can achieve this by incrementing a counter on each iteration
 * refer iterate6() method
 */
public class ListIterations {

	public static void main(String[] args) {
		//To initialize the list use java.util.Arrays.asList() method or List.of()
//		List<Integer> marks = Arrays.asList(98, 73, 65, 87, 99, 45, 80); // Here the list is initialized
		List<Integer> marks = List.of(98, 73, 65, 87, 99, 45, 80); // Here the list is initialized
		System.out.println("Marks | " + marks);

		// In a list how do we display elements one after other
		iterate1(marks);
		iterate2(marks);
		iterate3(marks);
		iterate4(marks);
		iterate5(marks);
		iterate6(marks);
		iterate7(marks);
	}

	private static void iterate1(List<Integer> marks) {
		//for loop and get() is not for set and all
		System.out.println(">>> iteration using a for loop and get() method - only for List implementation");  
		
		for (int i=0; i< marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + "	");
		}
		System.out.println("\n");
	}
	
	private static void iterate2(List<Integer> marks) {
		//Enhanced for loop can be used for all collections
		System.out.println(">>> iteration using a enahnced for loop");  
		
		for (Integer n : marks) {
			System.out.print(n + "	"); 
		}
		
		System.out.println("\n");
	}
	
	//Most widely used is java.util.Iterator. Iterator is an Interface in java.util package
	private static void iterate3(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.Iterator");  
		Iterator<Integer> it = marks.iterator();
		//Iterator can only retrieve elements in forward direction
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "	");
		}
		
		System.out.println("\n");
	}
	
	//Most widely used is java.util.ListIterator. ListIterator is only for list not for set and other collections
		private static void iterate4(List<Integer> marks) {
			System.out.println(">>> iteration using java.util.ListIterator - only for list implementation");  
			ListIterator<Integer> it = marks.listIterator();
			//ListIterator has many methods to add, remove set using nextIindex(), previousIndex() from the list. It works in both direction forward & backward 
			while(it.hasNext()) {
				Integer n = it.next();
				System.out.print(n + "	");
			}
			
			System.out.println("\n");
			
			while(it.hasPrevious()) {
				Integer n = it.previous();
				System.out.print(n + "	");
			}
			
			System.out.println("\n");
		}

		//Enumerator is old. Iterator is new
		private static void iterate5(List<Integer> marks) {
			System.out.println(">>> iteration using Enumeration. Enumerator is old. Iterator is new");  
			Enumeration<Integer> en = Collections.enumeration(marks);
			
			while(en.hasMoreElements()) {
				Integer n = en.nextElement();
				System.out.print(n + "	");
			}
			
			System.out.println("\n");
		}

		private static void iterate6(List<Integer> marks) {
			System.out.println(">>> iteration using java.util.Iterator. and index using counter");
			Iterator<Integer> it = marks.iterator();
			
			int index = 0;
			while(it.hasNext()) {
				Integer n = it.next();
				System.out.print("Index " + index + " = " + n + "	");
				index++;
			}
			System.out.println("\n");
		}
		
		private static void iterate7(List<Integer> marks) {
//			System.out.println(">>> iteration using forEach(java.util.function.consumer) method");
//			marks.forEach(new Consumer<Integer>() {
//
//				@Override
//				public void accept(Integer t) {
//					System.out.print(t + "	");
//				}
//				
//			});
			
			// Using lambda function
			System.out.println(">>> iteration using forEach() Lambda function");
			marks.forEach((Integer n) -> {
				System.out.print(n + "  ");
			});
			
			System.out.println("\n");
			
			//If there is just one argument then there is no need to specify data type also 
			System.out.println(">>> iteration using forEach() Lambda function with one argument");
			marks.forEach(n -> {
				System.out.print(n + "  ");
			});
			
			System.out.println("\n");
		}
	
}
