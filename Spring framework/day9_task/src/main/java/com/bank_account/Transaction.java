package com.bank_account;

import java.util.Objects;

public class Transaction
{
private int transactionId;
private String transactionType;
private double amount;

public Transaction() {}

public int getTransactionId() {
	return transactionId;
}

public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}

public String getTransactionType() {
	return transactionType;
}

public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

@Override
public int hashCode() {
	return Objects.hash(amount, transactionId, transactionType);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Transaction other = (Transaction) obj;
	return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
			&& transactionId == other.transactionId && Objects.equals(transactionType, other.transactionType);
}

@Override
public String toString() {
	return "Transaction [transactionId=" + transactionId + ", transactionType=" + transactionType + ", amount=" + amount
			+ "]";
}

}
