package com.car.task;

public class Car
{
	private int carId;
	private String model;
	private double price;
	
	public Car(int carId,String model,double price)
	{
		this.carId = carId;
		this.model = model;
		this.price = price;
	}

	public int getCarId()
	{
		return this.carId;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void display()
	{
		System.out.println("Car Details :\nCar Id : "+this.carId);
		System.out.println("Model : "+this.model);
		System.out.println("Price : "+this.price);
	}
}
