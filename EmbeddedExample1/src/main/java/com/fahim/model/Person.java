package com.fahim.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
private String name;
private int age;
@Id
private String email;
private long contact;
@Embedded
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", email=" + email + ", contact=" + contact + ", address="
			+ address + "]";
}
public Person(String name, int age, String email, long contact, Address address) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.contact = contact;
	this.address = address;
}
public Person() {
	super();
}

}
