package com.fahim.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.Student;
import com.fahim.util.HibernateUtil;

public class StudentDao {
public void saveStudent(Student student) {
	Transaction transaction = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
	}
	catch (Exception e) {
		if(transaction != null) {
         transaction.rollback();			
		}
		e.printStackTrace();
		// TODO: handle exception
	}
}

	
	  public Student getStudentList(){ 
		  Student details;
		  try(Session session = HibernateUtil.getSessionFactory().openSession()){ 
			  details = session.get(Student.class,2); 
	}
		  return details;
	  }
	 
}
