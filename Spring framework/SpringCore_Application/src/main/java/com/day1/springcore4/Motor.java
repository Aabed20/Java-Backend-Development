package com.day1.springcore4;

public class Motor 
{
	private int motorId;
	private String motorType;
	
	public Motor() {}

	public Motor(int motorId, String motorType) {
		super();
		this.motorId = motorId;
		this.motorType = motorType;
	}

	public int getMotorId() {
		return motorId;
	}

	public void setMotorId(int motorId) {
		this.motorId = motorId;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	@Override
	public String toString() {
		return "Motor [motorId=" + motorId + ", motorType=" + motorType + "]";
	}

	
}
