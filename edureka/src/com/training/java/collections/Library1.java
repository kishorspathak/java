package com.training.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Library1 {

	public static void main(String[] args) {
		List<Book> library = Arrays.asList(
				new Book(123456, "Java Book"), 
				new Book(123456, "Python Book"),
				new Book(123456, "Spring Book"),
				new Book(123456, "react Book")
		);

		// Call method and loop through library using forEach() loop
		displayLibraryStock(library);
	}

	private static void displayLibraryStock(List<Book> library) {
		library.forEach(bk -> {
			System.out.println(bk);
			try {
				TimeUnit.SECONDS.sleep(2); // Thread.sleep(2000)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

	}

}
