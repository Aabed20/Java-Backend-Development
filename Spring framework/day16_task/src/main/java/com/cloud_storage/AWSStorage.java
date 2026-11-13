package com.cloud_storage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("aws")
public class AWSStorage 
{
   public void activeStorage()
   {
	   System.out.println("AWS Storage is Active");
   }

}
