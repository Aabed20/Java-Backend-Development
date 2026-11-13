package com.database_environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("oracle")
public class OracleDatabase 
{
	public void connect()
	{
		System.out.println("Oracle Database connected");
	}

}
