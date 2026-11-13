package com.course;

import java.util.Set;

public class Course
{
  private int courseId;
  private String courseName;
  private String trainerName;
  Set<String> topics;
  public Course(int courseId, String courseName, String trainerName) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.trainerName = trainerName;
  }
  public int getCourseId() {
	return courseId;
  }
  public void setCourseId(int courseId) {
	this.courseId = courseId;
  }
  public String getCourseName() {
	return courseName;
  }
  public void setCourseName(String courseName) {
	this.courseName = courseName;
  }
  public String getTrainerName() {
	return trainerName;
  }
  public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
  }
  public Set<String> getTopics() {
	return topics;
  }
  public void setTopics(Set<String> topics) {
	this.topics = topics;
  }
  @Override
  public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName + ", topics="
			+ topics + "]";
  }
	
}
