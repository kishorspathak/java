package com.training.java.exceptions;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String req = "";
			do {
				System.out.print("Enter age of voter : ");
				try {
					int age = sc.nextInt();
					if (age >= 18) {
						System.out.println("$$$--- Voting Done --- <beep><beep> ---$$$");
					} else {
						throw new InvalidAgeException("age of voter should be greater than or equal to 18");
					}
				} catch (Exception ex) {
					System.err.println(ex);
				}

				System.out.print("\nanyone else to vote [y|n] : ");
				req = sc.next();
			} while (req.equalsIgnoreCase("y"));
		} finally {
			sc.close();
		}

	}

}
