package com.aabed.jdbc_lab_programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StudentDetailsInsertionUsingProcedure
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
	
	void studentDataInsertion()
	{
		IO.println("Inserting data into student tables : ");
		try
		{
		 Connection con = connect();
		 CallableStatement cstat = con.prepareCall("{call insert_data(?,?,?,?,?,?,?,?,?)}");
		 
		 int id = Integer.parseInt(IO.readln("Enter Student Id :"));
		 int rollno = Integer.parseInt(IO.readln("Enter Student Roll No :"));
		 String name = IO.readln("Enter Student Name : ");
		 String branch = IO.readln("Enter Branch Name : ");
		 String hno = IO.readln("Enter House number : ");
		 String city = IO.readln("Enter City Name : ");
		 String pincode = IO.readln("Enter Pincode : ");
		 String mid = IO.readln("Enter Mail Id : ");
		 String phno = (IO.readln("Enter Phone No :"));
		 
		 cstat.setInt(1, id);
		 cstat.setInt(2, rollno);
		 cstat.setString(3, name);
		 cstat.setString(4, branch);
		 cstat.setString(5, hno);
		 cstat.setString(6, city);
		 cstat.setString(7, pincode);
		 cstat.setString(8, mid);
		 cstat.setString(9, phno);
		 
		 cstat.execute();
		 IO.println("Data inserted Succesfully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void meth2()
	{
		IO.println("Implementing Callable Statement procedure");
		try
		{
			Connection con = connect();
			CallableStatement cstat = con.prepareCall("{Call display_student_data(?,?,?,?,?,?,?,?,?)}");
			String eid = IO.readln("Enter Student Id : ");
			cstat.setString(1, eid);
			
			cstat.registerOutParameter(2, Types.NUMERIC);
			cstat.registerOutParameter(3, Types.VARCHAR);
			cstat.registerOutParameter(4, Types.VARCHAR);
			cstat.registerOutParameter(5, Types.VARCHAR);
			cstat.registerOutParameter(6, Types.VARCHAR);
			cstat.registerOutParameter(7, Types.VARCHAR);
			cstat.registerOutParameter(8, Types.VARCHAR);
			cstat.registerOutParameter(9, Types.VARCHAR);
			
			cstat.execute();
			IO.println("----Student Details----");
			IO.println("Student Id : "+eid);
			IO.println("Student roll No : "+cstat.getInt(2));
			IO.println("Student Name : "+cstat.getString(3));
			IO.println("Branch : "+cstat.getString(4));
			IO.println("House Number : "+cstat.getString(5));
			IO.println("City : "+cstat.getString(6));
			IO.println("Pincode : "+cstat.getString(7));
			IO.println("Mail Id : "+cstat.getString(8));
			IO.println("Phone Number : "+cstat.getString(9));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		StudentDetailsInsertionUsingProcedure sd = new StudentDetailsInsertionUsingProcedure();
	//	sd.studentDataInsertion();

		sd.meth2();
	}

}
