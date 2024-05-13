package com.excel.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excel.spring.collection.Employee;

public class MainRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/spring/collection/config.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
		System.err.println(employee1);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Phone number: " + employee1.getPhones());
		System.out.println("Skills: " + employee1.getSkills());
		System.out.println("Nominees: " + employee1.getNominees());

	}

}
