package com.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager
{
  NotificationService notificationService;
  
  public NotificationManager() {}

  public NotificationService getNotificationService() {
	return notificationService;
  }

  @Autowired
  @Qualifier("smsNotification")
  public void setNotificationService(NotificationService notificationService) {
	this.notificationService = notificationService;
  }
  
  
}
