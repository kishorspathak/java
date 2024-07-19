package com.training.java.oops;

class A {
	int a = 10, b = 20;

	void displayAB() {
		System.out.println("in class A --> " + a + " | " + b);
	}
}

class B extends A {
	int c = 30;

	void displayABC() {
		System.out.println("in class B --> " + a + " | " + b + " | " + c);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("in Main class --> " + obj.a + " | " + obj.b + " | " + obj.c);
		obj.displayAB(); // looks for method in class B, if not found ten looks for method in SuperClass
	}

}
