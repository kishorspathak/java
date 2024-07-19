package com.training.java.interfaces;

interface Bank {
	int n = 10; // by default all member data in interface are public static final hence they can simply be used but not changed 
	void deposit(float amt);
	void withdraw(float amt);
	//Form java 8 onwards interface can have method body but these methods must be declared using "default" keyword
	//This is mainly used when all subclasses need to have a method with same implementation
	//default void withdrawFixedDeposit(float amt){};
}