package com.training.java.oops;

public class Counter {
	int n = 10;
			
	void inc() {
		n = n + 1;
	}
	
	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		
		obj1.inc();
		obj2.inc();
		obj3.inc();
		
		System.out.println("OBJ-01 N=" + obj1.n);
		System.out.println("OBJ-02 N=" + obj2.n);
		System.out.println("OBJ-03 N=" + obj3.n);
	}

}
