package com.aabed.jdbc_lab_programs;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDeatilsWithPhoto 
{

	String driver ="oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUName = "AABED";
	String dPwd = "PATHAN";
	
	 Connection connect()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUName, dPwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	 void storeImageOrPdf()
	 {
		 IO.println("Enter Student Details : ");
		 try
		 {
			 Connection con = connect();
			 PreparedStatement pstat = con.prepareStatement("insert into student_info values(?,?,?,?,?)");
			 
			 int id = Integer.parseInt(IO.readln("Enter Student Id : "));
			 String name = IO.readln("Enter Student Name : ");
			 String email = IO.readln("Enter Email : ");
			 String phone = IO.readln("Enter Course : ");
			 String idProof = IO.readln("Enter Photo Path : ");
			 
			FileInputStream fis = new FileInputStream(idProof);
			 
			 
			 pstat.setInt(1, id);
			 pstat.setString(2, name);
			 pstat.setString(3, email);
			 pstat.setString(4, phone);
			pstat.setBinaryStream(5, fis);
			 
			 pstat.executeUpdate();
			 IO.println("Student record inserted successfully");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 
	 void main(String[] args) 
	{
		storeImageOrPdf();

	}

}
