package com.smart_agriculture;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rain")
public class RainWaterIrrigation implements IrrigationSystem 
{
	@Override
	public void doIrrigation() 
	{
		System.out.println("Rain Water Irrigation");
		
	}

}
