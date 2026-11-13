package com.cab;

public class Cab
{
 private int cabId;
 private String driverName;
 private String cabType;
 private int ratePerKm;
 public Cab() {
	super();
 }
 public int getCabId() {
	return cabId;
 }
 public void setCabId(int cabId) {
	this.cabId = cabId;
 }
 public String getDriverName() {
	return driverName;
 }
 public void setDriverName(String driverName) {
	this.driverName = driverName;
 }
 public String getCabType() {
	return cabType;
 }
 public void setCabType(String cabType) {
	this.cabType = cabType;
 }
 public int getRatePerKm() {
	return ratePerKm;
 }
 public void setRatePerKm(int ratePerKm) {
	this.ratePerKm = ratePerKm;
 }
 @Override
 public String toString() {
	return "Cab [cabId=" + cabId + ", driverName=" + driverName + ", cabType=" + cabType + ", ratePerKm=" + ratePerKm
			+ "]";
 }
 
}
