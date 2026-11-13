package com.beans;

public class AppointmentNotificationService 
{

	public String sendNotification(boolean value)
	{
		if(value)
		{
			return "Appointment notifications has send ";
		}
		return "Appointment notification are disabled";
	}
}
