package com.excel.lms.dto;

import com.excel.lms.enums.EducationType;

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

	private EducationType educationType;

	private String percentage;

	private String institutionName;

	private String universityName;

	private String state;

	private String yearOfPassing;

	private String specialization;

}
