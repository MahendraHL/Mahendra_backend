package com.excel.hibernate.onetomany.service;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate.onetomany.entity.Laptop;
import com.excel.hibernate.onetomany.entity.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student2 s1 = new Student2();
		List<Laptop> laptops = new ArrayList<>();
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		
		l1.setBrand("Dell");
		l1.setSerialNo("Ajh4657");
		l1.setStudent(s1);
		
		l2.setBrand("Lenevo");
		l2.setSerialNo("Aedf8745");
		l2.setStudent(s1);
		
		l3.setBrand("Mac");
		l3.setSerialNo("Atgrt4667");
		l3.setStudent(s1);
		
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		
		
		
		s1.setName("King");
		s1.setAge(22);
		s1.setLaptops(laptops);
		
		transaction.begin();
		manager.persist(s1);
		transaction.commit();
		
		

	}

}
