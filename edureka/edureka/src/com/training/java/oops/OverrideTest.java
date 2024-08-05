package com.training.java.oops;

class A1 {
	int a = 10, b = 20;

	void displayAB() {
		System.out.println("In Class A --> " + a + " | " + b);
	}

}

class B1 extends A1 {
	int a = 11, b = 22;

	@Override
	void displayAB() {
		System.out.println("In Class B --> " + a + " | " + b + " | " + a + " | " + b);
		System.out.println("In Class B with This --> " + this.a + " | " + this.b + " | " + a + " | " + b);
		System.out.println("In Class B With This & Super --> " + this.a + " | " + this.b + " | " + super.a + " | " + super.b);
		super.displayAB();
	}

}

public class OverrideTest {
	public static void main(String args[]) {
		B1 obj = new B1();
		obj.displayAB();
	}

}
