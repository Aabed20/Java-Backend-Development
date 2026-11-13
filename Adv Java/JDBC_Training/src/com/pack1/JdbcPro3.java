package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Task 1 retrieve the employees details

//Task 2 Ask the user to enter emp data and insert that data into employee table

//Task 3 Ask the user to enter Eid and retrieve that emloyee record from the database
// if the record is NOT available display that msg in the Console including EmpId

//Task 4 Ask the user to enter Eid and delete that employee record

//Task 5 Ask the user to enter Eid and esal and update that record in the table accordingly
// if the record is NOT available display that msg in the Console including EmpId


public class JdbcPro3 
{
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "AABED";
	String pwd = "PATHAN";
	String employeeDetails = "select * from employee";
	
	public Connection Connect()
	{
		Connection con = null;
       	try 
       	{
       		Class.forName(driver);
          con =	DriverManager.getConnection(dbUrl, userName, pwd);
       	return con;
       	}
       	catch(Exception e)
       	{
       		
       		e.printStackTrace();
       		return con;
       	}
	}
	
	public ResultSet getEmployeeDetails(Connection con,String str) throws SQLException
	{
		
		Statement stat=con.createStatement();
		ResultSet rs = stat.executeQuery(str);
		return rs;
	}
	
	public void getAllEmployeeDetails() throws SQLException
	{
		ResultSet rs=getEmployeeDetails(Connect(),employeeDetails);
		while(rs.next())
		{
			IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		}
	}
	
	public void deleteRecord() throws SQLException
	{
		String eid = IO.readln("Enter Employee id to delete record : ");
		String deleteQuery = "delete from employee where EID='"+eid+"'";
		Statement stat = Connect().createStatement();
        int rows  = stat.executeUpdate(deleteQuery);
        if(rows>0)
        {
        	IO.println("Record deleted successfully.");
        }
        else
        {
        	IO.println("No record found with Employee ID "+eid);
        }
	}
	public void updateRecord() throws SQLException
	{
		String eid = IO.readln("Enter Employee id to update salary : ");
		int sal = Integer.parseInt(IO.readln("Enter Salary to update : "));
		String updateQuery = "update employee set esal="+sal+" where EID='"+eid+"'";
		Statement stat = Connect().createStatement();
        int rows  = stat.executeUpdate(updateQuery);
        if(rows>0)
        {
        	IO.println("Salary update successfully.");
        }
        else
        {
        	IO.println("No record found with Employee ID "+eid);
        }
	}
	
	
	public void insertData() throws SQLException
	{
		 
		 String eid = IO.readln("Enter emp id");
		 String fname = IO.readln("Enter emp firstname");
		 String lname = IO.readln("Enter emp lastname");
		 int sal = Integer.parseInt(IO.readln("Enter emp sal"));
		 String loc = IO.readln("Enter emp Location");
		 
		 String insertQuery = "insert into employee values('"+eid+"','"+fname+"', '"+lname+"', "+sal+", '"+loc+"')";
		 
		 Statement stat =Connect().createStatement();
		int rows = stat.executeUpdate(insertQuery);
		
		if(rows>0)
		{
			IO.println("Record Inserted");
		}
		else
		{
			IO.println("Record not inserted");
		}
		 
	}
	
	public void getParticularData() throws SQLException
	{
		String id = IO.readln("Enter Employee Id : ");
		String searchQuery = "select * from employee where eid='"+id+"'";
		ResultSet rs= getEmployeeDetails(Connect(), searchQuery);
		
		while(rs.next())
		{
			IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
	}
	
	public static void main(String[] args) throws SQLException
	{
		JdbcPro3 pro = new JdbcPro3();
		
		//pro.getAllEmployeeDetails();
//		try 
//		{
//		 //pro.insertData();
//		pro.getParticularData();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
     	//pro.deleteRecord();
		
		pro.updateRecord();
		
	}

}





















