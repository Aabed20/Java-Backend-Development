package com.aabed.lambda_expression;

import java.util.function.Function;

record Product(Integer id,String name,Double price) {}



public class CalculateProductDiscount 
{
	public static void main(String[] args)
	{
		Integer id = Integer.valueOf(IO.readln("Enter Product Id : "));
        String name = IO.readln("Enter Product Name : ");
        Double price = Double.valueOf(IO.readln("Enter Product Price : "));
        
        Function<Product,Double> f1 = p1 -> 
        {
        	if(p1.price()>=5000)
        	{
        		return p1.price()-p1.price()*0.1;
        	}
        	else if(p1.price()<5000)
        	{
        		return p1.price()-p1.price()*0.05;
        	}
        	else
        	{
        		return p1.price();
        	}
        };
        Product p = new Product(id,name,price);
        
        IO.println("Final price of the product is : "+f1.apply(p));
	}

}
