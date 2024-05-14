package com.excel.springhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name="student")
public class Student {
	
	@Id
	@Column(name ="student_id")
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_marks")
	private int marks;
	

}
