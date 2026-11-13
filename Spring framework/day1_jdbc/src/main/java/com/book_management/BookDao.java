package com.book_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao 
{
	private JdbcTemplate template;
	
	public static final String QUERY_FOR_TOTAL_NUMBER_OF_BOOKS="select count(1) from book1";
	
	public static final String QUERY_FOR_FETCHING_BOOKNAME_BYID="select bookname from book1 where bookid=?";
	
	public static final String QUERY_FOR_FETCHING_BOOKDETAILS_BYID="select bookid,bookname,author,price from book1 where bookid=?";
	
	public static final String QUERY_FOR_INSERT_BOOKDETAIILS="insert into book1 values(?,?,?,?)";
	
	public static final String QUERY_FOR_UPDATE_BOOKPRICE="update book1 set price=? where bookid=?";
	
	public static final String QUERY_FOR_FETCHING_ALL_BOOKDETAILS="select bookid,bookname,author,price from book1";
	
	@Autowired
	public BookDao(JdbcTemplate template)
	{
		this.template=template;
	}

	public int getTotalNumberOfBooks()
	{
		return template.queryForObject(QUERY_FOR_TOTAL_NUMBER_OF_BOOKS, Integer.class);
	}
	
	public String getBookNameById(int bookId)
	{
		return template.queryForObject(QUERY_FOR_FETCHING_BOOKNAME_BYID, String.class,new Object[] {bookId});
	}
	
	public BookBO getBookDetailsById(int bookId)
	{
		return template.queryForObject(QUERY_FOR_FETCHING_BOOKDETAILS_BYID,new Object[] {bookId},new BookMapper());
	}
	
	public int insertBook(BookBO book)
	{
		return template.update(QUERY_FOR_INSERT_BOOKDETAIILS,new Object[]{book.getBookId(),book.getBookName(),book.getAuthor(),book.getPrice()});
	}
	
	public int updateBookPrice(double price,int bookId)
	{
		return template.update(QUERY_FOR_UPDATE_BOOKPRICE,new Object[] {price,bookId});
	}
	
	public List<BookBO> getAllBookDetails()
	{
		return template.query(QUERY_FOR_FETCHING_ALL_BOOKDETAILS,(rs,row)->
		{
			BookBO book = new BookBO();
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			return book;
		}
				);
	}
}
