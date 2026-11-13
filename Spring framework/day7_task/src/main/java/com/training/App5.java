package com.training;

import java.util.Collections;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/training/application-context.xml");

		TrainingInstitute bean = context.getBean("trainingInstitute", TrainingInstitute.class);
		
		System.out.println(bean);
		
		Vector<Course> co = bean.getCourses();
		
		Collections.sort(co,(a,b)->Double.compare(b.getFees(), a.getFees()));
		System.out.println("Course with highest fees : "+co.get(0));
		
	}

}
