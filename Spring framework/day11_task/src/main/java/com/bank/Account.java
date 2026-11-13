package com.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account
{
 private long accountnumber;
 private String accountHolderName;
 private String accountType;
 private double balance;
 private String branch;
 private String ifscCode;
                     
 public Account(@Value("${number}") long accountnumber, @Value("${name}") String accountHolderName, 
		@Value("${type}") String accountType,@Value("${balance}") double balance,
	  @Value("${branch}") String branch,@Value("${code}") String ifscCode) {
	super();
	this.accountnumber = accountnumber;
	this.accountHolderName = accountHolderName;
	this.accountType = accountType;
	this.balance = balance;
	this.branch = branch;
	this.ifscCode = ifscCode;
 }
 public long getAccountnumber() {
	return accountnumber;
 }
 public void setAccountnumber(long accountnumber) {
	this.accountnumber = accountnumber;
 }
 public String getAccountHolderName() {
	return accountHolderName;
 }
 public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
 }
 public String getAccountType() {
	return accountType;
 }
 public void setAccountType(String accountType) {
	this.accountType = accountType;
 }
 public double getBalance() {
	return balance;
 }
 public void setBalance(double balance) {
	this.balance = balance;
 }
 public String getBranch() {
	return branch;
 }
 public void setBranch(String branch) {
	this.branch = branch;
 }
 public String getIfscCode() {
	return ifscCode;
 }
 public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
 }
 @Override
 public String toString() {
	return "Account [accountnumber=" + accountnumber + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", balance=" + balance + ", branch=" + branch + ", ifscCode=" + ifscCode + "]";
 }

}
