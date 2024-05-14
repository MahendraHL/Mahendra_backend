package com.excel.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
//		student.setId(2);
//		student.setName("Smith");
//		student.setMarks(67);
//		int insert=dao.insert(student);
//		System.out.println(insert);

		// update
//		student.setMarks(87);
//		student.setId(1);
//		student.setName("John");
//		dao.update(student);

//		Student stu = dao.delete(2);
//		System.out.println(stu);
		
//		Student stu =dao.getStudentById(1);
//		System.out.println(stu);
		
		List<Student> stu =dao.getStudent();
		stu.forEach(System.out::println);

	}
}
