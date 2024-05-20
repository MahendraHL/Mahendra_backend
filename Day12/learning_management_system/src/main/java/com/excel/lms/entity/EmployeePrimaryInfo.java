package com.excel.lms.entity;


import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@Column(name="emplopyee_id", unique=true)
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
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<AddressDetails> address;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<Contact> contact;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<EducationDetails> educationDetails;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<Experience> experiences;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private BankDetails bankDetails;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private List<TechnicalSkills> technicalSkills;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
	private EmployeeSecondaryInfo employeeSecondaryInfo;
	
}
