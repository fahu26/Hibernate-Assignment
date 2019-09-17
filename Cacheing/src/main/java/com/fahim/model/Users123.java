package com.fahim.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity(name="users123")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Users123 {
@Id @GeneratedValue
private int id;
private String name;
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Users123 [id=" + id + ", name=" + name + "]";
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
