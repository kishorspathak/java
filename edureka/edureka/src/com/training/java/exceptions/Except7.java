package com.training.java.exceptions;

class Except7 {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		} catch (Exception ex) {
			// This will create and ArithmeticException object reference
			System.out.println("exception occured");
			System.out.println(" message " + ex.getMessage());
			System.out.println();
			System.out.println("toString() " + ex.toString());
			System.out.println();
			ex.printStackTrace(); // toString() + call stack
			System.out.println();

			if (ex instanceof ArithmeticException) {
				System.out.println("-------- cannot divide an int by 0 --------");
			}

		}

		System.out.println("-----DONE-----");

	}

}