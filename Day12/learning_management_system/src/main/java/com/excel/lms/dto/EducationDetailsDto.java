package com.excel.lms.dto;

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

public class EducationDetailsDto {
	
	private Integer id;

	private String educationType;

	private String percentage;

	private String institutionName;

	private String universityName;

	private String state;

	private String email;

	private String yearOfPassing;

	private String designation;

	private String specialization;

}
