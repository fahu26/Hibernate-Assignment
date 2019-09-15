package com.fahim.main;

import org.hibernate.Session;

import com.fahim.model.User;
import com.fahim.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		//session.beginTransaction();
		User user = new User();
		//Object is in transient State
		user.setName("John"); 
		
		//Object is in persistent State
		session.save(user);
//update values gets saved without calling save, as object is in persitent state so it keeps tracks of the changes
		user.setName("jimmy");
		session.beginTransaction().commit();
		session.close();
        
		//Object is in detached State
		user.setName("dummy");

	}

}
