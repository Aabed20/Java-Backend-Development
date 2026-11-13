package com.aabed.jdbc_lab_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDetails 
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
		 
		 void main()
		 {
			 //storeImageOrPdf();
			 retrieveAndSaveImage();
		 }
		 
		 void retrieveAndSaveImage()
		 {
			 try
			 {
				Connection con = connect();
				PreparedStatement pstat = con.prepareStatement("select * from player_info where pid=?");
				
				int id = Integer.parseInt(IO.readln("Enter Player id : "));
				pstat.setInt(1, id);
			    ResultSet rs = pstat.executeQuery();
			    if(rs.next())
			    {
			    	 IO.println("Player ID : "+rs.getInt(1)+"\nPlayer Name : "+rs.getString(2)+"\nDate of Birth : "+rs.getDate(3));
			    	 
			    	 String path = IO.readln("Enter Path to store Image : ");
			    	 Blob b = rs.getBlob(4);
			    	 byte []bytes = b.getBytes(1, (int) b.length());
			    	 FileOutputStream fos = new FileOutputStream(path);
			    	 fos.write(bytes);
			    	 IO.println("Image Status : Image Fetched and saved succesfully");
			     IO.println("Image saved at : "+path);
			     
			     fos.close();
			     con.close();
			    }
			    else
			    {
			    	IO.println("Record not available with Player ID : "+id);
			    }
			
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		 
		 void storeImageOrPdf()
		 {
			 IO.println("Enter Customer Details : ");
			 try
			 {
				 Connection con = connect();
				 PreparedStatement pstat = con.prepareStatement("insert into player_info values(?,?,?,?)");
				 
				 int id = Integer.parseInt(IO.readln("Enter Player Id : "));
				 String name = IO.readln("Enter Player Name : ");
				 String dob = IO.readln("Enter Date of Birth : ");
				 String idProof = IO.readln("Enter Image Path : ");
				 
				 FileInputStream fis = new FileInputStream(idProof);
				 
				 pstat.setInt(1, id);
				 pstat.setString(2, name);
				 pstat.setString(3, dob);
				 pstat.setBlob(4, fis);
				 
				 pstat.executeUpdate();
				 IO.println("Player record inserted successfully");
				 fis.close();
				 con.close();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
		 }
		 
		 
	}


