package com.aabed.jdbc_lab_programs;

import java.sql.*;

public class EmployeeRegisterOrLogin 
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
	 
	 public void login()
	 {
		 String id = IO.readln("Enter Employee id : ");
		 String name = IO.readln("Enter Your Name : ");
		 try
		 {
			 Connection con = connect();
			  PreparedStatement pstat = con.prepareStatement("select * from empinfo");
			ResultSet rs = pstat.executeQuery();
			boolean login = false;
			while(rs.next())
			{
				if(rs.getString(1).equalsIgnoreCase(id) && rs.getString(2).equalsIgnoreCase(name))
				{
					login = true;
					IO.println("Login Successfully!!!\n");
					
					break;
				}
			}
			if(login)
			{
				while(true)
				{
					
					boolean back = false;
					
					IO.println("-----Employee Menu------");
					IO.println("1. Show all Employees");
					IO.println("2. Update Mailid & phone Number ");
					IO.println("3. Delete Employee Whose salary between 50000-70000");
					IO.println("4. Increase 10% salary of each employee");
					IO.println("5. Exit");
					int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
					IO.println();
					switch(choice)
					{
					 case 1 ->
					 {
						 Statement pstat1 = con.createStatement();
						ResultSet rs1= pstat1.executeQuery("select * from empinfo");
					    
						 IO.println("===== Employee Details =====");
						 while(rs1.next())
						 {
							IO.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+
						 rs1.getString(4)+" "+rs1.getString(5)+" "+rs1.getString(6)+" "+rs1.getString(7)+"\n\n");
						 }
					    
						
					 }
					 case 2 ->
					 {
						 String id1 = IO.readln("Enter Id to Update its Mailid & phoneNumber : ");
						 PreparedStatement pstat2 = con.prepareStatement("update empinfo set employee_mailid=? , employee_phno=? where employee_id=?");
						 String mailid = IO.readln("Enter New Mail Id : ");
						 String phonenumber = IO.readln("Enter New Phone number : ");
						 pstat2.setString(1, mailid);
						 pstat2.setString(2, phonenumber);
						 pstat2.setString(3, id1);
						 
						 int updatedRows = pstat2.executeUpdate();
						 if(updatedRows>0)
						 {
							 IO.println("Mail Id And Phone Number Succesfully Updated!!!\n");
						 }
						 else
						 {
							 IO.println("Record not updated\n");
						 }
					 }
					 case 3 ->
					 {
						 PreparedStatement pstat2 = con.prepareStatement("delete from empinfo where employee_salary between 50000 and 70000");
						 int deletedrows = pstat2.executeUpdate();
						 if(deletedrows>0)
						 {
							 IO.println("Employee Record deleted Successfully...\n");	
						 }
						 else
						 {
							 IO.println("There is no employee whose salary is between 50000 and 70000\n");
						 }
					 }
					 case 4 ->
					 {
						 PreparedStatement pstat3 = con.prepareStatement("update empinfo set employee_salary=employee_salary+employee_salary * 0.1");
						  int salaryUpdated = pstat3.executeUpdate();
						  if(salaryUpdated>0)
						  {
							  IO.println("Salary Successfully Updated!!!\n");
						  }
						  else
						  {
							  IO.println("Salary Not Updated!!!\n");
						  }
					 }
					 case 5 ->
					 {
						 back = true;
						 IO.println("Thank You for Coming!!!");
					 }
					 default ->
					 {
						 IO.println("Invalid Choice !!");
					 }
				}
					if(back)
					{
						break;
					}
			}
		 }
			else
			{
				IO.println("Invalid Process");
				IO.println();
			}
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void register()
	 {
		 String id = IO.readln("Enter Employee id : ");
		 String name = IO.readln("Enter Your Name : ");
		 double salary = Double.parseDouble(IO.readln("Enter Your Salary : "));
		 String fName = IO.readln("Enter Your First Name : ");
		 String lName = IO.readln("Enter Your Last Name : ");
		 String mailId = IO.readln("Enter Your Mail Id : ");
		 String phoneNumber = (IO.readln("Enter Your Phone Number : "));
		 try
		 {
		 Connection con = connect();
		 PreparedStatement pstat=con.prepareStatement("insert into empinfo values(?,?,?,?,?,?,?)");
		 
		 pstat.setString(1, id);
		 pstat.setString(2, name);
		 pstat.setDouble(3, salary);
		 pstat.setString(4, fName);
		 pstat.setString(5, lName);
		 pstat.setString(6, mailId);
		 pstat.setString(7, phoneNumber);
		 int rows=pstat.executeUpdate();
		 if(rows>0)
		 {
			 IO.println("Registered Succesfully!!!!");
		 }
		 else
		 {
			 IO.println("Data Insertion Failed");
		 }
		 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }

	public static void main(String[] args)
	{
		while(true)
		{
			
		IO.println("--------- Login Page -----");
		IO.println("1. Register\n2. Login");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
		EmployeeRegisterOrLogin emp = new EmployeeRegisterOrLogin();
		 switch(choice)
		 {
		 
		   case 1 ->
		    {
	          emp.register();
	        }
		   case 2 ->
		    {
			   emp.login();
		    }
		 }
		}
	}

}
