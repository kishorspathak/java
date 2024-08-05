package com.training.java.oops;

public class StaticTest {

//	If you need to do any logic before main method then that must be written inside static block. 
//	All static blocks are executed before main method 
	static {
		System.out.println("Inside static block...");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
	static {
		System.out.println("Inside another static block...");
	}


}
