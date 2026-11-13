package com.smart_agriculture;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DripIrrigation implements IrrigationSystem 
{
	@Override
	public void doIrrigation() 
	{
		System.out.println("Drip Irrigation");

	}

}
