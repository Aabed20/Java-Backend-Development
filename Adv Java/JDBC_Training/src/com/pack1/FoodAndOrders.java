package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FoodAndOrders
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
	
	void displayAllFoodItems()
	{
		try
		{
			Connection con = connect();
			Statement stat = con.createStatement(1005,1008);
			ResultSet rs = stat.executeQuery("select * from food");
			IO.println("-------------Food Item-------------");
			while(rs.next())
			{
				IO.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2)+"   Price : "+rs.getInt(3));
			}
			
			PreparedStatement pstat = con.prepareStatement("insert into orders values(?,?,?,?)");
			int id = Integer.parseInt(IO.readln("\nEnter food Id : "));
			int quantity = 0;
			int totalPrice = 0;
			int price = 0;
			boolean itemFound = false;
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					quantity = Integer.parseInt(IO.readln("Enter Quantity : "));
					itemFound = true;
					 price=rs.getInt(3);
					totalPrice=price*quantity;
					IO.println("\nItem Name : "+rs.getString(2)+"  Quantity : "+quantity+" Total price : "+totalPrice);
					break;
				}
			}
			if(itemFound) {
			int orderId = Integer.parseInt(IO.readln("\nEnter Order Id : "));
			
		//	int orderId = (int)(Math.random()*10+10000);
			pstat.setInt(1, orderId);
			pstat.setInt(2, id);
			pstat.setInt(3, quantity);
			pstat.setInt(4, totalPrice);
			
			int orderInserted = pstat.executeUpdate();
			if(orderInserted>0)
			{
				IO.println("Order Placed Successfully!!!");
			}
			}
			else
			{
				IO.println("Enter Valid Food id : ");
			}
			String choice = IO.readln("Want to see All the Orders [yes/no] : " );
			if(choice.equalsIgnoreCase("yes"))
			{
			Statement stat2 = con.createStatement();
			ResultSet rs2 = stat2.executeQuery("select * from orders");
			IO.println("------------Order Details---------");
			while(rs2.next())
			{
				IO.println("Order id : "+rs2.getInt(1)+"   Food Id : "+rs2.getInt(2)+"   Quantity : "+rs2.getInt(3)+"   Total Price : "+rs2.getInt(4));
			}
			}
			else
			{
				IO.println("Thank you for Coming!!!");
			}
			
		}
		catch(RuntimeException e)
		{
			IO.println(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		FoodAndOrders obj = new FoodAndOrders();
		obj.displayAllFoodItems();
	}

}
