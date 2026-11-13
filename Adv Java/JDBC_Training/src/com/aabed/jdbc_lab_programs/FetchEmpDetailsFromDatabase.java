package com.aabed.jdbc_lab_programs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchEmpDetailsFromDatabase 
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
		// storeTextFile();
		 retrieveAndSaveTextFile();
	 }
	 
	 void retrieveAndSaveTextFile()
	 {
		 try
		 {
			Connection con = connect();
			PreparedStatement pstat = con.prepareStatement("select * from emp_info where empid=?");
			
			int id = Integer.parseInt(IO.readln("Enter Employee id : "));
			pstat.setInt(1, id);
		    ResultSet rs = pstat.executeQuery();
		    if(rs.next())
		    {
		    	 IO.println("Employee ID : "+rs.getInt(1)+"\nEmployee Name : "+rs.getString(2)+"\nAddress : "+rs.getString(3)+"\nMailId : "+rs.getString(4)
		    	 +"\nPhone number : "+rs.getString(5));
		    	 
		    	 String path = IO.readln("Enter Path to store Text File : ");
		    	       Clob b = rs.getClob(6);
					Reader data = b.getCharacterStream();
					BufferedReader br = new BufferedReader(data);
					FileWriter fw = new FileWriter(path);
					String line;
					while((line=br.readLine())!=null)
					{
						fw.write(line);
					}
					IO.println("Resume fetched and saved successfully.\n");
					IO.println("File saved at : "+path);
					br.close();
					fw.close();
		    }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 void storeTextFile()
	 {
		 IO.println("Enter Employee Details : ");
		 try
		 {
			 Connection con = connect();
			 PreparedStatement pstat = con.prepareStatement("insert into emp_info values(?,?,?,?,?,?)");
			 
			 int id = Integer.parseInt(IO.readln("Enter Employee Id : "));
			 String name = IO.readln("Enter Employee Name : ");
			 String add = IO.readln("Enter Address : ");
			 String mailId = IO.readln("Enter MailId : ");
			 String phNo= IO.readln("Enter Phone Number : ");
			 String path = IO.readln("Enter File Path : ");
			 
			
			 
			 pstat.setInt(1, id);
			 pstat.setString(2, name);
			 pstat.setString(3, add);
			 pstat.setString(4, mailId);
			 pstat.setString(5, phNo);
			 pstat.setClob(6, new FileReader(path));
			 
			 int rowCount= pstat.executeUpdate();
			 if(rowCount==1)
			 IO.println("Employee record inserted successfully");
			 else
				 IO.println("Record not stored!!!");
			 con.close();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
}
