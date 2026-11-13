package com.aabed.jdbc_lab_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Employee 
{
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

  static String driver ="oracle.jdbc.OracleDriver";
	static String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	static String dbUName = "AABED";
	static String dPwd = "PATHAN";
	
	static Connection connect()
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

	public static void main(String[] args)
	{
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		
		try
		{
			Connection con = connect();
			PreparedStatement pstat = con.prepareStatement("select * from employee1 ");
			
			ResultSet rs = pstat.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				double salary = rs.getDouble(4);
				listOfEmployees.add(new Employee(id,name,age,salary));
			}
			listOfEmployees.forEach((e)->{
				if(e.getAge()>25)
				{
					IO.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
				}
			});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
