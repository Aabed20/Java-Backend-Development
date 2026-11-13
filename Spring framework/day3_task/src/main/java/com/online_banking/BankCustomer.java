package com.online_banking;

public class BankCustomer
{

	private int customerId;
	private String customerName;
	private String accountType;
	private String branchName;
	
	public BankCustomer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerId=" + customerId + ", customerName=" + customerName + ", accountType="
				+ accountType + ", branchName=" + branchName + "]";
	}
	
	
	
}
