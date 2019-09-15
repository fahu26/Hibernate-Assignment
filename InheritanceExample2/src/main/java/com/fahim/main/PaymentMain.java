package com.fahim.main;

import java.time.LocalDate;

import com.fahim.dao.PaymentDao;
import com.fahim.model.CardPayment;
import com.fahim.model.ChequePayment;

public class PaymentMain {
 public static void main(String args[]) {
	 
	 PaymentDao dao = new PaymentDao();
	 
//	 Payment payment = new Payment();
	 LocalDate date2 = LocalDate.of(2018,10,30);
	 
	 CardPayment cardPayment = new CardPayment();
	 cardPayment.setPaymentAmount(10000.0);
	 cardPayment.setPaymentDate(date2);
	 cardPayment.setCcv(458);
	 cardPayment.setExpiryMonth(10);
	 cardPayment.setExpiryYear(2022);
	 cardPayment.setCardNumber(5454615846513544L);
	 cardPayment.setCardType("Debit");
	 
	 ChequePayment chequePayment = new ChequePayment();
	 chequePayment.setPaymentDate(LocalDate.of(2018, 11, 05));
	 chequePayment.setPaymentAmount(500000.00);
	 chequePayment.setChequeNumber(12486258);
	 chequePayment.setChequeType("DD");
	 
	 dao.saveData(cardPayment);
	 dao.saveData(chequePayment);
	 
	 System.out.println(dao.getPaymentData(cardPayment));
	 System.out.println(dao.getPaymentData(chequePayment));
	 
	 
 }
}
