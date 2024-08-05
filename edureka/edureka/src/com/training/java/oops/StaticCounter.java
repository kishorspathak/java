package com.training.java.oops;

public class StaticCounter {
	static int n = 10;
			
	void inc() {
		n = n + 1;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticCounter obj1 = new StaticCounter();
		StaticCounter obj2 = new StaticCounter();
		StaticCounter obj3 = new StaticCounter();
		
		obj1.inc();
		obj2.inc();
		obj3.inc();
		
		System.out.println("OBJ-01 | N = " + obj1.n);
		System.out.println("OBJ-02 | N = " + obj2.n);
		System.out.println("OBJ-03 | N = " + obj3.n);
	}

}
