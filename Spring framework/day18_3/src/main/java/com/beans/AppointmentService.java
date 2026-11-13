package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("resources/application.properties")
public class AppointmentService 
{
	
	private Doctor doctor;
	
	private Patient patient;
	
	private AppointmentNotificationService service; 

	private int appointmentDuration;

    private boolean notification;
	
	private String hospitalName;
	
	private String location;
	
	public AppointmentService(
		@Autowired	AppointmentNotificationService service,
		@Autowired  Doctor doctor,
		@Autowired	Patient patient,
		@Value("${appointment.duration}") int appointmentDuration,
		@Value("${appointment.notification.enabled}") boolean notification,
		@Value("${hospital.name}") String hospitalName,
		@Value("${hospital.location}") String location) 
	  {
		this.service=service;
		this.doctor=doctor;
		this.patient=patient;
		this.appointmentDuration=appointmentDuration;
		this.notification=notification;
		this.hospitalName=hospitalName;
		this.location=location;
	  }

	public void takeAppointment()
	{
		System.out.println("Hospital Name : "+this.hospitalName);
		System.out.println("Location : "+this.location);
		System.out.println("Appointment duration : "+this.appointmentDuration);
		System.out.println("\n"+this.doctor);
		System.out.println("\n"+this.patient);
		System.out.println(service.sendNotification(this.notification));
		
	}
    
}
