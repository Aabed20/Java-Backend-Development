package com.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPro12ImageData 
{

	 String driver = "oracle.jdbc.OracleDriver";
	 String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	 String userName = "AABED";
	 String pwd = "PATHAN";
	
	String query1 = "insert into mydata values(?,?)";
	String query2 = "select pic_data from mydata where id=? ";
	
	public Connection connect()
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
	
	void meth1()
	{
		IO.println("Passing image into Database\n");
		try
		{
		Connection con =connect();
		PreparedStatement pstat1 = con.prepareStatement(query1);
		pstat1.setString(1, "101");
		FileInputStream fis = new FileInputStream("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\pic1.avif");
		pstat1.setBlob(2, fis,fis.available());
		int rowCount = pstat1.executeUpdate();
		if(rowCount==0)
			throw new RuntimeException("Image not inserted!!!1");
		   IO.println("Image Inserted succesfully!!!");
		
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void meth2()
	{
		IO.println("Retrieving the image");
		try
		{
			Connection con = connect();
			PreparedStatement pstat2 = con.prepareStatement(query2);
			pstat2.setString(1, "101");
			ResultSet rs = pstat2.executeQuery();
			if(rs.next())
			{
				Blob b = rs.getBlob(1);
				byte arr[] = b.getBytes(1,(int)b.length());
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\pic2.avif");
				fos.write(arr);
				IO.println("Image Retrieved");
				fos.close();
			}
			else
			{
				IO.println("Image NOT found!!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		JdbcPro12ImageData obj = new JdbcPro12ImageData();
		//obj.meth1();
		obj.meth2();
	}

}
