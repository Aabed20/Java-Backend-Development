package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO 
{
	
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String dburl = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static String uname = "AABED";
	private static String pwd = "pathan";

public static Connection getCon()
{
	Connection con = null;
	try
	{
		Class.forName(driver);
		con=DriverManager.getConnection(dburl,uname,pwd);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	return con;
}

public int registerStudent(StudentBean sb)
{
	int rows = 0;
	
	try
	{
		
		Connection con=StudentDAO.getCon();
		PreparedStatement pstmt=con.prepareStatement("insert into student2 values(?,?,?,?,?)");
	    pstmt.setString(1, sb.getId());
	    pstmt.setString(2, sb.getName());
	    pstmt.setString(3, sb.getEmail());
	    pstmt.setString(4, sb.getCourse());
	    pstmt.setString(5, sb.getCity());
	    
	    rows=pstmt.executeUpdate();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rows;
}

public StudentBean getStudentById(String studentId)
{
	StudentBean sb = new StudentBean();
	try
	{
		String id = studentId+"";
		Connection con=StudentDAO.getCon();
		PreparedStatement pstmt2=con.prepareStatement("select * from student2 where studentid=?");
	    pstmt2.setString(1, id);
	    ResultSet rs=pstmt2.executeQuery();
	    if(rs.next())
	    {
	    	 sb.setId(rs.getString(1));
	    	 sb.setName(rs.getString(2));
	    	 sb.setEmail(rs.getString(3));
	    	 sb.setCourse(rs.getString(4));
	    	 sb.setCity(rs.getString(5));
	    
	    }
	    else
	    {
	    	sb=null;
	    }
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return sb;
}

public int deleteStudent(String id)
{
	int rows =0;
	
	try
	{
		Connection con=StudentDAO.getCon();
		  PreparedStatement pst3= con.prepareStatement("delete from student2 where studentid=?");
	      pst3.setString(1, id);
	      rows=pst3.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	
	return rows;
}


}
