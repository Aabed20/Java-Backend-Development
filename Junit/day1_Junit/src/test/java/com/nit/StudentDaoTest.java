package com.nit;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentDaoTest 
{
	private Connection con;
	private String driver;
	private String url;
	private String userName;
	private String password;
	private StudentDao student;
	private int id=1;
	
	@Before
	public void setUp()
	{
		driver="oracle.jdbc.OracleDriver";
		url="jdbc:oracle:thin:@localhost:1521:orcl";
		userName="AABED";
		password="pathan";
		student=new StudentDao();
		String deleteQuery = "delete from student1 where student_id=?";
		try 
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		}
		catch (ClassNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void insertTest()
	{
	  
		int result = student.insertData(id, "Aabed");
		
		assertEquals(1, result);
		
		String name = student.getStudentNameById(id);
		
		assertEquals("Aabed",name);
	}
	
	@After
	public void tearDown()
	{
		con=null;
		driver=null;
		url=null;
		userName=null;
		password=null;
		id=0;
		student=null;
	}

}
