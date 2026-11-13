package com.employee;

public class Manager
{
 private int managerId;
 private String managerName;
 public Manager(int managerId, String managerName) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
 }
 public int getManagerId() {
	return managerId;
 }
 public void setManagerId(int managerId) {
	this.managerId = managerId;
 }
 public String getManagerName() {
	return managerName;
 }
 public void setManagerName(String managerName) {
	this.managerName = managerName;
 }
 @Override
 public String toString() {
	return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
 }
 
	
}
