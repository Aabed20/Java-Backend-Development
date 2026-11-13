package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LibraryManagement 
{
	static String driver = "oracle.jdbc.OracleDriver";
	static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String userName = "AABED";
	static String pwd = "PATHAN";
	
	
	public Connection Connect()
	{
		Connection con = null;
       	try 
       	{
       		Class.forName(driver);
          con =	DriverManager.getConnection(dbUrl, userName, pwd);
       	
       	}
       	catch(Exception e)
       	{
       		
       		e.printStackTrace();
       		
       	}
       	return con;
	}
	
	public void addingBook() 
	{
		String bookId = IO.readln("Enter Book Id : ");
		String bookName = IO.readln("Enter Book Name : ");
		String author = IO.readln("Enter Author Name : ");
		String genere = IO.readln("Enter Genere of Book : ");
		int bookCost = Integer.parseInt(IO.readln("Enter the Book Price : "));
		String addingQuery = "insert into LIBRARY values('"+bookId+"','"+bookName+"','"+author+"','"+genere+"',"+bookCost+")";
		
		try {
		Statement stat = Connect().createStatement();
		  int rows = stat.executeUpdate(addingQuery);
		  
		  if(rows>0)
			  IO.println("Book Added successfully.");
		  else IO.println("Book Not added successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void searchBook()
	{
		String bookId = IO.readln("Enter Book id : ");
		String searchQuery = "select * from library where BOOKID ='"+bookId+"'";
		try
		{
			boolean found = false;
			Statement stat = Connect().createStatement();
			ResultSet rs = stat.executeQuery(searchQuery);
			while(rs.next())
			{
				found = true;
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			if(!found)
			{
				IO.println("No Book Found with Book ID "+bookId);
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteBook()
	{
		String bookId = IO.readln("Enter Book id : ");
		String deleteQuery = "delete from library where BOOKID ='"+bookId+"'";
		try
		{
			Statement stat = Connect().createStatement();
			int rows = stat.executeUpdate(deleteQuery);
			if(rows>0)
			{
				IO.println("Book deleted successfully.");
			}else
			{
				IO.println("Book not deleted.");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void allBooks()
	{
		try
		{
			Statement stat = Connect().createStatement();
			ResultSet rs = stat.executeQuery("select * from library");
			while(rs.next())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	void library_menu()
	{
		while(true)
		{
			IO.println("Welcome to Library management ");
			IO.println("Choose your option ");
			IO.println("1. Add books to the Library ");
			IO.println("2. Search Specific Book ");
			IO.println("3. Deleting Specific Book");
			IO.println("4. view All the Books ");
			IO.println("5. Exit");
			int choice = Integer.parseInt(IO.readln("Enter your option : "));
			
			switch(choice)
			{
			case 1 ->
			{
				addingBook();
			}
			case 2 ->
			{
				searchBook();
			}
			case 3 ->
			{
				deleteBook();
			}
			case 4 ->
			{
				allBooks();
			}
			case 5 ->
			{
				IO.println("Thanking for Coming");
				System.exit(0);	
			}
			default ->
			{
				IO.println("Invalid Option Choose valid option between 1 to 5.");
			}
			}

			IO.println();
		}
	}
	public static void main(String[] args) 
	{
		LibraryManagement lm = new LibraryManagement();
		lm.library_menu();
		
	}

	
	
	
	
	
	
	
	
	
	
}
