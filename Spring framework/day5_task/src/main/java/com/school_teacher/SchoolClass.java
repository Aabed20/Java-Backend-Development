package com.school_teacher;

public class SchoolClass
{
	private String className;
	private String section;
	private Teacher teacher;
	
	public SchoolClass() {}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "SchoolClass [className=" + className + ", section=" + section + ", teacher=" + teacher + "]";
	}
	
	
	

}
