package com.fahim.main;

import com.fahim.dao.PersonDao;
import com.fahim.model.Address;
import com.fahim.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao dao = new PersonDao();
		Address address = new Address("Mannady", "Chennai", "TamilNadu", "600001");
		Person person = new Person("fahim", 25, "fahnaus@email.com", 9870638627L, address);
		dao.saveOrUpdatePerson(person);
		System.out.println("person added");
		System.out.println(dao.getPerson(person));
	}

}
