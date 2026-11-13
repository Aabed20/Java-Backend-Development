package com.aabed.jdbc_lab_programs;

import java.sql.*;

public class Products
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
	 
	 public void insertData()
	 {
		 try
		 {
		 Connection con = connect();
		 PreparedStatement pstat1 = con.prepareStatement("insert into products values(?,?,?,?)");
		 String pid = IO.readln("Enter Product Id : ");
		 String name = IO.readln("Enter Product Name : ");
		 double price = Double.parseDouble(IO.readln("Enter Product Price : "));
		 int qty  = Integer.parseInt(IO.readln("Enter Product Quantity : "));
		 
		 pstat1.setString(1, pid);
		 pstat1.setString(2, name);
		 pstat1.setDouble(3, price);
		 pstat1.setInt(4, qty);
		 
		 int rows = pstat1.executeUpdate();
		 if(rows>0)
		 {
			 IO.println("Product inserted Successfully");
		 }
		 else
		 {
			 IO.println("Product Insertion Failed");
		 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void forwardData()
	 {
		 try
		 {
		  Connection con = connect();
		  PreparedStatement pstat2 = con.prepareStatement("select * from products", 1004, 1007);
			ResultSet rs = pstat2.executeQuery();
			
			while(rs.next())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void reverseData()
	 {
		 try
		 {
		  Connection con = connect();
		  PreparedStatement pstat2 = con.prepareStatement("select * from products", 1004, 1007);
			ResultSet rs = pstat2.executeQuery();
			rs.afterLast();
			while(rs.previous())
			{
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 public void specificRowFromTop()
	 {
		 try
		 {
		  Connection con = connect();
		  PreparedStatement pstat2 = con.prepareStatement("select * from products", 1004, 1007);
			ResultSet rs = pstat2.executeQuery();
			int rowRecord = Integer.parseInt(IO.readln("Enter Which Row Product You want : "));
			rs.beforeFirst();
			if(rs.absolute(rowRecord))
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			else
				IO.println("Row number is Invalid");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void specificRowFromBottom()
	 {
		 try
		 {
		  Connection con = connect();
		  PreparedStatement pstat2 = con.prepareStatement("select * from products", 1004, 1007);
			ResultSet rs = pstat2.executeQuery();
			int rowRecord = Integer.parseInt(IO.readln("Enter Which Row Product You want : "));
			rs.afterLast();
			if(rs.absolute(-rowRecord))
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			else
				IO.println("Row number is Invalid");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 public void retrieveLastThreeRecord()
	 {
		 try
		 {
		  Connection con = connect();
		  PreparedStatement pstat2 = con.prepareStatement("select * from products", 1004, 1007);
			ResultSet rs = pstat2.executeQuery();
			int rowRecord = Integer.parseInt(IO.readln("Enter Number of Product You want from bottom : "));
			rs.afterLast();
			int count =0;
			while(count!=rowRecord)
			{
				count++;
				rs.previous();
				IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
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
		IO.println("\n------Product Menu--------");
		IO.println("\t1.Insert productdetails into product table.\n"
				+ "\t2.Retrieve productdetails in forward direction.\n"
				+ "\t3.Retrieve productdetails in reverse direction.\n"
				+ "\t4.Retrieve 3rd record from top.\n"
				+ "\t5.Retrieve 3rd record from bottom. \n"
				+ "\t6.Retrieve last three record from product table.\n"
				+ "\t7. Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
        Products p = new Products();
		switch(choice)
		{
		case 1->
		{
			p.insertData();
		}
		case 2->
		{
			p.forwardData();
		}
		case 3->
		{
			p.reverseData();
		}
		case 4->
		{
			p.specificRowFromTop();
		}
		case 5->
		{
			p.specificRowFromBottom();
		}
		case 6 ->
		{
			p.retrieveLastThreeRecord();
		}
		case 7 ->
		{
			IO.println("Thank you for Coming Exiting!!!");
			System.exit(0);;
		}
		}
		}
	}

}
