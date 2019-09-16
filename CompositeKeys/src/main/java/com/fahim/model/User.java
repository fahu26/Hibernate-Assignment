package com.fahim.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "Dummy12")
public class User {
@EmbeddedId
	UserId userId;
public UserId getUserId() {
	return userId;
}
public void setUserId(UserId userId) {
	this.userId = userId;
}
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
