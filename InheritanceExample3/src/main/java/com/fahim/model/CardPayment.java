package com.fahim.model;

import javax.persistence.Entity;

@Entity
public class CardPayment extends Payment {

	private long cardNumber;
	private String cardType;
	private int ccv;
	private int expiryMonth;
	private int expiryYear;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCcv() {
		return ccv;
	}
	public void setCcv(int ccv) {
		this.ccv = ccv;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public String toString() {
		return "CardPayment [cardNumber=" + cardNumber + ", cardType=" + cardType + ", ccv=" + ccv + ", expiryMonth="
				+ expiryMonth + ", expiryYear=" + expiryYear + "]";
	}
	public CardPayment(long cardNumber, String cardType, int ccv, int expiryMonth, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.ccv = ccv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	public CardPayment() {
		super();
	}
	
	
}
