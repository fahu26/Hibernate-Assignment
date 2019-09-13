package com.fahim.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
@Entity
public class BankAccount {
	@Id
	private long accountId;
	private String accountHolderName;
	private double accountBalance;
	@Column
	private LocalDateTime accountOpeningDate;
	@Column(name="accountType")
	@Enumerated(EnumType.STRING)
	private BankAccountType accountType;
	

	public BankAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(BankAccountType accountType) {
		this.accountType = accountType;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public LocalDateTime getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(LocalDateTime accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + ", accountOpeningDate=" + accountOpeningDate + ", accountType=" + accountType + "]";
	}
	public BankAccount(long accountId, String accountHolderName, double accountBalance,
			LocalDateTime accountOpeningDate, BankAccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountOpeningDate = accountOpeningDate;
		this.accountType = accountType;
	}
	
	
	
}
