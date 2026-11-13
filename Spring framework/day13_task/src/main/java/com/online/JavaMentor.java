package com.online;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaMentor implements Mentor 
{  
	@Value("JavaFullStack")
	private String course;
	@Override
	public void message() 
	{
		System.out.println("Java Mentor said learn the core Java , Adv Java & SpringBoot to become Java Developer");

	}
	
    public String toString()
    {
    	return this.course+"\nMentor = Java Mentor";
    }
}
