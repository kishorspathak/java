package com.training.java.exceptions;

class Except6 {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		}
		// Since Exception is superclass of all exceptions hence it must be the last
		// catch block else program will not compile
		// catch (Exception ex){
		// System.out.println(ex.getClass().getSimpleName() + " occured");
		// }
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getClass().getSimpleName() + " occured. please provide minimum 2 cmd arguments");
		} catch (NumberFormatException ex) {
			System.out.println(ex.getClass().getSimpleName() + " occured. please provide only integer type data");
		} catch (Exception ex) {
			// This will create and ArithmeticException object reference
			System.out.println("exception occured");
		}

		System.out.println("-----DONE-----");

	}

}