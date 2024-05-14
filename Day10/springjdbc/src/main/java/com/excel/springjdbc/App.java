package com.excel.springjdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao dao=context.getBean("studentDao",StudentDao.class);
		Student student = new Student();
//		student.setId(2);
//		student.setName("King");
//		student.setCity("Mysore");
//		
//		int insert = dao.insert(student);
//		System.out.println(insert);

		
//		int update = dao.updateData(new Student(1,"Oliver","Bangalore"));
//		System.out.println(update);
		
//		student.setId(2);
//		int delete = dao.delete(student);
//		System.out.println(delete);
		
//		List<Map<String, Object>> select = dao.select(student);
	
		
		
		
	}
}
