package com.smart_home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SmartHomeCotroller
{
	@Autowired
	@Qualifier("google")
 	VoiceAssistant voiceAssistant;
 	
 	public void displayData()
 	{
 		System.out.println(voiceAssistant);
 		voiceAssistant.giveCommand();
 	}

}
