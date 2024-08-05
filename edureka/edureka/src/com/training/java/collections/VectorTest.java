package com.training.java.collections;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class VectorTest {

	public static void main(String[] args) {
		// Default initial capacity of vector is 10. When the capcaity is reached then it
		// doubles
//		Vector<Integer> vtr = new Vector<Integer>(); // Vector with default initial capacity
//		Vector<Integer> vtr = new Vector<Integer>(5); // Vector with initial capacity of 5
		Vector<Integer> vtr = new Vector<Integer>(5, 3); // Vector with initial capacity of 5 and increment of 3

		System.out.println(vtr + " | Size =  " + vtr.size() + " | Capacity = " + vtr.capacity());

		// Adding 10 more items to see the new capacity of vector
		for (int i = 11; i <= 20; i++) {
			vtr.add(i); // Auto-boxing i.e. int i is converted to Integer Wrapper class and then added to
						// Vector Collection
		}

		// Here capacity must be noticed since 10 new items are added to vector above
		System.out.println(vtr + " | Size =  " + vtr.size() + " | Capacity = " + vtr.capacity());

		// Add item more than 20 items into vector now
		vtr.add(21);
		System.out.println(vtr + " | Size =  " + vtr.size() + " | Capacity = " + vtr.capacity());

		System.out.println();

		// loop through vector using enumeration
		Enumeration<Integer> en = vtr.elements();
		while (en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + "  ");
			try {
				TimeUnit.SECONDS.sleep(1); // Thread.sleep(1000)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("End Of vector...");
	}

}
