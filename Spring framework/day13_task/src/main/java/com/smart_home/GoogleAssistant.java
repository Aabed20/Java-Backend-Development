package com.smart_home;

import org.springframework.stereotype.Component;

@Component("google")
public class GoogleAssistant implements VoiceAssistant
{
	@Override
	public void giveCommand()
	{
		System.out.println("Google Assistant Switched On Smart Light");

	}
	
	public String toString()
	{
		
		return "VoiceAssistant = Google";
	}

}
