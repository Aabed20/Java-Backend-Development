package com.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix="student")
public class Student 
{
	private int id;
	
	private String name;
	
	private String branch;
	
	private List<String> subjects;
	
	private List<Double> marks;
	
	private boolean admission;
	
	@Autowired
	private University university;
	
	public Student() {}

	public Student(int id, String name, String branch, List<String> subjects, List<Double> marks, boolean admission) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subjects = subjects;
		this.marks = marks;
		this.admission = admission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Double> getMarks() {
		return marks;
	}

	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}

	public boolean isAdmission() {
		return admission;
	}

	public void setAdmission(boolean admission) {
		this.admission = admission;
	}
	
	public Character calculateGrade()
	{
		double totalMarks=this.calculateTotalMarks();
		if(totalMarks<200)
		{
			System.out.println("You have not taken admission");
			return 'F';
		}
		double average=totalMarks/this.marks.size();
		
		if(this.admission)
		{
			
			if(average>=90&&average<100)
			{
				return 'A';
			}
			else if(average>70&&average<90)
			{
				return 'B';
			}
			else
			{
				return 'C';
			}
			
		}
		else
		{
			System.out.println("You have not taken admission");
			return ' ';
		}
	}
	
	public double calculateTotalMarks()
	{
		if(this.admission)
		{
		
		Double total = marks.stream()
			     	 .reduce(0.0,(a,b)->a+b);
		return total;
		}
		
		return 0.0;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", subjects=" + subjects + ", marks="
				+ marks + ", admission=" + admission + ", university=" + university + "]";
	}

	

}
