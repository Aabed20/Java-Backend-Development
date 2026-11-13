package com.database;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.database")
@Profile("development")
public class DevelopmnetDatabase extends DatabaseService 
{
	@Override
	public void database() 
	{
		System.out.println("Connected to Development database");

	}

}
