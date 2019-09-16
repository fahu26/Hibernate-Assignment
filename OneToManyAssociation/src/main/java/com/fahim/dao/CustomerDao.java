package com.fahim.dao;

import java.util.List;

import org.hibernate.Session;

import com.fahim.model.Customer;
import com.fahim.util.HibernateUtil;

public class CustomerDao {
	org.hibernate.Transaction transactions = null;
public void saveOrUpdateData(Customer customer) {
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	transactions=session.beginTransaction();
	session.saveOrUpdate(customer);
	transactions.commit();
	session.close();
	} catch (Exception e) {
		if(transactions != null)
			transactions.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}

public Customer getDetails(Customer customer){
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		return session.get(Customer.class, customer.getCustomerId());
	}
}


public void deleteData(Customer customer) {
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	transactions=session.beginTransaction();
	session.delete(customer);
	transactions.commit();
	session.close();
	} catch (Exception e) {
		if(transactions != null)
			transactions.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}

}
