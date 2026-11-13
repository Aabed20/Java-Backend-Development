package com.book_management;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);
		
		BookDao bean = context.getBean(BookDao.class);
		
		System.out.println("total Number Of books : "+bean.getTotalNumberOfBooks());
		
		System.out.println("-------------------");
		
		System.out.println("BookName By ID : "+bean.getBookNameById(102));
		
		System.out.println("-------------------");
		
		System.out.println("Book Details by ID : "+bean.getBookDetailsById(103));

		System.out.println("--------------");
		
		BookBO book = new BookBO();
		book.setBookId(106);
		book.setBookName("Spring");
		book.setAuthor("Aabed");
		book.setPrice(5000);
		if(1==bean.insertBook(book))
		{
			System.out.println("Book inserted Successfully");
		}
		else
		{
			System.out.println("book not inserted");
		}
		
		
		System.out.println("-------------------");
		
		int val = bean.updateBookPrice(4000, 101);
		if(val==1)
		{
			System.out.println("Price Updated Successfully");
		}
		else
		{
			System.out.println("Price not updated");
		}
		
		System.out.println("------------");
		
		bean.getAllBookDetails().forEach(System.out::println);
	}

}
