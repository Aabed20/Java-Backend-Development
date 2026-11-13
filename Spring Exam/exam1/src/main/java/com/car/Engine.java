package com.car;

public class Engine
{

private int engineNumber;
private String engineType;

public Engine()
{}

public int getEngineNumber() {
	return engineNumber;
}

public void setEngineNumber(int engineNumber) {
	this.engineNumber = engineNumber;
}

public String getEngineType() {
	return engineType;
}

public void setEngineType(String engineType) {
	this.engineType = engineType;
}

@Override
public String toString() {
	return "Engine [engineNumber=" + engineNumber + ", engineType=" + engineType + "]";
}


}
