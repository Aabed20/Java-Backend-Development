package com.day1.springcore2;

public class Student 
{
	private int rollNumber;
	private String studentName;
	private String course;
	
	public Student()
	{}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void displayStudent()
	{
		System.out.println("Student RollNumber : "+this.rollNumber);
		System.out.println("Student Name : "+this.studentName);
		System.out.println("Course : "+this.course);
	}

}
