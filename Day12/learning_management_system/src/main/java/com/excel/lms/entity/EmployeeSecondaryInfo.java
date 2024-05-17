package com.excel.lms.entity;

import com.excel.lms.enums.MaritalStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Builder
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo {

	@Column(name = "secondary_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "pan_number")
	private String panNumber;

	@Column(name = "aadhar_number")
	private String aadharNumber;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "spouse_name")
	private String spouseName;

	@Column(name = "passport_number")
	private String passportNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "marital_status")
	private MaritalStatus maritalStatus;

	@JoinColumn(name="employee_id")
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
