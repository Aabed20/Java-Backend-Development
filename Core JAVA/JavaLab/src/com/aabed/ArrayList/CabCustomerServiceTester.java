package com.aabed.ArrayList;

import java.util.ArrayList;

record Customer(int custId, String customerName,String pickupLocation, String dropLocation,int distance, String phone) 
{
     public Customer
     {
    	 if(custId<=0)
    	 {
    		 throw new IllegalArgumentException("Validation Error: Customer ID must be positive");
    	 }
    	 if(customerName==null||customerName.isBlank())
    	 {
    		 throw new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");
    	 }
    	 if(pickupLocation==null||pickupLocation.isBlank())
    	 {
    		 throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");
    	 }
    	 if(dropLocation==null||dropLocation.isBlank())
    	 {
    		 throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
    	 }
    	 if(distance<=0)
    	 {
    		 throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
    		 
    	 }
    	 if(phone.length()!=10)
    	 {
    		 throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
    	 }
     }
	
}

class CustomerService
{
	private ArrayList<Customer> customers;
	
	public CustomerService()
	{
		this.customers= new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	private boolean isFirstCustomer(Customer customer)
	{
		boolean flag = true;
		for(int i=0; i<customers.size(); i++)
		{
			if(customer.phone().equals(customers.get(i).phone()))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public double calculateBill(Customer customer)
	{
		double totalAmount=0.0;
		if(isFirstCustomer(customer))
		{
			 totalAmount = 0.0;
		}
		else if(customer.distance()<=4)
			{
				totalAmount = 80.0;
			}
		else 
			{
			   totalAmount = (double)(customer.distance()-4)*6+80;
			}
		
		return totalAmount;
	}
	
	public void payBill(Customer customer)
	{
		IO.println(customer.customerName()+" Please pay your bill of Rs."+calculateBill(customer));
	}
	
}
public class CabCustomerServiceTester 
{
	public static void main(String[] args)
	{
		int size = Integer.parseInt(IO.readln());
		CustomerService customerservices = new CustomerService();
		for(int i=0; i<size; i++)
		{
		try
		{
			int id = Integer.parseInt(IO.readln());
			String name = IO.readln();
			String pick = IO.readln();
			String drop = IO.readln();
			int dist = Integer.parseInt(IO.readln());
			String ph = IO.readln();
		//Customer c1 = new Customer(101,"Aabed","Ameerpet","Hightech City",4,"7558665939");
		//Customer c2 = new Customer(102,"Pathan","Ampt","Hightech City",6,"7558665939");
		Customer c1 = new Customer(id,name,pick,drop,dist,ph);
			customerservices.payBill(c1);
			customerservices.addCustomer(c1);
			//customerservices.payBill(c1);
			//customerservices.addCustomer(c2);
		}
		catch(IllegalArgumentException e)
		{
			IO.println(e.getMessage());
		}
		}
	}

}
