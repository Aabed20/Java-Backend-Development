package com.aabed.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class StudentDataManagement
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> listOfStudents = new HashMap<>();
		 
		listOfStudents.put("Ravishankar", 99);
		listOfStudents.put("Puja", 89);
		listOfStudents.put("Elina", 99);
		listOfStudents.put("Aryan", 98);
		while(true)
		{
		IO.println("------ Student Management Menu ------\n"
				+ "1. Add Student\n"
				+ "2. Update Marks\n"
				+ "3. Delete Student\n"
				+ "4. Search Student\n"
				+ "5. Display All Students\n"
				+ "6. Show Topper\n"
				+ "7. Show Lowest Scorer\n"
				+ "8. Show Total and Average Marks\n"
				+ "9. Exit\n");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
		
		switch(choice)
		{
		case 1 ->
		{
			String name = IO.readln("Enter Student name : ");
			int marks = Integer.parseInt(IO.readln("Enter Marks : "));
			
			if(listOfStudents.containsKey(name)) {
				IO.println("Student already exists.\n");
			}
			else {
				
				listOfStudents.putIfAbsent(name, marks);
				IO.println("Student added succesfully!\n");
		       }
			}
		
		case 2->
		{
			String name = IO.readln("Enter student name to update the marks : ");
			int marks = Integer.parseInt(IO.readln("Enter new Marks : "));
			if(listOfStudents.containsKey(name))
			{
				listOfStudents.put(name, marks);
				IO.println("Marks Updated.\n");
			}
			else
			{
				IO.println("Student not found.\n");
			}
		}
		case 3 ->
		{
			String name = IO.readln("Enter student name to delete: ");
			if(listOfStudents.containsKey(name))
			{
				listOfStudents.remove(name);
				IO.println("Student deleted.\n");
			}
			else
			{
				IO.println("Student not found.\n");
			}
		}
		case 4 ->
		{
			String name = IO.readln("Enter student name to search: ");
			if(listOfStudents.containsKey(name))
			{
				IO.println(name+" Scored "+listOfStudents.get(name)+"\n");
			}
			else
				IO.println(name+" student not available.\n");
		}
		case 5 ->
		{
			IO.println("---- Student Records ----");
			listOfStudents.forEach((k,v) -> IO.println(k+" : "+v));
			IO.println();
		}
		case 6 ->
		{
			int max = Collections.max(listOfStudents.values());
			for(Entry<String, Integer> entry:listOfStudents.entrySet())
			{
				if(entry.getValue()==max)
				{
					IO.println("Topper : "+entry.getKey()+" = "+entry.getValue()+"\n");
					break;
				}
			}
		}
		case 7 ->
		{
			int min = Collections.min(listOfStudents.values());
			for(Entry<String, Integer> entry:listOfStudents.entrySet())
			{
				if(entry.getValue()==min)
				{
					IO.println("Lowest Scorer : "+entry.getKey()+" = "+entry.getValue()+"\n");
					break;
				}
			}
		}
		case 8 ->
		{
			int totalMarks = 0;
			for(int mark :listOfStudents.values())
			{
				totalMarks += mark;
			}
			IO.println("Total Marks : "+totalMarks);
			IO.println("Average Marks : "+(double)totalMarks/listOfStudents.size()+"\n");
		}
		case 9 ->
		{
			IO.println("Exiting... Thank you!");
			System.exit(0);
		}
		}
		
		}
	}

}
