package com.online_learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VideoCourse implements LearningContent
{
	@Override
	public void startLearningThrough() 
	{
		System.out.println("Learn through Video Course");

	}

}
