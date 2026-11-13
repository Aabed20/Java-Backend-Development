package com.nit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao 
{
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String userName = "AABED";
	private String password = "pathan";
	
	private String insertQuery="insert into Student1 values(?,?)";
	
	public int insertData(int id, String name)
	{
		int result= 0;
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,userName,password);
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			 result = pstmt.executeUpdate();
			
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public String getStudentNameById(int id)
	{
		String name = "";
		String selectQuery ="select student_name from student1 where student_id=?";
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,userName,password);
			PreparedStatement pstmt = con.prepareStatement(selectQuery);
			pstmt.setInt(1, id);
			
			 ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				name=rs.getString(1);
			}
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return name;
	}
}
