package com.fahim.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.Book;
import com.fahim.util.HibernateUtil;

public class BookDao {
Transaction transaction =null;

public void saveOrUpdateData(Book book) {
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		transaction = session.beginTransaction();
		session.saveOrUpdate(book);
		transaction.commit();
		session.close();
		transaction=null;
	} catch (Exception e) {
		if(transaction != null)
			transaction.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}

public Book getData(Book book) {
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		return session.get(Book.class,book.getIsbn());
	}
}

public void deleteData(Book book) {
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		transaction = session.beginTransaction();
		session.delete(book);
		transaction.commit();
		session.close();
		transaction=null;
	}
	catch (Exception e) {
		if(transaction !=null)
			transaction.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}
}
