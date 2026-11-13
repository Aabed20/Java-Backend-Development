package com.company;

import java.util.Set;

public class Company
{
 private Set<Employee> listOfEmployees;
 
 public Company() {}

 public Set<Employee> getListOfEmployees() {
	return listOfEmployees;
 }

 public void setListOfEmployees(Set<Employee> listOfEmployees) {
	this.listOfEmployees = listOfEmployees;
 }

 @Override
 public String toString() {
	return "Company [listOfEmployees=" + listOfEmployees + "]";
 }
 
 
	
}
