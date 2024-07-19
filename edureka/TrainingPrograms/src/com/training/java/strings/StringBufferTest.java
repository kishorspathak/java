package com.training.java.strings;

public class StringBufferTest {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
		
		/**
		 * String builder is same as String buffer. StringBuffer introduced in java1.0 &
		 * builder JDK1.5. StringBuffer is ThreadSafe
		 **/
		
		StringBuilder sb = new StringBuilder(); 
		//default size & capacity
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		//size 15 so capacity = 16. Size is well within capacity limit, hence not auto-incremented
		sb.append("edureka limited");
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		//size 16 so capacity = 16. Size is well within capacity limit, hence not auto-incremented
		sb.insert(0, "*");
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		/**
		 * if the size of buffer increases beyond default 16 characters, then new
		 * capacity is calculated using formula (old_capacity*2)+2
		 **/
		
		//size 18 so capacity = 16. Size is well within capacity limit, hence not auto-incremented
		sb.insert(0, "**");
		System.out.println(sb + " | size = " + sb.length() + " | capacity = " + sb.capacity());
		
		sb = sb.reverse();
		System.out.println("Reverse String >> " + sb);
		
	}

}
