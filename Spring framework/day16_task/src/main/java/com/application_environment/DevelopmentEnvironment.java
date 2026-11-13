package com.application_environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("dev")
public class DevelopmentEnvironment 
{
	public void displayEnvironment()
	{
		System.out.println("Development Environment");
	}

}
