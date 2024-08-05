package com.training.java.interfaces;

public class SBI implements Bank {

	@Override
	public void deposit(float amt) {
		System.out.println("Rs." + amt + " credited to " + getClass().getSimpleName() + " account");
	}

	@Override
	public void withdraw(float amt) {
		System.out.println("Rs." + amt + " debited from " + getClass().getSimpleName() + " account");
	}

}
