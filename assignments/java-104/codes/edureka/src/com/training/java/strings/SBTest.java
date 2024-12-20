package com.training.java.strings;

public class SBTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb + " | size =  " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb + " | size =  " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.insert(0, "**");
		System.out.println(sb + " | size =  " + sb.length() + " | capacity = " + sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
	}
}
