package com.cloud_storage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("azure")
public class AzureStorage 
{
	public void activeStorage()
	   {
		   System.out.println("Azure Storage is Active");
	   }

}
