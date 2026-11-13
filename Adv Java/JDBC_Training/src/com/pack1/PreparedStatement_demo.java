package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class PreparedStatement_demo 
{
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static String Uname = "AABED";
	private static String pwd = "pathan";
	
	public static Connection getCon()
	{
		
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, Uname, pwd);
			//System.out.println("Database Connected !!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	void operations()
	{
		Connection con = PreparedStatement_demo.getCon();
		try
		{
			while(true)
			{
				System.out.println("\nWelcome to patient database");
				System.out.println("1.Add Patient to database\n2.View All Patient data\n3.Retrieve Patient data\n4.Update Patient data\n5.Delete patient data\n6.Exit");
				System.out.println("\nEnter Yor choice : ");
				Scanner sc = new Scanner(System.in);
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice)
				{
				case 1 : System.out.println("Enter patient details : "); 
				int count=PreparedStatement_demo.addData();
				if(count>0) System.out.println("Record inserted successfully!!!");else System.out.println("Record not inserted!!!");break;
				case 2 : System.out.println("Showing All patient data "); PreparedStatement_demo.viewPatientData();break;
				case 3 : System.out.println("Retrieving patient data based on Patient id "); PreparedStatement_demo.retrieveData();break;
				case 4 : System.out.println("Updating patient data based on id "); PreparedStatement_demo.updateData();break;
				case 5 : System.out.println("Deleting patient data based on id "); break;
				case 6 : System.out.println("Thank you for Coming, Exiting "); System.exit(0);break;
				default : System.out.println("Invalid Option ");
				}
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static int addData()
	{
		int row = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient id : ");
		String pid = sc.nextLine();
		System.out.println("Enter Patient Name : ");
		String pname = sc.nextLine();
		System.out.println("Enter Patient age : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Patient Contact Number : ");
		Long contact= Long.parseLong(sc.nextLine());
		
		try
		{
		Connection con=PreparedStatement_demo.getCon();
		  PreparedStatement pstmt= con.prepareStatement("insert into patient values(?,?,?,?)");
		   pstmt.setString(1, pid);
		   pstmt.setString(2, pname);
		   pstmt.setInt(3, age);
		   pstmt.setLong(4, contact);
		   
		  row = pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return row;
	}
	
	public static void viewPatientData()
	{
		try
		{
			
		Connection con =PreparedStatement_demo.getCon();
		PreparedStatement pstmt2=con.prepareStatement("select * from patient");
		ResultSet rs=pstmt2.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void retrieveData()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
	        Connection con = PreparedStatement_demo.getCon();
	         PreparedStatement pstmt3 = con.prepareStatement("select * from patient where pid = ?");
		     System.out.println("Enter Patient Id : ");
		    String pid = sc.nextLine();
		    pstmt3.setString(1, pid);
		   ResultSet rs2= pstmt3.executeQuery();
		   if(rs2.next())
			   System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getLong(4));
		   else
			   System.out.println("Recor not found with "+pid+" Pid");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateData()
	{
		
		try
		{
		Scanner sc = new Scanner(System.in);
		Connection con = PreparedStatement_demo.getCon();
        PreparedStatement pstmt3 = con.prepareStatement("update patient set pcontact=? where pid=?");
	     System.out.println("Enter Patient Id : ");
	    String id = sc.nextLine();
	    
	    System.out.println("Enter Contact number to Update : ");
	    long contact = Long.parseLong(sc.nextLine());
	    pstmt3.setLong(1, contact);
	    pstmt3.setString(2, id);
	    int row=pstmt3.executeUpdate();
	    if(row>0) 
	    	System.out.println("Record Updated Sucessfully!!!");
	    else
	    	System.out.println("Record not updated!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void deleteData()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		Connection con = PreparedStatement_demo.getCon();
		PreparedStatement pstmt5 = con.prepareStatement("delete from patient where pid=?");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		PreparedStatement_demo  d1 = new PreparedStatement_demo();
		//PreparedStatement_demo.getCon();
		d1.operations();
	}

}
