package com.training.java.wrappers;

/**
 * Java is not 100% object oriented because we have primitive data types in java
 * Collection do not allow primitive data types hence primitive must be
 * converted to Wrapper Objects first Do not use deprecated method for primitive
 * to Wrapper Object conversion. Instead use ValueOf method of each Wrapper
 * Class ValueOf can take primitive value or a String value
 */

public class WrapperTest {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i1 = new Integer(25); // Do not use deprecated
		@SuppressWarnings("removal")
		Integer i2 = new Integer("25");

		Integer i3 = Integer.valueOf(25); // Use recommended valueOf('primitive_val') for primitive to wrapper object
											// conversion. This valueOf is taking a primitive value
		Integer i4 = Integer.valueOf("25"); // This valueOf is taking a string value

		System.out.println(i1 + " | " + i2 + " | " + i3 + " | " + i4);

		@SuppressWarnings("removal")
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');

		System.out.println(c1 + " | " + c2);
	}

}
