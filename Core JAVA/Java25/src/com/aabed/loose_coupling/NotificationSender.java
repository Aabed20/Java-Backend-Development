package com.aabed.loose_coupling;

interface Notification 
{
    void sendMessage(String message);
}
class EmailNotification implements Notification
{

	@Override
	public void sendMessage(String message)
	{
	  IO.println("Sending Email : "+message);
	}
	
}
class SMSNotification implements Notification
{

	@Override
	public void sendMessage(String message)
	{
	  IO.println("Sending SMS : "+message);
	}
	
}
class WhatsAppNotification implements Notification
{

	@Override
	public void sendMessage(String message)
	{
	  IO.println("Sending WhatsApp Message : "+message);
	}
	
}

class NotificationService
{
	String messages;
	
	
	public NotificationService(String messages) {
		super();
		this.messages = messages;
	}


	public Notification notifyUser(String messageType)
	{
		if(messageType.equalsIgnoreCase("email"))
		{
			return new EmailNotification();
		}
		else if(messageType.equalsIgnoreCase("sms"))
		{
			return new SMSNotification();
		}
		else if(messageType.equalsIgnoreCase("whatsapp"))
		{
			return new WhatsAppNotification();
		}
		else
		{
			IO.println("Invalid message type");
			System.exit(0);
			return null;
		}
	}
}
public class NotificationSender
{
	public static void main(String[] args)
	{
		String s = IO.readln("Enter which type of message you want to send : \n1.Email\n2.SMS\n3.WhatsApp\n");
		NotificationService notification = new NotificationService(s);
		
		
		Notification n1 = notification.notifyUser(s);
		String msg = IO.readln("Enter Your "+s+" message : ");
		n1.sendMessage(msg);

	}

}
