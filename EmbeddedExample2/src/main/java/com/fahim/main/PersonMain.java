package com.fahim.main;

import com.fahim.dao.PersonDao;
import com.fahim.model.Address;
import com.fahim.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao dao = new PersonDao();
		Address address = new Address("dvdv", "dvdvd", "dbsdb", "55454");
		Address address1 = new Address("Nfsdbfsbf", "dbds", "bsdb", "scasc");
		Person person = new Person();
		person.getAddress().add(address);
		person.getAddress().add(address1);
		person.setName("Fahim");
		person.setAge(25);
		person.setContact(9870638627L);
		person.setEmail("fahnaus");
		dao.saveOrUpdatePerson(person);
		System.out.println("person added");
		//System.out.println(dao.getPerson(person));
	}

}
