package com.pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPro13 
{
	String driver ="oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUName = "AABED";
	String dPwd = "PATHAN";
	
	String query1 = "insert into mydata2 values(?,?)";
	String query2 = "select file_data from mydata2 where id=?";
	
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
	
	void meth1()
	{
		IO.println("Passing file to a database...");
	
		try
		{
			Connection con = connect();
			IO.println("Connection created..");
			PreparedStatement pstat = con.prepareStatement(query1);
			pstat.setString(1, "101");
			pstat.setClob(2, new FileReader("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\ARRAY_ DAY_1.txt"));
			int rowCount = pstat.executeUpdate();
			if(rowCount==0)
				throw new SQLException("File not inserted");
			else
			IO.println("File inserted!!!!");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void meth2()
	{
		IO.println("Retrieving the file from the Database");
		
		try
		{
			Connection con = connect();
			IO.println("Database connected Successfully!!!\n");
			PreparedStatement pstat = con.prepareStatement(query2);
			pstat.setString(1, "101");
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				Clob b = rs.getClob(1);
				Reader data = b.getCharacterStream();
				BufferedReader br = new BufferedReader(data);
				FileWriter fw = new FileWriter("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\ARRAY_Copied.txt");
				String line;
				while((line=br.readLine())!=null)
				{
					fw.write(line);
				}
				br.close();
				fw.close();
				IO.println("Clob data Retrieved");
			}
			else
			{
				throw new SQLException("Invalid Id");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) 
	{
		JdbcPro13 obj = new JdbcPro13();
		//obj.meth1();
        obj.meth2();
	}

}
