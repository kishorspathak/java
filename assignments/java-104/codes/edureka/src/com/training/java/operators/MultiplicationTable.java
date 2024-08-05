package com.training.java.operators;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which number's multiplication table? ");
		int num = sc.nextInt();
		
		printTable(num);
	}

	private static void printTable(int num) {
		for(int i=1; i<=10; i++) {
			int p = num * i;
			System.out.printf("%d x %d = %d \n", num, i, p);
		}		
	}
}
