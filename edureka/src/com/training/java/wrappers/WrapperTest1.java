package com.training.java.wrappers;

/**
 * From Numeric Integer class we shall be able to unwrap and get primitive data
 * types of various numeric types like byte, shot, integer, long, float, double
 * This can be done using byteValue, shotValue, integerValue, longValue, floatValue, doubleValue ,methods
 */
public class WrapperTest1 {

	public static void main(String[] args) {
		// Wrapping or boxing
		Integer in = Integer.valueOf(25);

		// Un-wrapping or Un-boxing
		byte b = in.byteValue();
		short s = in.shortValue();
		int i = in.intValue();
		long l = in.longValue();

		float f = in.floatValue();
		double d = in.doubleValue();

		System.out.println(b + " | " + s + " | " + i + " | " + l);
		System.out.println(f + " | " + d);

	}

}
