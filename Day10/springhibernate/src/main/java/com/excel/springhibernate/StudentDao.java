package com.excel.springhibernate;

import java.util.List;

public interface StudentDao {
	
	int insert(Student student);
	Student update(Student student);
	Student delete(int id);
	Student getStudentById(int id);
	List<Student> getStudent();

}
