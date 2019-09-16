package com.fahim.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.User;
import com.fahim.model.UserId;
import com.fahim.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = new User();
		user.setName("John"); 
		
		UserId id = new UserId("john", "Mulley");
		user.setUserId(id);
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(user);
		transaction.commit();
		session.close();
		

	}

}
