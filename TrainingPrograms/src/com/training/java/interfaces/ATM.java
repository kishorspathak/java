package com.training.java.interfaces;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which bank's card? [1.SBI | 2.ICICI] : ");
		int cardType = sc.nextInt();
		Bank bank;

		switch (cardType) {
		case 1:
			bank = new SBI();
			break;
		case 2:
			bank = new ICICI();
			break;
		default:
			System.err.println("CARD READ ERROR --- TRY AGAIN");
			return;
		}
		
		System.out.println();
		System.out.println("\t============== WELCOME TO " + bank.getClass().getSimpleName().toUpperCase() + " ==============\n");
		
		bank.deposit(1000);
		bank.withdraw(500);
		
		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		
	}

}
