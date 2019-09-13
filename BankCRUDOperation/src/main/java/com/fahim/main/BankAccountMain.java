package com.fahim.main;

import java.time.LocalDateTime;

import com.fahim.dao.BankDao;
import com.fahim.model.BankAccount;
import com.fahim.model.BankAccountType;

public class BankAccountMain {

	public static void main(String[] args) {
		BankDao dao = new BankDao();
		LocalDateTime dateTime1 = LocalDateTime.of(2019, 8, 26, 20, 00);
		LocalDateTime dateTime2 = LocalDateTime.of(2019, 8, 28, 10, 00);
		BankAccount account =  new BankAccount(102, "Nausheen Shaikh", 5000.00,dateTime1,BankAccountType.CURRENT);
		BankAccount account1 =  new BankAccount(103, "Fathima", 100.00,dateTime2,BankAccountType.FIXED_DEPOSIT);
		BankAccount account2 =  new BankAccount(104, "Fahim Shaikh", 100.00,dateTime2,BankAccountType.SAVING);
		dao.saveOrUpdateAccount(account);
		dao.saveOrUpdateAccount(account1);
		dao.saveOrUpdateAccount(account2);
		System.out.println(dao.getbankAccount(101));
		dao.deleteBankAccount(103);
		System.out.println(dao.getbankAccount(103));
	}

}
