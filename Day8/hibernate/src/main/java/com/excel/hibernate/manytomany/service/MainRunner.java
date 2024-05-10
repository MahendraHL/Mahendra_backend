package com.excel.hibernate.manytomany.service;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate.manytomany.entity.Book;
import com.excel.hibernate.manytomany.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book> books = new ArrayList<Book>();
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setTitle("Java");
		b2.setTitle("DBMS");
		b3.setTitle("Data Structures");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setName("John");
		student1.setBooks(books);
		
		student2.setName("King");
		student2.setBooks(books);
		
		student3.setName("Smith");
		student3.setBooks(books);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		b1.setStudents(students);
		b2.setStudents(students);
		b3.setStudents(students);
		
		transaction.begin();
		manager.persist(student1);
		transaction.commit();
		
		

	}

}
