package com.training.java.collections;

public class Book {
	public Integer bookId;
	public String bookTitle;
	
	public Book() {}
	
	public Book(Integer bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	
	@Override
	public String toString() {
//		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + "]";
		// To print formatted string like 6 digit bookId and 32 characters book title
		return String.format("Book [%6d ---> %-32s]", bookId, bookTitle);
	}
	
	
	
	
}
