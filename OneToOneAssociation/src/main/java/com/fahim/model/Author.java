package com.fahim.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Author extends Book {
//@Id 
private int authorId;
private String authorName;
private long authorContact;
private String authorEmail;
@JoinColumn(name="book_id")
@OneToOne(cascade =CascadeType.ALL)
private Book book;
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public long getAuthorContact() {
	return authorContact;
}
public void setAuthorContact(long authorContact) {
	this.authorContact = authorContact;
}
public String getAuthorEmail() {
	return authorEmail;
}
public void setAuthorEmail(String authorEmail) {
	this.authorEmail = authorEmail;
}
@Override
public String toString() {
	return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorContact=" + authorContact
			+ ", authorEmail=" + authorEmail + ", book=" + book + "]";
}

}
