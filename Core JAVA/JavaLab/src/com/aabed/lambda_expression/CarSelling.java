package com.aabed.lambda_expression;

import java.util.function.Predicate;

public class CarSelling 
{

	public static void main(String[] args) 
	{
		String brand = IO.readln("Enter the brand name of the Car : ");
		Double price = Double.parseDouble(IO.readln("Enter the price of the Car : "));
		Integer mileage = Integer.parseInt(IO.readln("Enter the mileage of the Car : "));
		Car car = new Car(brand,price,mileage);
		
		Predicate<Car> p1 = car1 -> car1.price()<=500000&&car1.mileage()>=20;
		
		if(p1.test(car))
		{
			IO.println(car.brand()+" is eligible for sale");
		}
		else
		{
			IO.println(car.brand()+" is not eligible for sale");
		}

	}

}
