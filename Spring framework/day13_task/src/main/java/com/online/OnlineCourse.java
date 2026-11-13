package com.online;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("com.online")
public class OnlineCourse 
{   
	@Autowired
	@Qualifier("java")
	Mentor mentor;
	private String courseName;
	
    public void displayData()
    {
    	System.out.println(mentor);
    	mentor.message();
    	
    }
}
