package com.school_teacher;

public class Teacher
{
 private String teacherName;
 private String subject;
 
 public Teacher() {}

 public String getTeacherName() {
	return teacherName;
 }

 public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
 }

 public String getSubject() {
	return subject;
 }

 public void setSubject(String subject) {
	this.subject = subject;
 }

 @Override
 public String toString() {
	return "Teacher [teacherName=" + teacherName + ", subject=" + subject + "]";
 }
 
 
	
}
