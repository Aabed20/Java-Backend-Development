package com.aabed.stream_api;

import java.util.ArrayList;

record Student(String name, double score, String status )
{}

public class FindTopper
{
	public static void main(String[] args)
	{
		ArrayList<Student> listofStudents = new ArrayList<>();
		
		listofStudents.add(new Student("Scott",80,"PASS"));
		listofStudents.add(new Student("Smith",82,"PASS"));
		listofStudents.add(new Student("Ford",70,"PASS"));
		listofStudents.add(new Student("Alen",85,"PASS"));
		listofStudents.add(new Student("Miller",30,"FAIL"));
		listofStudents.add(new Student("Steve",60,"PASS"));
		
		IO.println("Top Passing Students :");
		listofStudents.stream()
		   .filter(stu ->  stu.status().equals("PASS") && stu.score()>75)
		   .forEach(stu -> IO.println(stu.name()));
	}
}
