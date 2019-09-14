package com.fahim.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.Person;
import com.fahim.util.HibernateUtil;

public class PersonDao {

	public void saveOrUpdatePerson(Person person) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
		transaction = session.beginTransaction();
		session.saveOrUpdate(person);
		transaction.commit();
		session.close();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	public Person getPerson(Person person) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Person.class,person.getEmail());
		}
	}
	
}
