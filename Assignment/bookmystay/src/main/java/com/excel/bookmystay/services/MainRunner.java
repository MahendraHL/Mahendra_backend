package com.excel.bookmystay.services;

import com.excel.bookmystay.entity.Accommodations;
import com.excel.bookmystay.entity.Bookings;
import com.excel.bookmystay.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookmystay");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		User user = new User();
		
		Bookings booking =new Bookings();
		
		Accommodations accommodate = new Accommodations();
		
		transaction.begin();
		manager.persist(transaction);
		transaction.commit();
		System.out.println("tables created");
	}

}
