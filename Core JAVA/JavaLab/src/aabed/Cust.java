package aabed;

class Customer
{
	private String name;
	private int id;

	public Customer(String name , int id) 
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)   //setter
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return this.id;
	}
}

public class Cust
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer c = new Customer("Ravi",2);

                m1(c);   
		
		//GC [Write Here How many objects are eligible for GC]

		System.out.println(c.getId());
	}

	public static void m1(Customer cust) 
	{
		cust.setId(5);

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());
	}
} 
