package com.online_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LearningPlatform 
{
	@Autowired
	LearningContent video;
	
	@Autowired
	@Qualifier("live")
	LearningContent live;
	
	@Autowired
	@Qualifier("recorded")
	LearningContent recorded;
	
	public void display()
	{
		video.startLearningThrough();
		live.startLearningThrough();
		recorded.startLearningThrough();
	}

}
