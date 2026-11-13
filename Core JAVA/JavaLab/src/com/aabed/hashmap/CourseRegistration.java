package com.aabed.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseRegistration 
{
	public static void main(String[] args) 
	{
		HashMap<String,List<String>> listOfStudents = new HashMap<>(); 

		
		while(true)
		{
			IO.println("--- Course Registration Menu ---\n"
					+ "1. Register student to course\n"
					+ "2. View course-wise student list\n"
					+ "3. Remove student from course\n"
					+ "4. Exit");
			int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
			switch(choice)
			{
			case 1 ->
			{
				String courseName = IO.readln("Enter course name: ");
				String studentName = IO.readln("Enter student name: ");
				
				listOfStudents.computeIfAbsent(courseName, k -> new ArrayList<>()).add(studentName);
				if(listOfStudents.get(courseName).contains(studentName))
				IO.println(studentName+" registered to "+courseName+"\n");
				else
					IO.println(studentName+" not registered\n");
			}
			case 2 ->
			{
				listOfStudents.forEach((k,v)-> IO.println(k+" => "+v));
				IO.println();
			}
			case 3 ->
			{
				String courseName = IO.readln("Enter course name : ");
				String studentName = IO.readln("Enter student name to remove : ");
				
				listOfStudents.computeIfPresent(courseName, (k,v) -> new ArrayList<>()).remove(studentName);
				if(!listOfStudents.get(courseName).contains(studentName))
					IO.println(studentName+" has removed from "+courseName+"\n");
					else
						IO.println(studentName+" not removed\n");
			}
			case 4 ->
			{
				IO.println("Exiting Course Registration System.");
				System.exit(0);
			}
			
				
			}
		}
	}

}









