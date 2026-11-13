package com.laptop;

public class Laptop
{
 private int laptopId;
 private String brand;
 private Processor processor;
 
 public Laptop()
 {}

 public int getLaptopId() {
	return laptopId;
 }

 public void setLaptopId(int laptopId) {
	this.laptopId = laptopId;
 }

 public String getBrand() {
	return brand;
 }

 public void setBrand(String brand) {
	this.brand = brand;
 }

 public Processor getProcessor() {
	return processor;
 }

 public void setProcessor(Processor processor) {
	this.processor = processor;
 }

 @Override
 public String toString() {
	return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", processor=" + processor + "]";
 }
 

}
