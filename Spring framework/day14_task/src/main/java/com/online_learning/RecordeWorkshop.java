package com.online_learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("recorded")
public class RecordeWorkshop implements LearningContent 
{
	@Override
	public void startLearningThrough() 
	{
		System.out.println("Learn Through Recorded Workshop");

	}

}
