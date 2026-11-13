package com.smart_agriculture;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sprinkler")
public class SprinklerIrrigation implements IrrigationSystem 
{
	@Override
	public void doIrrigation() 
	{
		System.out.println("Sprinkler Irrigation");

	}

}
