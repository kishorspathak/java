package com.training.java.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String str1 = new String("edureka");
		//String str2 = new String("edureka");
		String str2 = new String("Edureka");
		
		System.out.println(str1 == str2); //false
		System.out.println("equals() = " + str1.equals(str2));
		System.out.println("contentEquals() = " + str1.contentEquals(str2)); 
		System.out.println("equalsIgnoreCase() = " + str1.equalsIgnoreCase(str2));
		
		String s1 = "ABC";
		//String s2 = "ABC";
		String s2 = "ADA";
		int n = s1.compareTo(s2); //will return 0 if both strings are equal; otherwise it returns the numerical diff b/w the first non-matching character
		System.out.println(n);
	}

}
