package com.smart_home;

import org.springframework.stereotype.Component;

@Component("alexa")
public class AlexaAssistant implements VoiceAssistant 
{
	@Override
	public void giveCommand()
	{
		System.out.println("Alexa Assistant Switched On Smart Light");

	}
	public String toString()
	{
		
		return "VoiceAssistant = Alexa";
	}

}
