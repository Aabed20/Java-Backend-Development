package com.bank;

public class BankAccount
{
 private int accountNumber;
 private String accountType;
 private Customer customer;
 
 public BankAccount() {}

 public int getAccountNumber() {
	return accountNumber;
 }

 public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
 }

 public String getAccountType() {
	return accountType;
 }

 public void setAccountType(String accountType) {
	this.accountType = accountType;
 }

 public Customer getCustomer() {
	return customer;
 }

 public void setCustomer(Customer customer) {
	this.customer = customer;
 }

 @Override
 public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customer=" + customer
			+ "]";
 }
 
 
	
}
