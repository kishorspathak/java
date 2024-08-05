package com.training.java.exceptions;

class Except5{

	public static void main(String[] args){
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		} 
		catch (ArithmeticException ex){
			System.out.println(ex.getClass().getSimpleName() + " occured. cannot divide and integer by zero");
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getClass().getSimpleName() + " occured. please provide minimum 2 cmd arguments");
		}
		catch (NumberFormatException ex){
			System.out.println(ex.getClass().getSimpleName() + " occured. please provide only integer type data");
		}
		System.out.println("-----DONE-----");
		
		
	}
}