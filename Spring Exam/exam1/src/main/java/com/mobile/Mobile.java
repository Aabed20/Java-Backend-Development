package com.mobile;

public class Mobile
{

private String mobileName;
private Battery battery;

public Mobile() {}

public String getMobileName() {
	return mobileName;
}

public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}

public Battery getBattery() {
	return battery;
}

public void setBattery(Battery battery) {
	this.battery = battery;
}

@Override
public String toString() {
	return "Mobile [mobileName=" + mobileName + ", battery=" + battery + "]";
}


}
