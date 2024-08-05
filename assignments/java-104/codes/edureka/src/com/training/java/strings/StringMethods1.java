package com.training.java.strings;

public class StringMethods1 {

	public static void main(String[] args) {
		String str = "edureka limited";
		System.out.println("size = " + str.length());
		
		System.out.println("charAt(0) = " + str.charAt(0));
		System.out.println("charAt(14) = " + str.charAt(14));
		//System.out.println("charAt(0) = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) = " + str.indexOf("e")); //0
		System.out.println("indexOf(e,1) = " + str.indexOf("e",1)); //4
		System.out.println("lastIndexOf(e) = " + str.lastIndexOf("e")); //13
		System.out.println("indexOf(limited) = " + str.indexOf("limited")); //8
		System.out.println("indexOf(java) = " + str.indexOf("java")); //-1
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('e','*'));
		
		System.out.println(str.startsWith("edureka"));
		System.out.println(str.startsWith("java"));
		System.out.println(str.endsWith("ed"));
		System.out.println(str);
	}
}
