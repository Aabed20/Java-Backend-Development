package com.book.task;

public class Book
{
  private int bookId;
  private String bookName;
  private String author;
  
  public Book(int bookId, String bookName, String author) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
  }

  public int getBookId() {
	return bookId;
  }

  public String getBookName() {
	return bookName;
  }

  public String getAuthor() {
	return author;
  }
  
  public void display()
  {
	  System.out.println("Book Details:\nBook Id : "+this.bookId);
	  System.out.println("Book Name : "+this.bookName);
	  System.out.println("Author : "+this.author);
  }

	
}
