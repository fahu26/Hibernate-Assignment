package com.fahim.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Payment_Type")
public class Payment {
@Id @GeneratedValue
private int paymentId;
@Column
private LocalDate paymentDate;
private double paymentAmount;
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public LocalDate getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(LocalDate paymentDate) {
	this.paymentDate = paymentDate;
}
public double getPaymentAmount() {
	return paymentAmount;
}
public void setPaymentAmount(double paymentAmount) {
	this.paymentAmount = paymentAmount;
}
@Override
public String toString() {
	return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount
			+ "]";
}
public Payment() {
	super();
}
public Payment(int paymentId, LocalDate paymentDate, double paymentAmount) {
	super();
	this.paymentId = paymentId;
	this.paymentDate = paymentDate;
	this.paymentAmount = paymentAmount;
}


}
