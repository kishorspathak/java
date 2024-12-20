package com.training.java.strings;

import java.util.Arrays;

public class StringCompareMethods {

	public static void main(String[] args) {
		String s1 = new String("edureka");
		String s2 = new String("edureka");
		
		System.out.println("(s1==s2) ---> " + (s1==s2)); //false. because == is used to check if both objects are referring to same memory or not
//		java.lang.Object.equals() // used to compare memory references 
//		java.lang.String.equals() // used to compare content 
		
		System.out.println("s1.equals(s2) ---> " + s1.equals(s2)); //true. equals method is used to check if contents of both objects are same or not
		System.out.println("s1.equalsIgnoreCase(s2) ---> " + s1.equalsIgnoreCase(s2)); //true. equals method is used to check if contents of both objects are same or not
		System.out.println("s1.contentEquals(s2) ---> " + s1.contains(s2)); //true. contentEquals method is used to check if contents of both objects are same or not
		
//		int compareTo() >> return 0 if both strings are equal numerically. otherwise it return the numerical difference between the first non-matching character
//		int compareToIgnoreCase() >> return 0 if both strings are equal numerically. otherwise it return the numerical difference between the first non-matching character
		String str1 ="ABC";
		String str2 ="ABC";
		System.out.println(str1.compareTo(str2));
		
		String str3 ="ABC";
		String str4 ="ADC";
		System.out.println(str3.compareTo(str4));
		
		
		String str5 = "Java is a high level programming language";
		String words[] = str5.split(" ");
		System.out.println("No of words in \""+ str5 + "\" = " + words.length);
        /** Display all words **/
		System.out.println(Arrays.toString(words));
		
		/** Join each word in an array using STAR (*) **/
		String joinedWords = String.join(" * ", words);
		System.out.println("Joined words = " + joinedWords);
		
	}

}
