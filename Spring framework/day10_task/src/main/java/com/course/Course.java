package com.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/course/course.properties")
public class Course
{
 private int courseId;
 private String courseName;
 private String instructor;
 private int duration;
 private double fees;
 
 public Course()
 {}

 public int getCourseId() {
	return courseId;
 }

 @Value("${id}")
 public void setCourseId(int courseId) {
	this.courseId = courseId;
 }

 public String getCourseName() {
	return courseName;
 }

 @Value("${name}")
 public void setCourseName(String courseName) {
	this.courseName = courseName;
 }

 public String getInstructor() {
	return instructor;
 }

 @Value("${instructor}")
 public void setInstructor(String instructor) {
	this.instructor = instructor;
 }

 public int getDuration() {
	return duration;
 }

 @Value("${duration}")
 public void setDuration(int duration) {
	this.duration = duration;
 }

 public double getFees() {
	return fees;
 }

 @Value("${fees}")
 public void setFees(double fees) {
	this.fees = fees;
 }

 @Override
 public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor + ", duration="
			+ duration + "months , fees=" + fees + "]";
 }
 
}
