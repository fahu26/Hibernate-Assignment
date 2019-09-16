package com.fahim.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity(name="Transaction")
@Embeddable
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable = false)
private String transactionId;
private LocalDate transactionDate;
private double transactionAmount;
@ManyToOne
private Customer customer;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
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
			+ ", transactionAmount=" + transactionAmount + ", customer=" + customer + "]";
}

}
