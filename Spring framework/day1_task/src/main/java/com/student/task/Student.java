package com.student.task;

public class Student
{
	private int rollNo;
	private String name;
	private String course;
	
	public Student() {}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public int getRollNo()
	{
		return this.rollNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
