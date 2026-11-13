package com.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("com/bank/bank.properties")
public class BankAccount
{
 private int accountNumber;
 private String accountHolderName;
 private String accountType;
 private String bankName;
 private double minimumBalance;
 
 public BankAccount()
 {}

 public int getAccountNumber() {
	return accountNumber;
 }

 @Value("${accountNumber}")
 public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
 }

 public String getAccountHolderName() {
	return accountHolderName;
 }

 @Value("${name}")
 public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
 }


 public String getAccountType() {
	return accountType;
 }
 
 @Value("${type}")
 public void setAccountType(String accountType) {
	this.accountType = accountType;
 }

 public String getBankName() {
	return bankName;
 }

 @Value("${bank}")
 public void setBankName(String bankName) {
	this.bankName = bankName;
 }

 public double getMinimumBalance() {
	return minimumBalance;
 }

 @Value("${balance}")
 public void setMinimumBalance(double minimumBalance) {
	this.minimumBalance = minimumBalance;
 }

 @Override
 public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", bankName=" + bankName + ", minimumBalance=" + minimumBalance + "]";
 }	
	
}
