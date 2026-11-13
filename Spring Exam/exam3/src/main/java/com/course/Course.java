package com.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.course")
public class Course 
{
	@Autowired
	@Qualifier("java")
    CourseFeeService courseFeeService;
    
	public void joinCourse()
	{
		courseFeeService.calculateFee();
	}
    
}
