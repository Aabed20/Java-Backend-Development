package com.aabed.method_overriding;

class Vehicle
{
	public int fuelCapacity()
	{
		return 40;
	}	
	
	public void printTankCapacity()
	{
		System.out.println(this.fuelCapacity());
	}
}
class Car extends Vehicle
{
	@Override
	public int fuelCapacity()
	{
		return 18;
	}
        public void printTankCapacity()
	{
		System.out.println(super.fuelCapacity());
	}	
}

public class Test
{

	public static void main(String[] args)
	{
		Vehicle v1 = new Car();
		v1.printTankCapacity();

	}

}
