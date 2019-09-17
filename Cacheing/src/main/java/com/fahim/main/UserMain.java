package com.fahim.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.fahim.model.Users123;
import com.fahim.util.HibernateUtil;

public class UserMain {
public static void main(String args[]) {
/*level one Cache starts*/
 Transaction transactions = null;
   Session session = HibernateUtil.getSessionFactory().openSession();
    transactions = session.beginTransaction();
	System.out.println(session.get(Users123.class, 1));
	Query<Users123> query = session.createQuery("from Users123");
	query.setCacheable(true);
	query.list();
	transactions.commit();
	session.close();
	transactions = null;
	/* level one cache ends*/
	
	/*level two Cache starts*/
	   Session session1 = HibernateUtil.getSessionFactory().openSession();
	   transactions = session1.beginTransaction();
	   System.out.println("new session");
		System.out.println(session1.get(Users123.class, 1));
		Query<Users123> query1 = session1.createQuery("from Users123");
		query1.setCacheable(true);
		query1.list();
		transactions.commit();
		session1.close();
		/* level one cache ends*/
}
}
