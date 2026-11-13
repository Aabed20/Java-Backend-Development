package com.aabed.lambda_expression;

import java.util.function.Consumer;

record Student(Integer id, String name,String course) {}


public class StudentNotification 
{

	public static void main(String[] args)
	{
	
		Consumer<Student> c1 = student ->
		{
			IO.println("Hello "+student.name()+"! Welcome to the "+student.course()+" course.");
		};
		int noOfStudents = Integer.parseInt(IO.readln("Enter number of students : "));
		
		for(int i=1; i<=noOfStudents; i++)
		{
			IO.println("Enter details for Student "+i+" :");
			Integer id = Integer.valueOf(IO.readln("Enter ID : "));
			String name = IO.readln("Enter Name : ");
			String course = IO.readln("Enter Course : ");
			
			Student s1 = new Student(id,name,course);
			c1.accept(s1);
			IO.println();
		}

	}

}
