package com.stream.api;

public class Employee
{
 private int id;
 private String name;
 private double salary;
 private int daysWorked;
 
 public Employee(int id, String name, double salary, int daysWorked) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.daysWorked = daysWorked;
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
 public double getSalary() {
	return salary;
 }
 public void setSalary(double salary) {
	this.salary = salary;
 }
 public int getDaysWorked() {
	return daysWorked;
 }
 public void setDaysWorked(int daysWorked) {
	this.daysWorked = daysWorked;
 }
 @Override
 public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", daysWorked=" + daysWorked + "]";
 }
 
	
}
