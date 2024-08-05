package com.training.java.arrays;

import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 92;
		marks[1] = 87;
		System.out.println("array size = " + marks.length);
		System.out.println(Arrays.toString(marks));
		
		double []salaries = new double[9];
		System.out.println(Arrays.toString(salaries));
		
		boolean status[] = new boolean[10];
		System.out.println(Arrays.toString(status));
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		for(String name : names) {
			System.out.println(name);
		}
	}
}
