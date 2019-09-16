package com.fahim.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fahim.model.Student;
import com.fahim.util.HibernateUtil;

public class StudentDao {

public void saveOrUpdateData(Object obj) {
	Transaction transactions = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	transactions=session.beginTransaction();
	session.saveOrUpdate(obj);
	transactions.commit();
	session.close();
	} catch (Exception e) {
		if(transactions != null)
			transactions.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
}

public Student getDetails(Student student){
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
		return session.get(Student.class, student.getStudentId());
	}
}


public void deleteData(Student student) {
	Transaction transactions = null;
	try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	transactions=session.beginTransaction();
	session.delete(student);
	transactions.commit();
	session.close();
	} catch (Exception e) {
		if(transactions != null)
			transactions.rollback();
		e.printStackTrace();
	}
}

}
