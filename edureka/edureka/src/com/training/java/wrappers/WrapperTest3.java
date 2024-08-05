package com.training.java.wrappers;


/**
 * Automatic conversion of primitive data to Wrapper Object is called boxing
 * Automatic conversion of object to primitive data is called unboxing
 */
public class WrapperTest3 {

	public static void main(String[] args) {
		int n1 = 12; // primitive data-type
		Integer n2 = n1; // Auto-boxing. Able to assign primitive data directly to object reference n2 is called "Auto-boxing"
		
		int n3 = n2; //Auto-unboxing. Able to assign reference to primitive data is called "Auto-unboxing"
		
		System.out.println(n1 + " | " + n2 + " | " + n3);
		
		Integer i1 = Integer.valueOf(12);
		Integer i2 = Integer.valueOf(23);
		
		Integer i3 = i1 + i2; // 2 objects cannot be added, but internally unboxing, addition, boxing happens first
		System.out.println(i3);
				

	}

}
