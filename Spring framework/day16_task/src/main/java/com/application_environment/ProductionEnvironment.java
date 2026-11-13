package com.application_environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("prod")
public class ProductionEnvironment 
{
	public void displayEnvironment()
	{
		System.out.println("Production Environment");
	}
}
