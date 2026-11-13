package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connections.ConnectionProvider;
import com.entity.Book;

public class BookDao 
{
	
	public static String addBooks(List<Book> books)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		for(Book book:books)
		{
		  session.persist(book);	
		}
		transaction.commit();
		session.close();
		return "Books Inserted successfully";
	}
	
	public static List<Book> fectchBooks(List<Book> books)
	{
		List<Book> listOfBooks = new ArrayList<>();
		
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		for(Book book:books)
		{
			listOfBooks.add(session.getReference(Book.class, book.getId()));
		}
		transaction.commit();
		session.close();
		return listOfBooks;
	}
	
	public static List<Book> fetchAllBooks()
	{
		List<Book> books = null;
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		books=session.createSelectionQuery("from Book",Book.class).getResultList();
		
		transaction.commit();
		session.close();
		return books;
	}
	
	public static String updateData(String name, String choice,int id)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Book book = session.get(Book.class, id);
		if(book==null)
		{
			session.close();
			return "Invalid Id";
		}
		
		if(choice.equalsIgnoreCase("author"))
		{
			book.setAuthor(name);
			transaction.commit();
			session.close();
			return "Author name updated Successfully";
		}
		else if(choice.equalsIgnoreCase("title"))
		{
			book.setTitle(name);
            transaction.commit();
            session.close();
            return "Title updated Successfully";
		}
		else
		{
			session.close();
			return "updation failed";
		}
         		
	}
	
	public static String deleteData(int id)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		Book book = session.get(Book.class, id);
		
		if(book==null)
		{
			transaction.commit();
			session.close();
			return "Invalid id";
		}
		else
		{
			session.remove(book);
			transaction.commit();
			session.close();
			return "Book Removed Successfully";
		}
	}

}
