package com.cloud_storage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("google")
public class GoogleCloudeStorage
{
	public void activeStorage()
	   {
		   System.out.println("Google Cloud Storage is Active");
	   }

}
