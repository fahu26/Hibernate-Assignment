package com.fahim.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private String street;
private String city;
private String state;
private String postalCode;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
@Override
public String toString() {
	return "Account [street=" + street + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
}
public Address(String street, String city, String state, String postalCode) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;
}
public Address() {
	// TODO Auto-generated constructor stub
}

}
