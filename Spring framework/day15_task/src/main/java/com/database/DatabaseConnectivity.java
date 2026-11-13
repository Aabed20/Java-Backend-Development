package com.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectivity 
{
	@Autowired
	DatabaseService databaseService;
	
	public void connect()
	{
		databaseService.database();
	}

}
