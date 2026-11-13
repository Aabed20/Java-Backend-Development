package com.stream_api.flatmap;

import java.util.List;

public class Department
{
	private String DepartementName;
	private List<Employee> e;
	
	
	public Department(String departementName, List<Employee> e) {
		super();
		DepartementName = departementName;
		this.e = e;
	}
	public String getDepartementName() {
		return DepartementName;
	}
	public void setDepartementName(String departementName) {
		DepartementName = departementName;
	}
	public List<Employee> getE() {
		return e;
	}
	public void setE(List<Employee> e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [DepartementName=" + DepartementName + ", e=" + e + "]";
	}
	
	
	
	
}