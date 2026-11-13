package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

public class Patient 
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
	
	public void patientoperations()
	{
		try
		{
			Connection con =Connect();
			PreparedStatement pstm1 = con.prepareStatement("insert into patient values(?,?,?,?)");
			PreparedStatement pstm2 = con.prepareStatement("select * from patient");
			PreparedStatement pstm3 = con.prepareStatement("select * from patient where pid =?");
			PreparedStatement pstm4 = con.prepareStatement("update patient set age=? where pid=?");
			PreparedStatement pstm5 = con.prepareStatement("delete from patient where pid = ?");
		while(true)
			{
			IO.println("----Patient Details-----");
			IO.println("1.Add Patient Details");
			IO.println("2.View All Patients");
			IO.println("3.Retrieve Patient Data");
			IO.println("4.Update Patient data");
			IO.println("5.Delete Patient data");
			IO.println("6.Exit");
			
			int choice = Integer.parseInt(IO.readln("Enter your Choice : "));
			
			switch(choice)
			{
			case 1 ->
			{
				IO.println("Adding patient Data");
				String pId = IO.readln("Enter Patient Id : ");
				String pName = IO.readln("Enter Patient Name : ");
				int pAge = Integer.parseInt(IO.readln("Enter Patient Age : "));
				Long pContact = Long.parseLong(IO.readln("Enter Patient Contact Number : "));
				
				pstm1.setString(1, pId);
				pstm1.setString(2, pName);
				pstm1.setInt(3, pAge);
				pstm1.setLong(4, pContact);
				
				int rowCount = pstm1.executeUpdate();
				if(rowCount>0)
				{
					IO.println("Data Inserted ");
				}
				else
				{
					throw new RuntimeException("Patient data Not inserted");
				}
			}
			case 2 ->
			{
				IO.println("Diplaing all patient details");
				ResultSet rs = pstm2.executeQuery();
				while(rs.next())
				{
                    IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));					
				}
				IO.println();
			}
			case 3 ->
			{
				String pid=IO.readln("Enter patient Id to search : ");
				pstm3.setString(1, pid);
				ResultSet rs = pstm3.executeQuery();
				if(rs.next())
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));	
				else
				IO.println("No record found");
			}
			case 4 ->
			{
				String pid = IO.readln("Enter patient id to update record : ");
				int age = Integer.parseInt(IO.readln("Enter Age to set : "));
				
				pstm4.setString(2, pid);
				pstm4.setInt(1, age);
				int rows = pstm4.executeUpdate();
				if(rows>0)
				{
					IO.println("Record upate successfully ");
				}
				else
				{
					IO.print("Record not update");
				}
				IO.println();
			}
			case 5 ->
			{
				String pid = IO.readln("Enter patient id to delete record : ");
				pstm5.setString(1, pid);
				int rows = pstm5.executeUpdate();
				if(rows>0)
				{
					IO.println("Record deleted successfully ");
				}
				else
				{
					IO.print("Record not deleted");
				}
				IO.println();
			}
			case 6 ->
			{
		      IO.println("Thank you for coming...");
		      System.exit(0);
			}
			}
			}
		}
		catch(SQLIntegrityConstraintViolationException sql)
		{
			IO.println("Duplicate Data ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
	
		Patient p = new Patient();
		p.patientoperations();
	}

}
