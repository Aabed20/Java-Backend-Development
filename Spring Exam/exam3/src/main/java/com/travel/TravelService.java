package com.travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.travel")
public class TravelService 
{
	@Autowired
	@Qualifier("bus")
	FareService fareService;
	
	public void travel()
	{
		fareService.calculatefare();
	}

}
