package com.fahim.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity(name="Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerContact;
	@ElementCollection
	@JoinColumn(name="customer_id")
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Collection<Transaction> transactions = new ArrayList<Transaction>();
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
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Collection<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(Collection<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerContact=" + customerContact + ", transactions=" + transactions + "]";
	}
	
	

}
