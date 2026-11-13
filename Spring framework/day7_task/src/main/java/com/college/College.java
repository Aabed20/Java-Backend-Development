package com.college;

import java.util.List;

public class College
{
	private List<Student> listOfStudents;
	
	public College() {}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	@Override
	public String toString() {
		return "College [listOfStudents=" + listOfStudents + "]";
	}
	
	

}
