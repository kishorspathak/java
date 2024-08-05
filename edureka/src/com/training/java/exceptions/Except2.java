package com.training.java.exceptions;

class Except2 {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		try {
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		} catch (Exception e) {
			System.err.println("Please pass commandline arguments");
		}
		System.out.println("-----DONE-----");

	}
}