package com.training.java.exceptions;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			System.out.print("enter another no: ");
			int y = sc.nextInt();

			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);

		} catch (ArithmeticException ex) {
			System.err.println("catch block ----- " + ex.toString());
		}
		
		finally {
			System.out.println("----- finally block -----");
			System.out.println("application designed and developed by ");
			System.out.println("team @edureka");
			sc.close();
		}

		System.out.println("----- DONE -----");

	}

}
