package com.excel.lms.dto;

import com.excel.lms.enums.Designation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ExperienceDto {
	private Integer id;
	
	private String companyName;

	private String yearsOfExperience;

	private String dateOfJoining;

	private String dateOfRelieving;

	private Designation designation;

	private String location;

}
