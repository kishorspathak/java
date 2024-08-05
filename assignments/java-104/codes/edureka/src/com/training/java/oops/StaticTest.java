package com.training.java.oops;

public class StaticTest {
	static {
		System.out.println("inside static block-1");
	}
	public static void main(String[] args) {
		System.out.println("inside MAIN method");
	}
	static {
		System.out.println("inside static block-2");
	}
}
