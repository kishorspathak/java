package com.training.java.oops;

class A2{
	A2(){
		System.out.println("class A2 constructor");
	}
}

class B2 extends A2{
	B2(){
		//super(); // by default in the constructor the first statement is super() which calls constructor of superclass
		System.out.println("class B2 constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {
		B2 obj = new B2();

	}

}
