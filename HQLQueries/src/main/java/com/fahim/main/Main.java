package com.fahim.main;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.fahim.model.User;
import com.fahim.model.User2;
import com.fahim.util.HibernateUtil;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		for(int i=1;i<6;i++) {
			User user = new User();
			user.setName("User"+i); 
			session.saveOrUpdate(user);
		}
		
		for(int i=6;i<11;i++) {
			User2 user = new User2();
			user.setId(i);
			user.setName("User"+i); 
			session.saveOrUpdate(user);
		}
		
		Query<String> query = session.createQuery("select name from Dummy123");
		List<String> listOfUsers = query.list();
		
		
		for(String user:listOfUsers) {
			System.out.println(user);
		}
		
	
		
		Query<Integer> deleteQuery = session.createQuery("delete from Dummy123 where id=:id");
		deleteQuery.setParameter("id", 3);
		deleteQuery.executeUpdate();
		
		
		  Query<User> insertQuery =session.createQuery("insert into Dummy123(id,name) "
		  		+ "select dd.id,dd.name from Dummy12345 dd");
		  insertQuery.executeUpdate();
		 
		
		Query<Object> updateQuery = session.createQuery("update Dummy123 set name='Danny' where id=1");
		updateQuery.executeUpdate();
		
		Query<String> selectQuery = session.createQuery("select name from Dummy123");
		List<String> listOfUsers1 = selectQuery.list();
		
		System.out.println("insert query");
		
		transaction.commit();
		session.close();
		System.out.println("update query");
		for(String user:listOfUsers1) {
			System.out.println(user);
		}
		
	}
}
