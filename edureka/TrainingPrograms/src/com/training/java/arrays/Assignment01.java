package com.training.java.arrays;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		System.out.print("Enter your fullname : ");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String name = sc.nextLine();

			System.out.print("Enter your number of subjects : ");
			int nos = sc.nextInt();

			int[] marks = new int[nos];

			for (int i = 0; i < nos; i++) {
				System.out.print("Enter markes for subject-" + (i + 1) + ": ");
				int subMark = sc.nextInt();
				marks[i] = subMark;
			}

			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("\t\t REPORT CARD \t\t");
			System.out.println("Name: " + name);
			System.out.println("--------------------------------------");

			System.out.println("SUBJECT" + "\t\t\t" + "MARKS");
			System.out.println("--------------------------------------");

			int sum = 0;
			float avg = 0;

			for (int subjectMark : marks) {
				int i = 1;
				System.out.println("Subject-" + i + "\t\t" + subjectMark);
				sum += subjectMark;
			}
			avg = sum / marks.length;

			System.out.println("--------------------------------------");
			System.out.print("Total: " + sum);
			System.out.printf("\t\tAverage: %.2f", avg);
			System.out.println("\n--------------------------------------");
		} finally {
			sc.close();
		}

	}

}
