package com.aabed.Equals_Method;

import java.util.Objects;

public class ProductEquality 
{

	public static void main(String[] args) 
	{
		Product p1 = new Product(101,"Laptop");
		Product p2 = new Product(101,"Laptop");
		IO.println("The two objects data are same : "+p1.equals(p2));
        Employee e1 = new Employee(101,"Aabed");
        IO.println("The two objects data are same : "+p1.equals(e1));
	}

}

class Product
{
	private int productId;
	private String productName;
	
	public Product(int productId, String productName)
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public int hashCode() 
	{
		return this.productId;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Product)
		{
			Product p = (Product) obj;
			return this.productId==p.productId&&this.productName.equals(p.productName);
		}
		else
		{
			IO.println("Objects cannnot be compared");
			return false;
		}
	}	
}

class Employee
{
  private int id;
  private String name;
  
  public Employee(int id, String name)
  {
	super();
	this.id = id;
	this.name = name;
  }

  public int getId() {
	return id;
  }

  public String getName() {
	return name;
  }

  public void setId(int id) {
	this.id = id;
  }

  public void setName(String name) {
	this.name = name;
  }
  
  
  
}
