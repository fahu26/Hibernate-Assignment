package com.fahim.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.BankAccount;
import com.fahim.util.HibernateUtil;

public class BankDao {

	public void saveOrUpdateAccount(BankAccount account) {
		Transaction transaction =null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.saveOrUpdate(account);
			transaction.commit();
			session.close();
		}
		catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}

	public BankAccount getbankAccount(long id){
		BankAccount accountDetails = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			accountDetails = session.get(BankAccount.class, id);
		}
		return accountDetails;
	}

	public void deleteBankAccount(long id) {
		Transaction transaction =null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			BankAccount account = session.get(BankAccount.class, id);
			session.delete(account);
			transaction.commit();
			session.close();
		}
		catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
}
