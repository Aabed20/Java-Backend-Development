package com.mobile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/mobile/mobile.properties")
public class MobilePhone
{
 private String brand;
 private String model;
 private double price;
 private String operatingSystem;
 private String storage;
 
 public MobilePhone() {}

 public String getBrand()
 {
	return brand;
 }
@Value("${brand}")
 public void setBrand(String brand)
 {
	this.brand = brand;
 }

 public String getModel()
 {
	return model;
 }
@Value("${model}")
 public void setModel(String model) {
	this.model = model;
 }

 public double getPrice() {
	return price;
 }
@Value("${price}")
 public void setPrice(double price) {
	this.price = price;
 }

 public String getOperatingSystem() {
	return operatingSystem;
 }

 @Value("${operatingSystem}")
 public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
 }

 public String getStorage() {
	return storage;
 }
@Value("${storage}")
 public void setStorage(String storage) {
	this.storage = storage;
 }

 @Override
 public String toString() {
	return "MobilePhone [brand=" + brand + ", model=" + model + ", price=" + price + ", operatingSystem="
			+ operatingSystem + ", storage=" + storage + "]";
 }

}
