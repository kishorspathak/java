package com.training.java.arrays;

import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0]=55;
		marks[1]=45;
		System.out.println(Arrays.toString(marks));
		
		String[] fruits = new String[5];
		fruits[0]="Apple";
		fruits[1]="Mango";
		System.out.println(Arrays.toString(fruits));
		
		char[] alphas = new char[5];
		alphas[0]='A';
		alphas[1]='B';
		System.out.println(Arrays.toString(alphas));
		
	}

}
