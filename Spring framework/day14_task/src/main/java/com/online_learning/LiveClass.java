package com.online_learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("live")
public class LiveClass implements LearningContent 
{
	@Override
	public void startLearningThrough() 
	{
		System.out.println("Learn through Live Class");

	}

}
