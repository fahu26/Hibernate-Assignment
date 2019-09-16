package com.fahim.main;

import com.fahim.dao.BookDao;
import com.fahim.model.Author;
import com.fahim.model.Book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao bookDao = new BookDao();
		Book book = new Book();
		book.setBookTitle("Once upon a time");
		book.setBookPrice(200.00);
		
		Author author = new Author();
		author.setAuthorName("Mike");
		author.setAuthorContact(7894562455L);
		author.setAuthorEmail("abcd@email.com");
		
		Book book1 = new Book();
		book1.setBookTitle("Once upon a time again");
		book1.setBookPrice(150.00);
		
		Author author1 = new Author();
		author1.setAuthorName("John");
		author1.setAuthorContact(66461616961L);
		author1.setAuthorEmail("edfr@email.com");
		author1.setAuthorId(2);
		author.setAuthorId(1);
		
		book1.setAuthor(author1);
		book.setAuthor(author);
		bookDao.saveOrUpdateData(book);
		bookDao.saveOrUpdateData(book1);
		book1.setBookTitle("nothing is just everything");
		bookDao.saveOrUpdateData(book1);
		System.out.println("detaikls--->"+bookDao.getData(book1));
		System.out.println("detaikls--->"+bookDao.getData(book));
		bookDao.deleteData(book1);
		System.out.println("After delete");
		System.out.println(bookDao.getData(book));
		System.out.println(bookDao.getData(book));
		
	}

}
