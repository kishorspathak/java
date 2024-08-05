package com.training.java.strings;

public class StringMethods3 {

	public static void main(String[] args) {
		String str = "Java is a high level programming language.";
		//String[] words = str.split(" ");
		String[] words = str.split("[\\s.]");
		
		System.out.println("no of words = " + words.length);
		System.out.println("===================== Words Present ========================");
		for(String word : words) {
			System.out.println("-----> " + word);
		}
	}

}
