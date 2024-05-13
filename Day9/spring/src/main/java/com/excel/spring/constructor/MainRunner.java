package com.excel.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/spring/constructor/config.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);

	}

}
