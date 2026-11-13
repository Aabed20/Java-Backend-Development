package com.anymatch_allmatch.nonematch;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllStudentsPassed
{
	public static void main(String[] args)
	{
		List<Student> list = Arrays.asList(new Student(101, "Aabed", 95),new Student(102, "pathan", 90),new Student(103, "Tejes", 75),new Student(104, "Asef", 85));
		
		boolean allPassed = list.stream()
		 .allMatch(e -> e.getMarks()>=35);
		
		IO.print(allPassed);
	}

}
