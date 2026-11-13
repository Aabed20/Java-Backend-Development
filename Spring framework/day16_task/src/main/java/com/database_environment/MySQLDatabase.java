package com.database_environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mysql")
public class MySQLDatabase 
{
	public void connect()
	{
		System.out.println("MYSQL database connected");
	}

}
