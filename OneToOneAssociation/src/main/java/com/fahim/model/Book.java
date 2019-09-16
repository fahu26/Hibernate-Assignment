package com.fahim.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Book {
@Id @GeneratedValue
private long isbn;
private String bookTitle;
private double bookPrice;
@JoinColumn(name = "author")
@OneToOne(cascade = CascadeType.ALL)
private Author author;
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", author=" + author + "]";
}


}
