package com.aabed.ArrayList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

class Student implements Serializable
{
	
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		Integer id = Integer.valueOf(IO.readln("Enter student id : "));
		String name = IO.readln("Enter student name : ");
		Double fees = Double.valueOf(IO.readln("Enter Fees : "));
		LocalDate today = LocalDate.now();
		
		return new Student(id,name,fees,today);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
}

public class StoreObject 
{
	public static void main(String[] args)  
	{
		int noOfStudents = Integer.parseInt(IO.readln("Enter Number of students you want to store : "));
		
		ArrayList<Student> listOfStudents = new ArrayList<>(noOfStudents);

		IO.println("Enter student details");
		for(int i=0; i<noOfStudents; i++)
		{
			listOfStudents.add(Student.getStudentObject());
		}
	
		try 
		{
			String path = "C:\\student\\students.txt";
			FileOutputStream  fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listOfStudents);
			IO.println("Student Object stored successfuly.");
			fos.close();
			oos.close();
		}
		catch(Exception e)
		{
		   e.printStackTrace();	
		}
		
	}

}
