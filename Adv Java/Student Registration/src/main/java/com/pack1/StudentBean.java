package com.pack1;

import java.io.Serializable;

public class StudentBean implements Serializable
{

	private static final long serialVersionUID = 1L;
private	String id, name,email,course,city;

public StudentBean()
{
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


}
