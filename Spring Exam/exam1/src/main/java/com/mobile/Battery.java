package com.mobile;

public class Battery
{

private int batteryCapacity;
private String batteryType;

public Battery()
{}

public int getBatteryCapacity() {
	return batteryCapacity;
}

public void setBatteryCapacity(int batterCapacity) {
	this.batteryCapacity = batterCapacity;
}

public String getBatteryType() {
	return batteryType;
}

public void setBatteryType(String batteryType) {
	this.batteryType = batteryType;
}

@Override
public String toString() {
	return "Battery [batteryCapacity=" + batteryCapacity + ", batteryType=" + batteryType + "]";
}


}
