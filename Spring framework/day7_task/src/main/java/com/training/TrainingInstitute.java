package com.training;

import java.util.Vector;

public class TrainingInstitute
{

private Vector<Course> courses;

public TrainingInstitute(Vector<Course> courses) {
	super();
	this.courses = courses;
}

public Vector<Course> getCourses() {
	return courses;
}

public void setCourses(Vector<Course> courses) {
	this.courses = courses;
}

@Override
public String toString() {
	return "TrainingInstitute [courses=" + courses + "]";
}

}
