package com.training.java.strings;

public class StringObjects {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2); //true. since both strings are pointing to same value in String pool memory
		
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println(s3==s4); //false. Since both objects are created at different locations in Heap memory

		s1.concat("tutorials");
		System.out.println(s1); // java
		
		s1 = s1.concat("\u0000tutorials");//java + space + tutorials
		System.out.println(s1); 
	}

}
