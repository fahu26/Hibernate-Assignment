package com.fahim.main;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.fahim.model.Customer;
import com.fahim.model.Transaction;
import com.fahim.util.HibernateUtil;

public class CustomerMain {
public static void main(String args[]) {
 org.hibernate.Transaction transactions = null;
   Session session = HibernateUtil.getSessionFactory().openSession();
    transactions = session.beginTransaction();
	Customer customer = new Customer();
	customer.setCustomerId(10);
	customer.setCustomerName("john");
	customer.setCustomerContact(515464131L);
	customer.setCustomerEmail("assfs@email.com");
	
	Transaction transaction1 = new Transaction("AB123456", LocalDate.of(2018, 10, 30), 500000.00);
	Transaction transaction2 = new Transaction("CD123456", LocalDate.of(2018, 2, 20), 400.00);
	Transaction transaction3 = new Transaction("EF123456", LocalDate.of(2018, 8, 26), 10000.00);
	Transaction transaction4 = new Transaction("GH123456", LocalDate.of(2018, 5, 2), 100.00);
	Transaction transaction5 = new Transaction("IJ123456", LocalDate.of(2018, 11, 18), 1500.00);
	
	List<Transaction> list = new ArrayList<Transaction>();
	list.add(transaction1);
	list.add(transaction2);
	list.add(transaction3);
	list.add(transaction4);
	list.add(transaction5);
	
	customer.setTransactions(list);
	
	session.saveOrUpdate(customer);
		
		@SuppressWarnings("unchecked")
		Query<Customer> query = session.createQuery("from Customer c join fetch c.transactions as t");
		//  query.setParameter("id", 10); 
		 List<Customer> customers = query.list();
		 System.out.println(query.list().size());
		 for(Customer customer2 : customers) {
			 System.out.println(customer2);
		 }
		 
		  
		  
	/*	  @SuppressWarnings("unchecked")
		Iterator<Customer> iterator = query.list().iterator();
		  while(iterator.hasNext()) {
			  Customer customer2 =  iterator.next();*/
			/*
			 * System.out.println(customer2.getCustomerId());
			 * System.out.println(customer2.getTransactions());
			 */
		 // }
		  
		  
		/*
		 * for(String customer2:lists) { System.out.println(customer2); }
		 */
		 
/*	System.out.println("Criteria");
	@SuppressWarnings("deprecation")
	Criteria criteria = session.createCriteria(Customer.class);
	criteria.add(Restrictions.eq("customerId", 10));
	@SuppressWarnings("unchecked")
	List<Customer> lists1 = criteria.list();
	for(Customer customer2:lists1){ 
		System.out.println(customer2);
		}*/
	
	transactions.commit();
	session.close();
}
}
