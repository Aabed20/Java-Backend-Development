package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.BookDao;
import com.entity.Book;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<>();
		while(true)
		{
			System.out.println("Welcome to Library Books");
			System.out.println("1.Add Books");
			System.out.println("2.Fectch Books");
			System.out.println("3. for Fetching all records");
			System.out.println("4.Update Author name or title");
			System.out.println("5.Delete Book");
			System.out.println("6.Exit");
			System.out.println("Please enter your choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			 case 1:
			 {
				 System.out.println("\nEnter how many books you want to store :");
				 int size = Integer.parseInt(sc.nextLine());
				 for(int i=1; i<=size; i++)
				 {
					
					 System.out.println("Enter Book Title : ");
					 String title = sc.nextLine();
					 System.out.println("Enter Author Name : ");
					 String autor = sc.nextLine();
					 System.out.println("Enter Book category : ");
					 String category = sc.nextLine();
					 
					 Book book = new Book();
					 book.setTitle(title);
					 book.setAuthor(autor);
					 book.setCategory(category);
					 books.add(book);
				 }
				 String isInserted = BookDao.addBooks(books);
				 System.out.println(isInserted+"\n");
				 break;
			 }
				
			 case 2:
			 {
				 
				 List<Book> fectchBooks = BookDao.fectchBooks(books);
				 System.out.println(fectchBooks.size());
				 fectchBooks.forEach(System.out::println);
				
				 break;
			 }
				
			 
			 case 3:
			 {
				 System.out.println("Fetching all records:\n");
				 List<Book> listOfBooks = BookDao.fetchAllBooks();
				 
				 if(listOfBooks.size()==0)
				 {
					 System.out.println("No Records arre available");
				 }
				 else
				 {
				 listOfBooks.forEach(System.out::println);
				 }
				 break;
			 }
			 
			 case 4:
			 {
				 System.out.println("Enter author to update Author name & title to update title");
				 
				 String updateChoice = sc.nextLine();
				 
				 if(updateChoice.equalsIgnoreCase("author"))
				 {
					 System.out.println("Enter new name for Author : ");
					 String updatedName = sc.nextLine();
					 System.out.println("Enter the id to update");
					 int id = Integer.parseInt(sc.nextLine());
					 
					 String isUpdated = BookDao.updateData(updatedName, updateChoice, id);
					 
					 System.out.println(isUpdated);
					 
				 }
				 else if(updateChoice.equalsIgnoreCase("title"))
				 {
					 System.out.println("Enter New title ");
					 String updatedTitle = sc.nextLine();
					 System.out.println("Enter the book id to update");
					 int id = Integer.parseInt(sc.nextLine());
					 	 
					 String isUpdated = BookDao.updateData(updatedTitle, updateChoice, id);
					 
					 System.out.println(isUpdated);
					 
				 }
				 else
				 {
					 System.out.println("Enter valid option");
					 
				 }
				 break;
			 }
			 
			 case 5 :
			 {
				 System.out.println("Enter Book Id which you want to Delete");
				 int id = Integer.parseInt(sc.nextLine());
				 String deleteData = BookDao.deleteData(id);
				 System.out.println(deleteData);
				 break;
			 }
			 case 6:
			 {
				 System.out.println("Thank you for using our app");
				 sc.close();
				 System.exit(0);
			 }
			
			 default:
			 {
				 System.out.println("Please Enter a Valid option from 1 - 3");
			 }
				
			}
			
		}
		
		
		
	}

}
