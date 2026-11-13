package com.smart_agriculture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IrrigationController 
{
	@Autowired
	IrrigationSystem drip;
	
	@Autowired
	@Qualifier("rain")
	IrrigationSystem rain;
	
	@Autowired
	@Qualifier("sprinkler")
	IrrigationSystem sprinkler;
	
	public void display()
	{
		drip.doIrrigation();
		rain.doIrrigation();
		sprinkler.doIrrigation();
	}

}
