package com.stream_api.limit_skip;

import java.util.Arrays;
import java.util.List;

public class PrintTop3ScorerStudents {

	public static void main(String[] args) 
	{
		List<Student> list = Arrays.asList(new Student(101,"Aabed",95),new Student(102,"Rahil",90),new Student(105,"Tejes",80),new Student(106,"Asef",92),new Student(201,"Lalit",85));
		
		list.stream()
		  .sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks()))
		   .limit(3)
		   .forEach(IO::println);

	}

}
