package com.day1.springcore4;

public class ToyCar 
{
	private int toyCarId;
	private String toyCarBrand;
	private Motor motor;
	
	public ToyCar() {}

	public ToyCar(int toyCarId, String toyCarBrand, Motor motor) {
		super();
		this.toyCarId = toyCarId;
		this.toyCarBrand = toyCarBrand;
		this.motor = motor;
	}

	public int getToyCarId() {
		return toyCarId;
	}

	public void setToyCarId(int toyCarId) {
		this.toyCarId = toyCarId;
	}

	public String getToyCarBrand() {
		return toyCarBrand;
	}

	public void setToyCarBrand(String toyCarBrand) {
		this.toyCarBrand = toyCarBrand;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "ToyCar [toyCarId=" + toyCarId + ", toyCarBrand=" + toyCarBrand + ", motor=" + motor + "]";
	}
	
	

}
