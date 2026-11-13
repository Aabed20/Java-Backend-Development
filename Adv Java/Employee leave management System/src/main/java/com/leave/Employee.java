package com.leave;

public class Employee 
{
	int id;
	String name;
	String type;
	String sdate;
	String edate;
	String status;
	
	public Employee() {}
     
	public String toString()
	{
		return id+" "+name+" "+type+" "+sdate+" "+edate+" "+status;
	}
}
