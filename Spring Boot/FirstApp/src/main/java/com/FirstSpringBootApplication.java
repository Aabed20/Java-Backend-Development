package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.component.Chip;
import com.component.Robot;

@SpringBootApplication
public class FirstSpringBootApplication 
{
	@Autowired
	private Environment env;
	
	@Bean
	public Chip chip()
	{
		Chip chip = new Chip();
		chip.setChipId((env.getProperty("chipId",int.class)));
		chip.setChipColor(env.getProperty("chipColor"));
		chip.setActivated(env.getProperty("isActivated",boolean.class));
		return chip;
	}
	
	public static void main(String[] args) 
	{
		 ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class);
		 
		 Robot bean = context.getBean(Robot.class);
		 
		 System.out.println(bean);
		 
		 Chip chip = context.getBean(Chip.class);
		 
		 System.out.println(chip);
	}
}
