package com.encapsulation;

public class Student
{
	private String name;
	private int rollNumber;
	private int age;
	
	public Student() {}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		if(name!=null&&!name.isEmpty())
		{
		this.name=name;
		}
	}
	
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber)
	{
		if(rollNumber>0)
		{
		this.rollNumber=rollNumber;
		}
	}
	
   public int getAge()
   {
	   return this.age;
   }
   
   public void setAge(int age)
   {
	   if(age>0)
	   {
	   this.age = age;
	   }   
   }
}
