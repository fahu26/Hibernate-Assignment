package com.fahim.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fahim.dao.CustomerDao;
import com.fahim.model.Customer;
import com.fahim.model.Transaction;

public class CustomerMain {
public static void main(String args[]) {
	CustomerDao dao = new CustomerDao();
	Customer customer = new Customer();
	customer.setCustomerName("john");
	customer.setCustomerContact(515464131L);
	customer.setCustomerEmail("assfs@email.com");
	
	Transaction transaction = new Transaction();
	transaction.setTransactionId("XT51541");
	transaction.setTransactionAmount(10000.00);
	transaction.setTransactionDate(LocalDate.of(2018, 10, 26));
	
	Transaction transaction1 = new Transaction();
	transaction1.setTransactionId("CT51541");
	transaction1.setTransactionAmount(90000.00);
	transaction1.setTransactionDate(LocalDate.of(2018, 11, 9));
	
	List<Transaction> list = new ArrayList<Transaction>();
	list.add(transaction);
	list.add(transaction1);
	
	customer.setTransactions(list);
	
	dao.saveOrUpdateData(customer);
	System.out.println(dao.getDetails(customer));
}
}
