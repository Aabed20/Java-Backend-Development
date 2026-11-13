package com.employee;

import java.util.List;

public class Employee
{
	private int empId;
	private String empName;
	private String designation;
	private Manager manager;
	private List<Project> projects;
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", manager="
				+ manager + ", projects=" + projects + "]";
	}

}
