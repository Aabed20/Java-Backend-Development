package com.online;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("python")
public class PythonMentor implements Mentor 
{
	@Value("PythonFullStack")
	private String course;
	@Override
	public void message()
	{
		System.out.println("Python mentor says learn python & Django");
		
	}
	public String toString()
    {
    	return this.course+"\nMentor = Python Mentor";
    }

}
