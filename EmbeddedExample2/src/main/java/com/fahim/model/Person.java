package com.fahim.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Person {
private String name;
private int age;
@Id
private String email;
private long contact;

@ElementCollection
@GenericGenerator(name="inc-gen",strategy = "increment")
@JoinTable(name="Person_Addresses",joinColumns = @JoinColumn(name="Person_Id"))
@CollectionId (columns = {@Column(name="Address_id")},generator ="inc-gen" ,type=@Type(type="long"))
private Collection<Address> address = new ArrayList<Address>();

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", email=" + email + ", contact=" + contact + ", address="
			+ address + "]";
}
public Person(String name, int age, String email, long contact, Collection<Address> address) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.contact = contact;
	this.address = address;
}
public Collection<Address> getAddress() {
	return address;
}
public void setAddress(Collection<Address> address) {
	this.address = address;
}
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

public Person() {
	super();
}

}
