package com.fahim.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.Payment;
import com.fahim.util.HibernateUtil;

public class PaymentDao {

public void saveData(Payment payment) {
	Transaction transaction = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	transaction =  session.beginTransaction();
	session.saveOrUpdate(payment);
	transaction.commit();
	session.close();

	} catch (Exception e) {
		if(transaction !=null)
			transaction.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}

public Payment getPaymentData(Payment payment)
{
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		return session.get(Payment.class, payment.getPaymentId());
	}
}
}
