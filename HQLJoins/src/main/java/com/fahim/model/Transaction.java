package com.fahim.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="Transaction")
@Embeddable
public class Transaction implements Serializable{
private static final long serialVersionUID = 1L;
@Id
private String transactionId;
private LocalDate transactionDate;
private double transactionAmount;
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
public LocalDate getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(LocalDate transactionDate) {
	this.transactionDate = transactionDate;
}
public double getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(double transactionAmount) {
	this.transactionAmount = transactionAmount;
}
@Override
public String toString() {
	return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
			+ ", transactionAmount=" + transactionAmount+"]";
}
public Transaction(String transactionId, LocalDate transactionDate, double transactionAmount) {
	super();
	this.transactionId = transactionId;
	this.transactionDate = transactionDate;
	this.transactionAmount = transactionAmount;
}



}
