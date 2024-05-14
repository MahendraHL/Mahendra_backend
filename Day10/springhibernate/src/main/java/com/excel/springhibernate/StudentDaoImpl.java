package com.excel.springhibernate;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	@Transactional
	public Student update(Student student) {
		this.hibernateTemplate.saveOrUpdate(student);
		return student;
	}

	@Transactional
	public Student delete(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
		return student;
	}

	@Transactional
	public Student getStudentById(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Transactional
	public List<Student> getStudent() {
		List<Student> list = new ArrayList<Student>();
		list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}

}
