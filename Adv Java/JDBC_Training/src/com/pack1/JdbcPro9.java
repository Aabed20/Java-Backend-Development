package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class JdbcPro9 
{

	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname = "AABED";
	String dbPwd = "PATHAN";
	String sqlQuery1 = "update trainseatavailability set AVAILABLE_SEATS=AVAILABLE_SEATS-1 where train_id=? "
			+"and journey_date=? and class=? and AVAILABLE_SEATS>0";
	
	String sqlQuery2 = "insert into bookingdetails values(?,?,?,?,?)";
	
	String sqlQuery3 = "select PAYMENT_STATUS FROM CUSTOMERPAYMENT WHERE CUSTOMER_ID=?";
	
	String sqlQuery4 = "update bookingdetails set STATUS='Confirmed' where CUSTOMER_ID=?";
	
	Connection connect()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl,dbUname,dbPwd);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	void meth1()
	{
		IO.println("Implementing Transaction Management");
		try
		{
			Connection con = connect();
			IO.println("Database Connected Succesfully!!!");
			IO.println("Before diabling Autocommit ===>"+con.getAutoCommit());
			con.setAutoCommit(false);
			IO.println("After diabling Autocommit ===>"+con.getAutoCommit());
		    PreparedStatement pstat = con.prepareStatement(sqlQuery1);
		
		    pstat.setString(1, "12345");
		    pstat.setString(2, "2024-10-10");
		    pstat.setString(3, "Sleeper");
		    
		    int rows = pstat.executeUpdate();
		    
		    if(rows==0)
		    {
		    	throw new RuntimeException("Seats NOT available for Booking!!!");
		    }
		    else
		    {
		    	IO.println("Seat is Locked for Booking");
		        Savepoint sp = con.setSavepoint();
		    }
		    PreparedStatement pstat2 = con.prepareStatement(sqlQuery2);
		    pstat2.setString(1, "B101");
		    pstat2.setString(2, "12345");
		    pstat2.setString(3, "C123");
		    pstat2.setInt(4, 1);
		    pstat2.setString(5, "Payement Pending");
		    
		    int rows2 = pstat2.executeUpdate();
		    if(rows2==0)
		    {
		    	throw new RuntimeException("Booking record NOT created");
		    }
		    else
		    {
		    	IO.println("Booking Record created \nAwaiting for Payement Confirmation!!!");
		    }
		    
		    PreparedStatement pstat3 = con.prepareStatement(sqlQuery3);
		    pstat3.setString(1, "C123");
		    ResultSet rs = pstat3.executeQuery();
		    String status = "Failed";
		    if(rs.next())
		    {
		    	  status=rs.getString(1);
		    	
		      	if(status.equals("Failed"))
		      	{
		    		 throw new RuntimeException("Transaction Failed");
		     	 }
		      	else
		       	{
		    		PreparedStatement pstat4 = con.prepareStatement(sqlQuery4);
		    		pstat4.setString(1, "C123");
		    		int rows3 = pstat4.executeUpdate();
		    		if(rows3==0)
		    		{
		    			throw new RuntimeException("Transaction Failed at Payment portal");
		    		}
		    		else
		    		{
		    		IO.println("Ticket Succesfully Booked!!!");
		    		con.commit();
		    		}
		    		
		       	}
		    
		      
		    }
		    else
		    {
		    	  IO.println("Transaction Failed");
		    }
		}
	
		
		      	
		catch(Exception e)
		{
			e.printStackTrace();
		}
}

	public static void main(String[] args) 
	{
		JdbcPro9 obj = new JdbcPro9();
		obj.meth1();

	}

}
