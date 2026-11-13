package com.smart_home;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class SmartHome
{
 private List<String> devices;
 private Vector<String> suppordtedModes;
 private Set<String> rooms;
 private Map<String,String> deviceLocations;
 
 public SmartHome()
 {}

 public List<String> getDevices() {
	return devices;
 }

 public void setDevices(List<String> devices) {
	this.devices = devices;
 }

 public Vector<String> getSuppordtedModes() {
	return suppordtedModes;
 }

 public void setSuppordtedModes(Vector<String> suppordtedModes) {
	this.suppordtedModes = suppordtedModes;
 }

 public Set<String> getRooms() {
	return rooms;
 }

 public void setRooms(Set<String> rooms) {
	this.rooms = rooms;
 }

 public Map<String, String> getDeviceLocations() {
	return deviceLocations;
 }

 public void setDeviceLocations(Map<String, String> deviceLocations) {
	this.deviceLocations = deviceLocations;
 }

 @Override
 public String toString() {
	return "SmartHome [devices=" + devices + ", suppordtedModes=" + suppordtedModes + ", rooms=" + rooms
			+ ", deviceLocations=" + deviceLocations + "]";
 }
 
 
	 
	
}
