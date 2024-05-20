package com.excel.lms.entity;

import com.excel.lms.enums.Designation;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
@Table(name="experience")
public class Experience {
	
	@Column(name = "experience_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "company_name")
	private String companyName;

	@Column(name = "years_of_experience")
	private String yearsOfExperience;

	@Column(name = "date_of_joining")
	private String dateOfJoining;
	
	@Column(name = "date_of_relieving")
	private String dateOfRelieving;

	@Column(name = "designation")
	private Designation designation;
	
	@Column(name = "location")
	private String location;
	
	@JoinColumn(name="employee_id")
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;

}
