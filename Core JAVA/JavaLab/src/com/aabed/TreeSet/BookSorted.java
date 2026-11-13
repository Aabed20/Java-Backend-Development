package com.aabed.TreeSet;

import java.util.TreeSet;

record Book(String name, String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book b1) 
	{
		return this.name.compareTo(b1.name);
	}
}

public class BookSorted
{
	public static void main(String[] args)
	{
		TreeSet<Book> listOfBooks = new TreeSet<>();
		
		listOfBooks.add(new Book("Java","James Gosling"));
		listOfBooks.add(new Book("HTML","Tim"));
		listOfBooks.add(new Book("C","Denis Richey"));
		listOfBooks.add(new Book("Story","Steve"));
		listOfBooks.add(new Book("Poor Rich Dad","Unknown"));
		
		IO.println("Books sorted in alphabetical Order : \n"+listOfBooks);

	}

}
