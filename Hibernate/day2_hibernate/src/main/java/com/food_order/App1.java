package com.food_order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 
{
	public static void main(String[] args) 
	{
		Configuration cnf = new Configuration();
		
		cnf.configure("com/food_order/hibernate-cnf.xml");
		
		SessionFactory factory = cnf.buildSessionFactory();
		
		FoodOrder food = new FoodOrder();
		
		food.setOrderId(12345678l);
		
	   
	    food.setCustomerName("Aabed Pathan");
	    food.setCustomerMobileNumber(7558665939l);
	    food.setItemName("Chicken Biryani");
	    food.setItemPrice(250);
	    food.setItemQuantity(1);
	    food.setRestaurantName("Pista House");
	    food.setDeliveryAddress("Ameerpet, hyderbad");
	    food.setPaymentMode("Cash On Delivery");
	    food.setStatus("Order is on the way");
	    food.setTotalAmount(275);
	    
	    Session session = factory.openSession();
	    
	    Transaction transaction = session.beginTransaction();
	    
	    session.persist(food);
	    
	    transaction.commit();
	    
	    session.close();
	    Session session2 = factory.openSession();
	    
	    FoodOrder order = session2.get(FoodOrder.class, 12345678);
	    
	    System.out.println(order);
	    
	   session2.close();
	    

	}

}
