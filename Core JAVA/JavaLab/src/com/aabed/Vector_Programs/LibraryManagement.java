package com.aabed.Vector_Programs;

import java.util.Scanner;
import java.util.Vector;

record Book(Integer id, String title, String author) {}

class Library
{
	public void displayAvailableBooks(Vector<Book> v)
	{
		for(int i=0; i<v.size(); i++)
		{
			IO.println(v.get(i));
		}
	}
	
	public void issueBook(Vector<Book> v, Scanner sc)
	{
		boolean bookAvailable= false;
		IO.println("Enter Book id which you want to issue :");
		int bookId = Integer.parseInt(sc.nextLine());
		for(int i=0; i<v.size(); i++)
		{
			if(bookId==v.get(i).id())
			{
				
				bookAvailable = true;
				IO.println("Issued : "+v.get(i));
				v.remove(i);
				break;
			}
			
		}
		if(!bookAvailable)
		{
			System.err.println("Book with ID "+bookId+" not Found ");
		}
		
	}
	
	public void searchBook(Vector<Book> v, Scanner sc)
	{
		boolean notAvailable = true;
		IO.print("Enter keyword to search by title or author:");
		String authorOrTitle = sc.nextLine();
		for(int i=0; i<v.size(); i++)
		{
			if(v.get(i).author().equalsIgnoreCase(authorOrTitle)||v.get(i).title().equalsIgnoreCase(authorOrTitle))
			{
				notAvailable = false;
				IO.println("Found : "+v.get(i));
				break;
			}
		}
		if(notAvailable)
		{
			System.err.println("No matching Books Found");
			
		}
	}
	
}

public class LibraryManagement 
{
	public static void main(String[] args)
	{
      Vector<Book> listOfBooks = new Vector<>();
      listOfBooks.add(new Book(101,"Core Java","Mr James"));
      listOfBooks.add(new Book(102,"Adv Java","Mr Robert"));
      listOfBooks.add(new Book(103,"Head First Java","Miss Kathy Sierra"));
      listOfBooks.add(new Book(104,"Programming in C","Mr Denis"));
      
      Scanner sc = new Scanner(System.in);
      int choice=0;
      
      Library library = new Library();
	  IO.println("Select from the Menu : ");
	  IO.println("\t\t1) Display Books Available in the Library :");
	  IO.println("\t\t2) Search a Book in the Library :");
	  IO.println("\t\t3) Issue a Book from the Library :");
	  IO.println("\t\t4) Exit from the application :");

	  while(true)
      {
		  IO.println();
		 choice = Integer.parseInt(IO.readln("Please Enter your Choice : "));
    	  
    	 switch(choice)
    	 {
    	   case 1->
    	   {
    		 library.displayAvailableBooks(listOfBooks);
    	   }
    	   case 2 ->
    	   {
    		   library.searchBook(listOfBooks, sc);
    	   }
    	   case 3 ->
    	   {
    		   library.issueBook(listOfBooks, sc);
    	   }
    	   case 4 ->
    	   {
    		   IO.println("Thank you for Visiting..");
    		   System.exit(0);
    	   }
    	 }
      }

	}

}









