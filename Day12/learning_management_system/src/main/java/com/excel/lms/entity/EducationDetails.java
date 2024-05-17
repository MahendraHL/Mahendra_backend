package com.excel.lms.entity;

import com.excel.lms.enums.EducationType;

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
import jakarta.persistence.ManyToOne;
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
@Table(name = "education_details")
@Builder
public class EducationDetails {

	@Column(name = "education_details_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "education_type")
	private EducationType educationType;

	@Column(name = "percentage")
	private String percentage;

	@Column(name = "institution_name")
	private String institutionName;
	
	@Column(name = "university_name")
	private String universityName;

	@Column(name = "state")
	private String state;

	@Column(name = "email")
	private String email;

	@Column(name = "year_of_passing")
	private String yearOfPassing;

	@Column(name = "designation")
	private String designation;

	@Column(name = "specialization")
	private String specialization;
	
	@JoinColumn(name="employee_id")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;

}
