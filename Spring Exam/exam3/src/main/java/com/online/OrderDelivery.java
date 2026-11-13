package com.online;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.online")
public class OrderDelivery 
{
	@Autowired
	@Qualifier("express")
	DeliveryService deliveryService;
	
	public void deliver()
	{
		deliveryService.deliverOrder();
	}

}
