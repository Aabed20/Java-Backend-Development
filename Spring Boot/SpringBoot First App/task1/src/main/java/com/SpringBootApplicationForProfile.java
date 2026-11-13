package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.components.Student;
import com.components.University;

@SpringBootApplication
@EnableConfigurationProperties(Student.class)
public class SpringBootApplicationForProfile 
{
	@Autowired
	Environment environment;
	
	@Bean
	public University university()
	{
		University university = new University();
		
		university.setNameOfUniverity(environment.getProperty("university.name"));
		university.setAddressOfUniversity(environment.getProperty("university.address"));
		university.setUniversityCode(Integer.parseInt(environment.getProperty("university.code")));
		
		return university;
	}

	public static void main(String[] args) 
	{
		ApplicationContext context =
				SpringApplication.run(SpringBootApplicationForProfile.class);
		
		Student bean = context.getBean(Student.class);
		
		Character grade = bean.calculateGrade();
		
		if(!(grade=='F'))
		{
		  System.out.println("Grade is : "+grade);
		  double totalMarks = bean.calculateTotalMarks();
		  if(!(totalMarks<1))
			{
			System.out.println("Total Marks is : "+totalMarks);
			}
		}
		else
		{
			System.out.println("Please take admission first");
		}

	}

}
