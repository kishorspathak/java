package com.training.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		System.out.println("Size = " + str.length());
		System.out.println("Character at index 0 = " + str.charAt(0));
		System.out.println("Character at index 13 = " + str.charAt(13));
//		System.out.println("Character at index 14 = " + str.charAt(14));
		System.out.println("indexOf(e) = " + str.indexOf("e")); // starts searching from start of the string
		System.out.println("indexOf(e,1) = " + str.indexOf("e",1)); // starts searching from index 1
		System.out.println("lastIndexOf(e) = " + str.lastIndexOf("e")); // starts searching from end of the string
		System.out.println("lastIndexOf(limited) = " + str.lastIndexOf("limited")); // starts searching from start of the string & return starting index of limited
		System.out.println("index(java) = " + str.indexOf("java")); // return -1 if the string is not found
		
		System.out.println(str.toLowerCase()); //stored at a different location in heap memory
		System.out.println(str.toUpperCase()); //stored at a different location in heap memory
		System.out.println(str.replace('e', '*')); //stored at a different location in heap memory
		System.out.println(str.replace("e", "*")); //stored at a different location in heap memory
		System.out.println(str); // Original string remains unchanged
		

	}

}
