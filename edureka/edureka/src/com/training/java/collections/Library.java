package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		List<Book> library = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		
		String request = "Y";
		
		do {
		System.out.print("Enter Book Id: ");
		Integer bookId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Book Title : ");
		String bookTitle = sc.nextLine();
		
		Book book = new Book(bookId, bookTitle);
		library.add(book);
		System.out.println("Book " + bookId + " --> titled '" + bookTitle + "' successfully added to library.");
		
		System.out.print("\ndo you want to add more books[Y/N]");
		request = sc.nextLine();
			
		} while (request.equalsIgnoreCase("Y"));

		System.out.println();
		
		displayLibraryStock(library);
		
		sc.close();
	}

	private static void displayLibraryStock(List<Book> library) {
		System.out.println("\n==================== EDUREKA LIBRARY ====================");
		int bookCounter = 1;
		//Using enahnced for loop
		for (Book bk : library) {
			System.out.println("Book" + bookCounter + bk);
			bookCounter++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
