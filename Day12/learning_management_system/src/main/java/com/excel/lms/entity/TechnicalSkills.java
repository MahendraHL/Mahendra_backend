package com.excel.lms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name="technical_skills")
public class TechnicalSkills {
	
	@Column(name = "skills_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "skill_type")
	private String skillType;

	@Column(name = "skill_rating")
	private String skillRating;

	@Column(name = "year_of_experience")
	private String yearOfExperience;
	
	@JoinTable(name="map_skill_employee",joinColumns = @JoinColumn(name="skills_id"),inverseJoinColumns = @JoinColumn(name="employee_id"))
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo> employeePrimaryInfos;

}
