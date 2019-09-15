
package com.fahim.model;

import javax.persistence.Entity;

@Entity
public class ChequePayment extends Payment {
	private String chequeType;
	private int chequeNumber;
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public int getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeType=" + chequeType + ", chequeNumber=" + chequeNumber + "]";
	}
	public ChequePayment(String chequeType, int chequeNumber) {
		super();
		this.chequeType = chequeType;
		this.chequeNumber = chequeNumber;
	}
	public ChequePayment() {
		super();
	}
	

}
