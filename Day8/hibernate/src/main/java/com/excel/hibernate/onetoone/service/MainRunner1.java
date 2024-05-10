package com.excel.hibernate.onetoone.service;

import com.excel.hibernate.onetoone.entity.Mark;
import com.excel.hibernate.onetoone.entity.Student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner1 {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		Student1 student1 = new Student1();
		student1.setName("John");
		student1.setAge(24);
	
		
		Mark mark = new Mark();
		mark.setMarks(87);
		mark.setGrade("A");
		mark.setStudent1(student1);
		
		transaction.begin();
		manager.persist(student1);
		transaction.commit();
		
	}
}
