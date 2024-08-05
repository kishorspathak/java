package com.training.java.operators;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter you name: ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.println("Hello " + name);
	}

}
