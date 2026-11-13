package com.railway;

import java.util.*;

public class RailwayCoach
{
 private List<String> passengers;
 private Vector<String> facilities;
 private Set<String> reservedSeats;
 private LinkedHashSet<String> coachTypes;
 private Map<String,String> seatPassengers;
	
 public RailwayCoach()
 {}

 public List<String> getPassengers() {
	return passengers;
 }

 public void setPassengers(List<String> passengers) {
	this.passengers = passengers;
 }

 public Vector<String> getFacilities() {
	return facilities;
 }

 public void setFacilities(Vector<String> facilities) {
	this.facilities = facilities;
 }

 public Set<String> getReservedSeats() {
	return reservedSeats;
 }

 public void setReservedSeats(Set<String> reservedSeats) {
	this.reservedSeats = reservedSeats;
 }

 public LinkedHashSet<String> getCoachTypes() {
	return coachTypes;
 }

 public void setCoachTypes(LinkedHashSet<String> coachTypes) {
	this.coachTypes = coachTypes;
 }

 public Map<String, String> getSeatPassengers() {
	return seatPassengers;
 }

 public void setSeatPassengers(Map<String, String> seatPassengers) {
	this.seatPassengers = seatPassengers;
 }

 @Override
 public String toString() {
	return "RailwayCoach [passengers=" + passengers + ", facilities=" + facilities + ", reservedSeats=" + reservedSeats
			+ ", coachTypes=" + coachTypes + ", seatPassengers=" + seatPassengers + "]";
 }
	
}
