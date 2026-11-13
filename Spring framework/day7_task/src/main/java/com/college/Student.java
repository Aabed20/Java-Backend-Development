package com.college;

public class Student
{

 private Integer studentId;
 private String studentName;
 private String course;
 private Double marks;
 
 public Student() {}

 public Integer getStudentId() {
	return studentId;
 }

 public void setStudentId(Integer studentId) {
	this.studentId = studentId;
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

 public Double getMarks() {
	return marks;
 }

 public void setMarks(Double marks) {
	this.marks = marks;
 }

 @Override
 public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", marks="
			+ marks + "]";
 }
 
 
 
}
