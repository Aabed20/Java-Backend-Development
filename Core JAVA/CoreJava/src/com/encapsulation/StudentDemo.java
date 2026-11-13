package com.encapsulation;

public class StudentDemo
{
	public static void main(String[] args)
	{
		Student s = new Student();
		
		s.setAge(21);
		s.setName("Aabed Pathan");
		s.setRollNumber(24);
		
		IO.println("Student Details : \nName : "+s.getName()+"\nRoll Number : "+s.getRollNumber()+"\nAge : "+s.getAge());

	}

}
