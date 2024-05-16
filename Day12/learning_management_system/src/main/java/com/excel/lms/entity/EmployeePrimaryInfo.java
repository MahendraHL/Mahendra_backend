package com.excel.lms.entity;


import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_primary_info")
@Builder
public class EmployeePrimaryInfo {
	
	@Column(name="primary_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="emplopyee_id")
	private String employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="date_of_joining")
	private String dateOfJoining;
	
	@Column(name="date_of_birth")
	private String datoOfBirth;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Enumerated(EnumType.STRING)
	@Column(name="designation")
	private Designation designation;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="nationality")
	private String nationality;
	
	@Enumerated(EnumType.STRING)
	@Column(name="employee_status")
	private EmployeeStatus employeeStatus;
	
}
